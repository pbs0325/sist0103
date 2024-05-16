package string.day0507.rainy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhotoUploadController {

	@GetMapping("/board/uploadform1")
	public String uform1()
	{
		return "board/uploadform1";	
	}
	
	@PostMapping("/board/upload1")
	public ModelAndView read1(
				@RequestParam String title,
				@RequestParam MultipartFile photo,
				HttpServletRequest request)
	{
		ModelAndView mview=new ModelAndView();
		
		//���ε��� ������� ���ϱ�
		String path=request.getSession().getServletContext().getRealPath("/WEB-INF/image");
	}
	//���ε��� 1�� ����
}