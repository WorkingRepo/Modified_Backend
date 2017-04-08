package models;

import javax.persistence.*;


@Entity
public class Suggestions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String RName;
    @Column
    private String Address;


    public Suggestions() {
    }

    public Suggestions(Integer id, String RName, String address) {
        this.id = id;
        this.RName = RName;
        Address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRName() {
        return RName;
    }

    public void setRName(String RName) {
        this.RName = RName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
