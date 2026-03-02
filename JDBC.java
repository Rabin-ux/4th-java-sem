import java.sql.*;

class JDBC {
    public static void main(String[] args) {
        // Updated to use the database name 'Classwork_Rabin' seen in your Workbench screenshot
        String url = "jdbc:mysql://localhost:3306/Classwork_Rabin"; 
        String username = "root"; // As requested
        String password = "Rabin123@#"; // As requested
        String query = "SELECT name FROM students"; // Matches your Workbench table 'students'

        // Using try-with-resources to fix the "unreported exception" errors in your screenshot
        try {
            // Load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            try (Connection con = DriverManager.getConnection(url, username, password);
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(query)) {

                System.out.println("Connection Established successfully");

                // Process the results
                while (rs.next()) {
                    // Retrieves data from the 'name' column as defined in your Workbench
                    String name = rs.getString("name"); 
                    System.out.println("Student Name: " + name);
                }
            } 
            System.out.println("Connection Closed....");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}