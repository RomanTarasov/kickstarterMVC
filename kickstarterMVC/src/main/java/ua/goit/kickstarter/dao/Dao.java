package ua.goit.kickstarter.dao;

import javax.transaction.Transactional;
import org.hibernate.Session;

@Transactional
public interface Dao<T> {
	void create(T entity);

	T getById(Long id);

	void update(T entity);

	void delete(T entity);

	Session getSession();
}
