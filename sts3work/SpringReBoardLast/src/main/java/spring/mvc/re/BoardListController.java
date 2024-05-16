package spring.mvc.re;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.data.BoardDaoInter;

@Controller
public class BoardListController {

	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/")
	public String start()
	{
		return "redirect:board/list";
	}
	
	@GetMapping("/board/list")
	public ModelAndView list()
	{
		ModelAndView mview=new ModelAndView();
		int totalCount=dao.getTotalCount();
		mview.addObject("totalCount", totalCount);
		mview.setViewName("board/boardlist");
		return mview;
	}
}
