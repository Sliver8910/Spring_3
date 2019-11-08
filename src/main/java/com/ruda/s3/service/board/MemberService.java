package com.ruda.s3.service.board;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ruda.s3.dao.board.MemberDAO;
import com.ruda.s3.model.board.MemberVO;

@Service
public class MemberService {
	@Inject
	private MemberDAO memberDAO;
	//멤버인서트
	public int memberInsert(MemberVO memberVO) throws Exception{
		return memberDAO.memberInsert(memberVO);
	}
	
	//멤버 업데이트
	public int memberUpdate(MemberVO memberVO)throws Exception{
		return memberDAO.memberUpdate(memberVO);
	}
	//멤버 로그인
	public MemberVO memberSelect(MemberVO memberVO)throws Exception{
		return memberDAO.memberSelect(memberVO);
	}
	//멤버 삭제
	public int memberDelete(String id) throws Exception{
		return memberDAO.memberDelete(id);
	}

}
