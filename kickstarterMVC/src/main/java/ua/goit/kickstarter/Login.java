package ua.goit.kickstarter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.goit.kickstarter.dao.entities.User;
import ua.goit.web.model.dao.KickstarterException;




@Controller
public class Login {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	String doGet(@RequestParam("category") long categoryId,
			@RequestParam("project") long projectId, Model model){
	
		model.addAttribute("project", projectId);
		model.addAttribute("category", categoryId);
		return "login";
		
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	String doPost(@RequestParam("category") long categoryId,
			@RequestParam("project") long projectId,@RequestParam("login")String login,@RequestParam("pwd")String password, Model model){
		User modelOfUser = new User();
		User user = null;
	
		modelOfUser.setLogin(login);
		modelOfUser.setPassword(password);

		
	
		
		model.addAttribute("project", projectId);
		model.addAttribute("category", categoryId);
		return "login";
		
	}

}
