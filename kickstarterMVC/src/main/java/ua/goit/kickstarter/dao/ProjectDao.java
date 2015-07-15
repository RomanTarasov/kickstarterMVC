package ua.goit.kickstarter.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ua.goit.kickstarter.dao.entities.Category;
import ua.goit.kickstarter.dao.entities.Project;

@Component
@Transactional
public interface ProjectDao extends Dao<Project> {
	List<Project> getProjectsByCategory(Category category);

}
