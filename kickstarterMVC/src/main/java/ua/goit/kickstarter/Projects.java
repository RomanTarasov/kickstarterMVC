package ua.goit.kickstarter;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.goit.kickstarter.dao.ProjectDao;
import ua.goit.kickstarter.dao.entities.Category;
import ua.goit.kickstarter.dao.entities.Project;


@Controller
public class Projects {
	@Autowired
	ProjectDao projectDao;

	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public String main(@RequestParam("category") long categoryId, Model model) {
	
		Category category = new Category();
		category.setId(categoryId);
		List<Project> projects = projectDao.getProjectsByCategory(category);
		model.addAttribute("sortedProjects", projects);
		return "projects";
	}
}
