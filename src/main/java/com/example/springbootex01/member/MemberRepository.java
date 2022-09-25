package com.example.springbootex01.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
