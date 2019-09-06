package comm.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import comm.example.spring.model.HelloWorldModel;

@Controller
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET,name="/showView")
	public String showHelloWorldForm()
	{
		return "helloworld-form";
	}
	
//	@RequestMapping(method = RequestMethod.POST, name="/processForm")
//	public String processStudentForm()
//	{
//		return "hello-world";
//	}
	
	
	//using model class fetching the data and same implementation
	
	@RequestMapping(method = RequestMethod.POST, name="/processForm")
	public String processStudentForm(@RequestParam("studentName") String name, @RequestParam("email") String email ,Model model)
	{
		HelloWorldModel object = new HelloWorldModel(name, email);
		model.addAttribute("objectForm", object);
		
		return "hello-world";
	}
	

}
