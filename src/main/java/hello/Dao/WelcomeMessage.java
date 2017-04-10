package hello.Dao;


import java.sql.Time;
import java.util.Date;

public class WelcomeMessage {


    private Date timestamp;

    public WelcomeMessage(){

        this.timestamp = new Date();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp() {
        this.timestamp = new Date();
    }
}
