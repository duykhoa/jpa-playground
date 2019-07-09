//package kevintran.ninja.jpa_playground.entity;
//
//import javax.persistence.*;
//
//@Entity
//public class Service {
//    @Id
//    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long serviceNo;
//
//    @Column(name = "NAME")
//    private String name;
//
//    private Member member;
//
//    public Service() {
//    }
//
//    public Service(String name, Member member) {
//        this.name = name;
//        this.member = member;
//    }
//
//    public long getServiceNo() {
//        return serviceNo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
////
////    @ManyToOne
////    @JoinTable(name = "MEMBERSERVICE", joinColumns = { @JoinColumn(name = "MEMBERID") }, inverseJoinColumns = { @JoinColumn(name = "SERVICEID") })
////    public Member getMember() {
////        return member;
////    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }
//}
