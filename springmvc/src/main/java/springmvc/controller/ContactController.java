package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Welcome to Pratik's Website");
		model.addAttribute("description", "This website is created by Pratik");
	}

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	/*
	 * 
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST) public
	 * String formHandler(@RequestParam("email") String
	 * userEmail, @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * User user = new User();
	 * 
	 * user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword); System.out.println(user); //
	 * System.out.println(userEmail); // System.out.println(userName); //
	 * System.out.println(userPassword);
	 * 
	 * // We can write logic here such as saving data in DB
	 * 
	 * // model.addAttribute("email", userEmail); // model.addAttribute("userName",
	 * userName); // model.addAttribute("password", userPassword);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute User user) {

		System.out.println(user);
		this.userService.createUser(user);

		return "success";
	}
}
