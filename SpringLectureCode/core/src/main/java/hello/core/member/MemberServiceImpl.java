package hello.core.member;

import hello.core.discount.DiscountPolicy;
import hello.core.order.OrderService;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // @Configration의 싱글톤 보장 테스트를 위한 코드
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
