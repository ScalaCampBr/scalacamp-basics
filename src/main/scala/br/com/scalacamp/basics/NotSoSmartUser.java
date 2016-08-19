package br.com.scalacamp.basics;

import java.util.Date;

/**
 * Java constructors.
 */
public class NotSoSmartUser {

    private int id;

    private String userName;

    private Date joined;

    public NotSoSmartUser(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public NotSoSmartUser(int id, String userName, Date joined) {
        this(id, userName);
        this.joined = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }
}
