package models;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Restaurants implements Comparable<Restaurants> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;//0
    @Column
    private  String longitude;//1
    @Column
    private String latitude;//2
    @Column
    private String RestName;//3
    @Column
    private String StreetName;//4
    @Column
    private String Address;//5
    @Column
    private String Phone;//6
    @Column
    private String Email;//7
    @Column
    private String HomePage;//8
    @Column
    private String FaceBook;//9
    @Column
    private Time otime;//10
    @Column
    private Time ctime;//11
    @Column
    private String image;//12
    @Column
    private Boolean Popular;//13
    @Column
    private String Description;//14
    @Column
    private String Highlights;//15
    @Column
    private String Cuisines;//16
    @Column
    private String open ;//17
    @Column
    private Integer Cost ;//18

    public Restaurants() {
    }

    public Restaurants(Integer id, String longitude, String latitude, String restName, String streetName, String address, String phone, String email, String homePage, String faceBook, Time otime, Time ctime, String image, Boolean popular, String description, String highlights, String cuisines, String open, Integer cost) {
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
        Description = description;
        Highlights = highlights;
        Cuisines = cuisines;
        this.open = open;
        Cost = cost;
    }

    public Integer getCost() {
        return Cost;
    }

    public void setCost(Integer cost) {
        Cost = cost;
    }

    public String getHighlights() {
        return Highlights;
    }

    public void setHighlights(String highlights) {
        Highlights = highlights;
    }

    public String getCuisines() {
        return Cuisines;
    }

    public void setCuisines(String cuisines) {
        Cuisines = cuisines;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
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
