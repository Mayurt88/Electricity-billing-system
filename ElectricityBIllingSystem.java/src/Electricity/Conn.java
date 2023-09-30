package Electricity;



import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

    Connection c;
    public java.sql.Statement s;

    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "root");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Conn(String string) {
    }

}



