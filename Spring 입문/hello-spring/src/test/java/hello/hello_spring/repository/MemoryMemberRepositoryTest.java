package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("hello");
        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        //Assertions.assertThat(member).isEqualTo(result);
        Assertions.assertEquals(member, result);

        //Assertions.assertEquals(member, null); 이렇게 하면 빨간불==실패

        //System.out.println("result: " + (result == member)); 이렇게 하면 출력으로 나옴

    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("hello");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("hello2");
        repository.save(member2);

        Member result = repository.findByName("hello").get();

        Assertions.assertEquals(member1, result);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("hello");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("hello2");
        repository.save(member2);

        List<Member> members = repository.findAll();

        Assertions.assertEquals(2, members.size());
    }
}
