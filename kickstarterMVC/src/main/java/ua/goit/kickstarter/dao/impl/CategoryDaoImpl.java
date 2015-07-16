package ua.goit.kickstarter.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import ua.goit.kickstarter.dao.CategoryDao;
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
				.createCriteria(Category.class).list();
	}
}
