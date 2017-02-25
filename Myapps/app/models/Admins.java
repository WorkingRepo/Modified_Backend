package models;

import javax.persistence.*;



/**
 * Created by kakhila on 1/10/17.
 */
@Entity
public class Admins {
   // @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Integer id;
    @Id
    private  String Email;


    @Column
    private String Name;
    @Column
    private String Password;


    public Admins() {
    }

    public Admins( String email, String name, String password) {
       // this.id = id;
        Email = email;
        Name = name;
        Password = password;
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

  /*  public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    */


}
