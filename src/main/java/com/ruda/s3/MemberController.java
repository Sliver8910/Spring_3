package com.ruda.s3;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ruda.s3.model.board.MemberVO;
import com.ruda.s3.service.board.MemberService;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	@Inject
	private MemberService memberService;
	
	//Join Get
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET) 
	public String memberJoin()throws Exception{
		
		return "member/memberJoin";
	}
	
	//Join Post
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST) 
	public ModelAndView memberJoin(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = memberService.memberInsert(memberVO);
		String message = "MemberJoin Fail";
		if(result>0) {
			message = "MemberJoin Success";
		}
		mv.addObject("msg", message);
		mv.addObject("path", "../notice/noticeList");
		mv.setViewName("common/common_result");
		return mv;
	}
	
	//Login get
	@RequestMapping(value = "memberLogin", method = RequestMethod.GET)
	public String memberLogin()throws Exception{
		return "member/memberLogin";
	}
	
	//Login Post
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public ModelAndView memberLogin(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO = memberService.memberSelect(memberVO);
		
		if(memberVO !=null) {
			mv.addObject("dto", memberVO);
			mv.setViewName("../");
		}else {
			mv.addObject("msg", "Login Fail");
			mv.addObject("path", "./memberLogin");
			mv.setViewName("common/common_result");
		}
		
		
		
		return mv;
	}

}
