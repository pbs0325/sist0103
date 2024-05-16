package hello.boot;

import java.util.List;
import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolloTestController {
	
	@GetMapping("/shop/list")
	public List<ShopDto> list()
	{
		List<ShopDto> list=new Vector<>();
		
		ShopDto s1=new ShopDto();
		s1.setShop("과일");
		s1.setDan(3);
		s1.setSu(4);
		list.add(s1);
		
		return list;
	}
	
}
