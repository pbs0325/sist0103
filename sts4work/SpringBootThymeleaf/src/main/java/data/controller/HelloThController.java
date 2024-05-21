package data.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import data.dto.ShopDto;
import jakarta.servlet.http.HttpSession;

@Controller
public class HelloThController {
	
	List<ShopDto> list=new ArrayList<>();
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/hello1")
	public String hello1(Model model)
	{
		System.out.println("hello1 controller");
		
		model.addAttribute("message","Have a Nice Day!!!");
		model.addAttribute("today",new Date());
		
		ShopDto dto=ShopDto.builder()
				.num(100)
				.sangpum("요가매트")
				.dan(25000)
				.color("black")
				.build();
		
		model.addAttribute("dto",dto);
		
		return "hello1";
	}
	
	@GetMapping("/hello2")
	public String hello2(String name, int age, Model model)
	{
		model.addAttribute("hello2_msg",name+"님의 나이는"+age+"세 입니다");
		return "hello2";
	}
	
	@GetMapping("/list")
	public String list(Model model)
	{
		list.add(new ShopDto(1,"따릉이",10,8000,"black"));
		list.add(new ShopDto(2,"알사탕",8,72000,"red"));
		list.add(new ShopDto(3,"박달사탕",6,32000,"green"));
		list.add(new ShopDto(4,"라면사리",16,16000,"yellow"));
		ShopDto dto5=ShopDto.builder()
				.num(5)
				.sangpum("텀블러")
				.su(8)
				.dan(25000)
				.color("silver")
				.build();
		
		list.add(dto5);
		
		model.addAttribute("list",list);
		return "list";
	}
	
	@GetMapping("/detail")
	private String detail(@RequestParam int index, Model model) {
		model.addAttribute("dto",list.get(index));
		return "detail";
		// TODO Auto-generated method stub

	}
	
	@GetMapping("/login")
	public String login(HttpSession session)
	{
		session.setAttribute("myid", "admin");
		return "login";
	}
	
	
}
