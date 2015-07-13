package ua.goit.kickstarter.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.criterion.Order;
import ua.goit.kickstarter.dao.entities.Category;


@Transactional
public class CategoryDaoImpl extends AbstractDao<Category> implements
		CategoryDao {
	CategoryDaoImpl() {
		super(Category.class);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAllCategories() {
		return sessionFactory.getCurrentSession()
				.createCriteria(Category.class).addOrder(Order.asc("name"))
				.list();
	}
}
