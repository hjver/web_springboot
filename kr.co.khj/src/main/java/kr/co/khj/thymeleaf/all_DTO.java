package kr.co.khj.thymeleaf;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import lombok.Data;

//Datebase 저장과 관계없는 DTO
@Data
@Repository("all_DTO")
public class all_DTO {
	ArrayList<String> memus;
}
