package sk;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	
	@RequestMapping("/test")
	public String index1(){
		return "index_temp.html";
	}
	
	@RequestMapping("/test3")
	public String index33(){
		System.out.println("test3");
		return "index_temp.html";
	}
	
	@RequestMapping("/test2")
	public String index3322(){
		System.out.println("test3");
		return "index_temp2.html";
	}
	
	@RequestMapping("/test4")
	public String index4(){
		System.out.println("test3");
		return "index_3.html";
	}
	
	@RequestMapping("/yeobi11")
	public String yeob(){
		return "yeobi.html";
	}
}
