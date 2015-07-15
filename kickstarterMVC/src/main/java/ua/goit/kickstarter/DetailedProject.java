package ua.goit.kickstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.goit.kickstarter.dao.ProjectDao;

@Controller
public class DetailedProject {
	@Autowired
	ProjectDao projectDao;

	@RequestMapping(value = "/DetailedProject", method = RequestMethod.GET)
	public String main(@RequestParam("category") long categoryId,
			@RequestParam("project") long projectId, Model model) {

		model.addAttribute("detailedProject",
				projectDao.getById(projectId));
		model.addAttribute("category",categoryId);
		return "DetailedProject";
	}
}
