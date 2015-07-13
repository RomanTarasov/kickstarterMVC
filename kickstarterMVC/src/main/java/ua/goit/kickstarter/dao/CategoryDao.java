package ua.goit.kickstarter.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import ua.goit.kickstarter.dao.entities.Category;

@Component
@Transactional
public interface CategoryDao extends Dao<Category> {
	List<Category> getAllCategories();
}
