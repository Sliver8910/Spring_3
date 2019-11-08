package com.ruda.s3.dao.board;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ruda.s3.model.board.MemberVO;

@Repository
public class MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE = "memberMapper."; 
	
	//멤버 가입
	public int memberInsert(MemberVO memberVO)throws Exception{
		return sqlSession.insert(NAMESPACE+ "memberInsert" , memberVO);
		
	}
	//회원 탈퇴
	public int memberDelete(String id)throws Exception{
		return sqlSession.delete(NAMESPACE+ "memberDelete", id);
		
	}
	//멤버 로그인(하나의 정보)
	public MemberVO memberSelect(MemberVO memberVO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"memberSelect", memberVO);
	}
	//멤버 정보 업데이트
	public int memberUpdate(MemberVO memberVO) throws Exception{
		return sqlSession.update(NAMESPACE+"memberUpdate", memberVO);
	}
}
