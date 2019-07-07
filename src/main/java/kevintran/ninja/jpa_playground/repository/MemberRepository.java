package kevintran.ninja.jpa_playground.repository;

import kevintran.ninja.jpa_playground.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

}
