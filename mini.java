package mini;
import java.sql.*;

public class mini {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/miniproj";
        String username = "root";
        String pwd = "Prabha@100";
        String query = "SELECT * FROM getdata"; 

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, pwd);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt("id");
            String usernameFromDB = rs.getString("username");
            String email = rs.getString("email");
            String password = rs.getString("password");

            System.out.println("ID: " + id);
            System.out.println("Username: " + usernameFromDB);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println("-------------------");
        }

        rs.close();
        st.close();
        con.close();
    }
}



