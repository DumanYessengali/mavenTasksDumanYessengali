package kz.aitu.project.entity;

import java.sql.*;

public class Student {
    public static void getStudent() {
        String SQL_SELECT = "SELECT * FROM students ";
        try (Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "1234");
             PreparedStatement prepStatement = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = prepStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("stu_id")+ "  "+ resultSet.getString("stu_name") + "  " + resultSet.getString("stu_phone"));
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        getStudent();
    }
}
