package kr.co.khj.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class main2_controller {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="user_DTO")
	user_DTO dto;
	
	@GetMapping("/testaop2.do")
	public String testaop2() {
		this.log.info("test2aop2.do 실행");
		return null;
	}
	
	@GetMapping("/testaop.do")
	public String testaop(Model m) {
		
		String mid = "hong";
		String mname = "홍길동";
		String memail = "hong@nate.com";
		String minout = "login";
		this.dto.setMID(mid);
		this.dto.setMNAME(mname);
		this.dto.setMEMAIL(memail);
		this.dto.setMINOUT(minout);
		
		if(mid.equals("hong")) {
			this.log.info("본코드에서 아이디를 확인하였습니다.");
		}
		
		m.addAttribute("mname", mname);
		return null;
	}
	
	@GetMapping("/testaop_logout.do")
	public String testaop_logout(Model m, 
			@SessionAttribute(name="userid", required = false) String mid,
			HttpServletRequest req) {
		HttpSession hs = req.getSession();
		hs.invalidate();
		this.dto.setMID(mid);
		String minout = "logout";
		this.dto.setMINOUT(minout);
		return null;
	}
}
