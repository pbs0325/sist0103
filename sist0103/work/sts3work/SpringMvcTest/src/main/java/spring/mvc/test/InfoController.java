package spring.mvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class InfoController {

	@GetMapping("/myform")
	public String myform()
	{
		return "info/infoform"; //WEB-INF/info/infoform.jsp
	}
	
	@PostMapping("/read")
	public String result(@ModelAttribute("dto") InfoDto dto)
	{
		
		return "info/infowrite";
	}
}
