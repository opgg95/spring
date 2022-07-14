package com.koreait.core.member.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.midi.Sequence;

import org.springframework.stereotype.Repository;

import com.koreait.core.member.dto.Member;

//@Repository
public class MemoryMemberRepository implements MemberRepository  {

	// 메모리 사용 - static
	private static Map<Integer, Member> store = new HashMap<Integer, Member>();
	private static int sequence = 0;
	
	
	
	@Override
	public Member save(Member member) {
		member.setId(++sequence);
		store.put(member.getId(), member);
		return member;
	}

	@Override
	public List<Member> findAll() {
		return new ArrayList<Member>(store.values());
	}

}
