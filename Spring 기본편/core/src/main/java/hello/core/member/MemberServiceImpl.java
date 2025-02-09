package hello.core.member;

public class MemberServiceImpl implements MemberService {

    //private MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository; //MemberServiceImpl은 추상화에만 의존함

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
        //private MemberRepository memberRepository = new MemoryMemberRepository();와 비슷한 의미
        //MemberRepository에 구현체가 무엇이 들어갈 것인지는 생성자를 통해선색
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //테스트용
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
