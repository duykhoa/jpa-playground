//package kevintran.ninja.jpa_playground.Controller;
//
//import com.github.javafaker.Faker;
//import kevintran.ninja.jpa_playground.entity.Member;
//import kevintran.ninja.jpa_playground.entity.Service;
//import kevintran.ninja.jpa_playground.repository.MemberRepository;
//import kevintran.ninja.jpa_playground.repository.ServiceRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HomeController {
//    @Autowired
//    private MemberRepository memberRepository;
//    @Autowired
//    private ServiceRepository serviceRepository;
//
//    @RequestMapping("/sayhi")
//    public Member sayhi() {
//        Faker faker = new Faker();
//        Member m1 = new Member(
//                faker.name().fullName(),
//                faker.bothify("\"????##@gmail.com\""),
//                faker.address().streetAddress(),
//                faker.phoneNumber().cellPhone(),
//                faker.lorem().paragraph(),
//                faker.address().cityName()
//        );
//
//        Member savedm1 = memberRepository.save(m1);
//
//        Service service = new Service(
//                faker.funnyName().name(),
//                savedm1
//        );
//
//        serviceRepository.save(service);
//
//        return savedm1;
//    }
//}
