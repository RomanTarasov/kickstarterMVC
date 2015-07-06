package ua.goit.web;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.hsqldb.util.DatabaseManagerSwing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import ua.goit.web.model.dao.IDao;
import ua.goit.web.model.dao.KickstarterException;
import ua.goit.web.model.dao.Quote;
import ua.goit.web.model.dao.database.DDao;
import ua.goit.web.model.dao.database.Pool;

public class inmemory_database_Test {
	private EmbeddedDatabase db;
	ApplicationContext app;
	@Before
	public void setUp() {
		// db = new EmbeddedDatabaseBuilder().addDefaultScripts().build();
		
		app = new ClassPathXmlApplicationContext("application-context.xml");

		db = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL)
				.addScript("create-db.sql").addScript("insert-data.sql")
				.build();
	}

	@Test
	public void test() {
//		DatabaseManagerSwing.main(new String[] { "--url",
//				 "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", "root" });
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(db);
	
		Pool pool =(Pool) app.getBean("pool");
		//pool.setDataSource(db);
		DDao dao=(DDao) app.getBean("dDao");
		IDao idao=dao;
		String quote=null;
		try {
			System.out.println(idao.getRandomQuote().getQuote());
		} catch (KickstarterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			Statement st =db.getConnection().createStatement();
//	
//			//String sql="select id, quote  from quotes order by rand() limit 1";
//			String sql="select id, quote from quotes limit 1  ";
//			
//			ResultSet rs=st.executeQuery(sql);
//			rs.next();
//			quote=rs.getString("quote");
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		assertNotNull(quote);




	}

	@After
	public void tearDown() {
		db.shutdown();
	}
	// @PostConstruct
	// public void startDBManager() {
	//
	// //hsqldb
	// DatabaseManagerSwing.main(new String[] { "--url",
	// "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", "root" });
	//
	//
	// }

}
