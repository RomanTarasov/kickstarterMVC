package ua.goit.kickstarter.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.kickstarter.dao.entities.Category;
import ua.goit.kickstarter.dao.entities.Project;

@Transactional
public class ProjectDaoImpl extends AbstractDao<Project> implements ProjectDao {

	ProjectDaoImpl() {
		super(Project.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> getProjectsByCategory(Category category) {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Project.class)
				.add(Restrictions.eq("categoryId", category.getId())).list();
	}

}
