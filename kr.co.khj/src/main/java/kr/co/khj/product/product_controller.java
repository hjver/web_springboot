package kr.co.khj.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class product_controller {

	@GetMapping("/product.do")
	public String product(Model m) {
		String product="냉장고";
		m.addAttribute("product", product);
		return null;
	}
}
