//package kevintran.ninja.jpa_playground.entity;
//
//import javax.persistence.*;
//
//@Entity
//public class Member {
//    @Id
//    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column(name = "NAME")
//    private String name;
//
//    @Column(name = "EMAIL")
//    private String email;
//
//    @Column(name = "STREETADDRESS")
//    private String streetAddress;
//
//    @Column(name = "CONTACTNO")
//    private String contactno;
//
//    @Column(name = "BIOLOGY")
//    private String biology;
//
//    @Column(name = "SUBURB")
//    private String suburb;
//
//    protected Member() {};
//
//    public Member(String name, String email, String streetAddress, String contactno, String biology, String suburb) {
//        this.name = name;
//        this.email = email;
//        this.streetAddress = streetAddress;
//        this.contactno = contactno;
//        this.biology = biology;
//        this.suburb = suburb;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getStreetAddress() {
//        return streetAddress;
//    }
//
//    public void setStreetAddress(String streetAddress) {
//        this.streetAddress = streetAddress;
//    }
//
//    public String getContactno() {
//        return contactno;
//    }
//
//    public void setContactno(String contactno) {
//        this.contactno = contactno;
//    }
//
//    public String getBiology() {
//        return biology;
//    }
//
//    public void setBiology(String biology) {
//        this.biology = biology;
//    }
//
//    public String getSuburb() {
//        return suburb;
//    }
//
//    public void setSuburb(String suburb) {
//        this.suburb = suburb;
//    }
//}
