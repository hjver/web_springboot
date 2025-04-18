package kr.co.khj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Repository => Controller @Resource로 로드하여 실행시킬 수 있음

@Service
@Repository("membership_service2")
public class membership_service2 {

	@Autowired
	private mapper mp;
	
	//사용자 아이디에 맞는 데이터 한개의 값 가져오는 메소드
	List<membership_dto> onedata(String MID){
		List<membership_dto> one = this.mp.onedata(MID);
		return one;
	}
}
