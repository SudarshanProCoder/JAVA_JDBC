import java.sql.*;

class Create {
    public static void main(String args[]) {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "date@2004");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from employeeInfo");
            while (rs.next())
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3));

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}