package com.kh.Mybatis;


import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOService implements MemberDAO {

	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<Member> getMembers() {
		// TODO Auto-generated method stub
		
		ArrayList<Member> result = new ArrayList<Member>();
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		
		//getMembers()의 메소드명과 mapper.mxl과 id는 동일해야한다.
		
		result = memberMapper.getMembers();
	
		return result;
	}

	@Override
	public void insertMember(Member member) {
		// TODO Auto-generated method stub
		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		memberMapper.insertMember(member);
	}

	@Override
	public void updateMember(String name) {
		// TODO Auto-generated method stub		
		
		//MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		//memberMapper.updateMember(name);
	}

	@Override
	public void deleteMember(String name) {
		// TODO Auto-generated method stub
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		memberMapper.deleteMember(name);
		
	}

		
	
}
