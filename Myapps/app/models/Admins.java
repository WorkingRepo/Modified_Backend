package models;

import javax.persistence.*;


@Entity
public class Admins {

    @Id
    private String Email;
    @Column
    private String Name;
    @Column
    private String Password;
    @Column
    private String Token;



    public Admins() {
    }

    public Admins(String email, String name, String password, String token) {
        Email = email;
        Name = name;
        Password = password;
        Token = token;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}
