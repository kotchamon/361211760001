package Lab10;

import java.sql.*;

public class myDatabase {
    public static void main(String[] args) {
       // connetDB();
        myDatabase myConnect = new myDatabase();
        myConnect.selectall();
    }//main
    private void selectall () {
        String sql = "select * from user";
        try {
            Connection conn = this.connetct();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //loop for result set
            while (rs.next()) {
                System.out.println(rs.getInt("ID")+"\t"+
                rs.getString("name")+"\t"+
                rs.getString("lastname"));
            }//while
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private Connection connetct(){
        Connection conn = null;
        try {
            //db parameters
            String url = "jdbc:sqlite:C:\\Users\\User\\IdeaProjects\\361211760001\\src\\Lab10\\myData.db";

        }
    }

    private static void connetDB() {
        Connection conn = null;
        try {
            //db parameters
            String url = "jdbc:sqlite:C:\\Users\\User\\IdeaProjects\\361211760001\\src\\Lab10\\myData.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Database is connected.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Can not connecting to Database.");
        }finally {
            try {
                if (conn != null)
                    conn.close();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }//connetDB
}//class
