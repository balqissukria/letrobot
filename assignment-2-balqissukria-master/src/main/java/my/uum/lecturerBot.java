/**
 * @author Balqis Binti Sukria
 * This class implements a Telegram bot that interacts with users and provides information about lecturers stored in a database.
 * The bot extends the TelegramLongPollingBot class, which is provided by the Telegram Bot API.
 */


package my.uum;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.sql.*;


public class lecturerBot extends TelegramLongPollingBot {

    // Database URL
    private static final String DB_URL = "jdbc:sqlite:/Users/balqissukria/lecturersoc.db";
    private boolean search = false;
    private boolean isContinuing = false;
    private String lecturerName = "";

    /**
     * This method is called whenever a new update is received by the bot.
     * It processes the received message and sends an appropriate response.
     *
     * @param update The update received from the Telegram API.
     */
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId());

            // Handle the "/start" command
            if (messageText.equals("/start")) {
                search = true;
                response.setText("Hello welcome to LectroBot 🤖! Which lecturer do you want to search for?");

            }
            // Handle the "/count" command
            else if (messageText.equals("/count")) {
                int count = countLecturers();
                response.setText("The total number of lecturers in the database is: " + count);
            }
            // Handle the "/list" command
            else if (messageText.equals("/list")) {
                String lecturerList = getAllLecturers();
                response.setText(lecturerList);
            }
            // Search for a lecturer
            else if (search) {
                lecturerName = messageText;
                search = false;
                // Check if the lecturer exists
                String fullName = getLecturerFullName(lecturerName);
                if (fullName != null) {
                    response.setText("Are you searching for " + fullName + "?\n1. Yes\n2. No");
                }
                else {
                    response.setText("Lecturer not found.\nDo you want to continue? \n1.Yes\n2.No");
                    isContinuing = true;
                }
                // Continue searching or exit
            } else if (isContinuing) {
                isContinuing = false;
                if (messageText.equalsIgnoreCase("yes") || messageText.equals("1")) {
                    search = true;
                    response.setText("Enter the name of the lecturer you want to find");
                } else if (messageText.equalsIgnoreCase("no")||messageText.equalsIgnoreCase("2")) {
                    response.setText("Thank you for using LectroBot🤖");
                } else {
                    response.setText("Invalid input. Please try again.");
                    isContinuing = true;

                }
            }
            // Process the response to the lecturer search confirmation
            else {
                if (messageText.equalsIgnoreCase("1")||messageText.equalsIgnoreCase("yes")) {
                    String result = searchLecturer(lecturerName);
                    response.setText(result + "\n\nDo you want to continue searching? \n1.Yes \n2.No");
                    isContinuing = true;
                } else if (messageText.equalsIgnoreCase("2")|| messageText.equalsIgnoreCase("no")) {
                    search = true;
                    response.setText("Enter the name of the lecturer you want to find");
                } else {
                    response.setText("Invalid input. Please try again.");


                }
            }

            try {
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Retrieves the list of all lecturers in the database.
     *
     * @return The list of lecturers as a formatted string.
     */
    private String getAllLecturers() {
        StringBuilder lecturerList = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT name FROM lecturersoc")) {

            int count = 1;
            while (rs.next()) {
                String lecturerName = rs.getString("name");
                lecturerList.append(count).append(". ").append(lecturerName).append("\n");
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (lecturerList.length() == 0) {
            lecturerList.append("No lecturers found.");
        }

        return "List of Lecturers:\n" + lecturerList.toString();
    }

    /**
     * Retrieves the full name of a lecturer based on the input name.
     *
     * @param lecturerName The input name of the lecturer.
     * @return The full name of the lecturer, or null if not found.
     */
    private String getLecturerFullName(String lecturerName) {
        String fullName = null;


        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement stmt = conn.prepareStatement("SELECT name FROM lecturersoc WHERE name LIKE ?")) {
            stmt.setString(1, "%" + lecturerName + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                fullName = rs.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return fullName;
    }

    /**
     * Searches for a lecturer in the database and returns the lecturer's information.
     *
     * @param lecturerName The name of the lecturer to search for.
     * @return The information of the lecturer and nearby lecturers, if found.
     */
    private String searchLecturer(String lecturerName) {
        String roomNumber = "";
        String staffId = "";
        String fullName = "";


        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement stmt = conn.prepareStatement("SELECT id, room_number, name FROM lecturersoc WHERE name LIKE ?")) {
            stmt.setString(1, "%" + lecturerName + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                staffId = rs.getString("id");
                roomNumber = rs.getString("room_number");
                fullName = rs.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        if (!staffId.isEmpty()) {
            StringBuilder nearbyLecturers = new StringBuilder();
            try (Connection conn = DriverManager.getConnection(DB_URL);
                 PreparedStatement stmt = conn.prepareStatement("SELECT name, room_number FROM lecturersoc WHERE room_number != ? ORDER BY ABS(room_number - ?) ASC LIMIT 5")) {
                int roomNum = Integer.parseInt(roomNumber);
                stmt.setInt(1, roomNum);
                stmt.setInt(2, roomNum);
                ResultSet rs = stmt.executeQuery();
                int count = 1;
                while (rs.next()) {
                    String nearbyLecturerName = rs.getString("name");
                    String nearbyLecturerRoomNumber = rs.getString("room_number");
                    nearbyLecturers.append(count++).append(".\nName: ").append(nearbyLecturerName).append("\nRoom: ").append(nearbyLecturerRoomNumber).append("\n");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


            return "Staff ID:" + staffId + "\nName: " + fullName + "\nRoom: " + roomNumber +
                    "\n\nNearby Lecturers:\n" + (nearbyLecturers.length() > 0 ? nearbyLecturers : "-");
        } else {
            return "Lecturer not found.";
        }
    }

    /**
     * Counts the number of lecturers in the database.
     *
     * @return The total number of lecturers in the database.
     */
    private int countLecturers() {
        int count = 1;


        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS count FROM lecturersoc")) {


            if (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }


    /**
     * Get the username of the bot.
     *
     * @return The bot's username.
     */
    @Override
    public String getBotUsername() {
        return "s279865_bot";
    }

    /**
     * Get the token of the bot.
     *
     * @return The bot's token.
     */
    @Override
    public String getBotToken() {
        return "6049599503:AAGxHS8ATVNhoKGmRXz9P1L_bIjYX4YbhbM";
    }


}
