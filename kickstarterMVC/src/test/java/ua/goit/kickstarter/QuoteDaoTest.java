package ua.goit.kickstarter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.goit.kickstarter.dao.QuoteDao;
import ua.goit.kickstarter.dao.entities.Quote;


public class QuoteDaoTest {

	ApplicationContext app;
	QuoteDao quoteDao;

	@Before
	public void setUp() {
		app = new ClassPathXmlApplicationContext("root-context.xml");
		quoteDao = (QuoteDao) app.getBean("quoteDaoImpl");
//		 org.hsqldb.util.DatabaseManagerSwing.main(new String[] { "--url",
//				 "jdbc:hsqldb:mem:embeddedDataSource", "--noexit"});


	}

	@Test
	public void create_getById_Test() {

		Quote quote = new Quote();
		quote.setText("new quotes");
		quote.setAuthor("author");
		quote.setId((long) 90);
		
		quoteDao.create(quote);
		Quote stored = quoteDao.getById((long) 90);
		assertEquals(quote.getAuthor(), stored.getAuthor());
	}

	@Test
	public void getRandomQuote_Test() {

		Quote quote = new Quote();
		quote.setText("new quotes2");
		quote.setAuthor("author2");
		quote.setId((long) 91);
		quoteDao.create(quote);
		Quote randomQuote = quoteDao.getRandom();
		assertNotNull(randomQuote);
	}
}
