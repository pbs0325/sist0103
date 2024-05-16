package spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {

	//3���� �����ּҸ� �������� �ּҷ� ����ǰ� ����� ������� �ش� ������� jsp���Ͽ��� ��Ÿ���� �մϴ�
	
	@GetMapping("/happy")
	public String happy()
	{
		
		
		return "nice"; //WEB-INF/data/nice.jsp
	}
	
	@GetMapping("/hello")
	public String hello(Model model)
	{
		model.addAttribute("msg", "2������_�޼����� �̹������");
		
		return "hello";
	}
	
	@GetMapping("/nice/like")
	public String nice(Model model)
	{
		model.addAttribute("name", "�̼���");
		model.addAttribute("hp", "010-111-1234");
		model.addAttribute("addr", "�����");
		
		return "happy";
	}
	
	
}
