package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 저장이 된다.
    Member save(Member member);
    // optional null 값 같은 예외처리 방법인 듯하다. 찾는 방법
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    // 저장된 회원 모두를 리스트로 반환
    List<Member> findAll();
}
