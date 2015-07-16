package ua.goit.kickstarter.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import ua.goit.kickstarter.dao.entities.Comment;
import ua.goit.kickstarter.dao.entities.Project;

@Component
@Transactional
public interface CommentDao extends Dao<Comment>{

	List<Comment> getAllCommentsOfProject(Project project);

}
