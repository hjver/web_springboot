package kr.co.khj;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.khj.aop.user_DTO;

@Mapper
public interface cdn_mapper {
	int cdn_insert(file_DTO dto);
	public List<file_DTO> cdn_select(Map<String, Object> map);
	//CDN에 파라미터값을 대입하여 해당 이미지에 대한 실제 경로를 
	public List<file_DTO> cdn_image(String APINO);
	int cdn_delete(String AIDX);
	
	//AOP log insert
	public int log_table(user_DTO dto);
}
