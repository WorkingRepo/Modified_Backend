package models;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Restaurants implements Comparable<Restaurants> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private  String longitude;
    @Column
    private String latitude;
    @Column
    private String RestName;
    @Column
    private String StreetName;
    @Column
    private String Address;
    @Column
    private String Phone;
    @Column
    private String Email;
    @Column
    private String HomePage;
    @Column
    private String FaceBook;
    @Column
    private Time otime;
    @Column
    private Time ctime;
    @Column
    private String image;
    @Column
    private Boolean Popular;

    public Restaurants() {
    }

    public Restaurants(Integer id, String longitude, String latitude, String restName, String streetName, String address, String phone, String email, String homePage, String faceBook, Time otime, Time ctime, String image, Boolean popular) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        RestName = restName;
        StreetName = streetName;
        Address = address;
        Phone = phone;
        Email = email;
        HomePage = homePage;
        FaceBook = faceBook;
        this.otime = otime;
        this.ctime = ctime;
        this.image = image;
        Popular = popular;
    }

    public Boolean getPopular() {
        return Popular;
    }

    public void setPopular(Boolean popular) {
        Popular = popular;
    }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getRestName() {
        return RestName;
    }

    public void setRestName(String restName) {
        RestName = restName;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getHomePage() {
        return HomePage;
    }

    public void setHomePage(String homePage) {
        HomePage = homePage;
    }

    public String getFaceBook() {
        return FaceBook;
    }

    public void setFaceBook(String faceBook) {
        FaceBook = faceBook;
    }

    public Time getOtime() {
        return otime;
    }

    public void setOtime(Time otime) {
        this.otime = otime;
    }

    public Time getCtime() {
        return ctime;
    }

    public void setCtime(Time ctime) {
        this.ctime = ctime;
    }

    @Override
    public int compareTo(Restaurants rests)
    {
        return RestName.compareToIgnoreCase(rests.RestName);
    }
}
