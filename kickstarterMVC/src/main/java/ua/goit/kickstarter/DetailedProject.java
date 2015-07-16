package ua.goit.kickstarter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.goit.kickstarter.dao.CommentDao;
import ua.goit.kickstarter.dao.ProjectDao;
import ua.goit.kickstarter.dao.entities.Comment;
import ua.goit.kickstarter.dao.entities.Project;

@Controller
public class DetailedProject {
	@Autowired
	private ProjectDao projectDao;

	@Autowired
	private CommentDao commentDao;

	@RequestMapping(value = "/DetailedProject", method = RequestMethod.GET)
	public String main(@RequestParam("category") long categoryId,
			@RequestParam("project") long projectId, Model model) {
		
		Project project = projectDao.getById(projectId);
		model.addAttribute("detailedProject", project);
		model.addAttribute("category", categoryId);
		
		List<Comment>comments =commentDao.getAllCommentsOfProject(project);
		model.addAttribute("comments", comments);
		return "DetailedProject";
	}
}
