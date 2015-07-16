package ua.goit.kickstarter.dao.impl;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import ua.goit.kickstarter.dao.QuoteDao;
import ua.goit.kickstarter.dao.entities.Quote;


@Transactional
public class QuoteDaoImpl extends AbstractDao<Quote> implements QuoteDao {

	QuoteDaoImpl() {
		super(Quote.class);
	}

	@Override
	public Quote getRandom() {
		Session currentSession = sessionFactory.getCurrentSession();
		return (Quote) currentSession
				.createSQLQuery("SELECT * FROM quotes ORDER BY RAND() LIMIT 1")
				.addEntity(Quote.class).uniqueResult();
	}

}
