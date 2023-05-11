package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

//	Using Model Obejct
	@RequestMapping("/home")
	public String home(Model model) {

		System.out.println("This is home Page");

		model.addAttribute("name", "Pratik Jangam");
		model.addAttribute("id", 2268584);
		List<String> friends = new ArrayList<String>();

		friends.add("Sanskar");
		friends.add("Mansi");
		friends.add("Utkarsh");
		friends.add("Sneha");
		friends.add("Sanidhya");

		model.addAttribute("friends", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/services")
	public String services() {
		return "services";
	}

//	Using ModelAndView Object
	@RequestMapping("/help")
	public ModelAndView help() {

		System.out.println("This is help Page");

//		Creating the model and view object
		ModelAndView modelAndView = new ModelAndView();

//		setting the data
		modelAndView.addObject("name", "Pratik Jangam");
		modelAndView.addObject("Id", 2268584);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);

		List<Integer> marks = new ArrayList<>();

		marks.add(22);
		marks.add(54);
		marks.add(25);
		marks.add(97);

		modelAndView.addObject("marks", marks);

//		setting the view name
		modelAndView.setViewName("help");

		return modelAndView;
	}

}
