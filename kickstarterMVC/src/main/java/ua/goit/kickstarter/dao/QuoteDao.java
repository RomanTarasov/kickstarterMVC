package ua.goit.kickstarter.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ua.goit.kickstarter.dao.entities.Quote;

@Component
@Transactional
public interface QuoteDao extends Dao<Quote> {

	Quote getRandom();
	
}