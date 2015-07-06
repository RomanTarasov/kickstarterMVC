package ua.goit.web.model.dao.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import ua.goit.web.model.dao.KickstarterException;
import ua.goit.web.model.dao.Quote;

public class DQuoteDao {
	private Connection conn;

	public Quote getRandomQuote() throws KickstarterException {
		Statement statement = null;
		ResultSet resultSet = null;
		Quote quote = null;
		try {
//            ResultSet resultSet = statement
//                    .executeQuery("SELECT COUNT(*) AS rowcount FROM quotes");
//    resultSet.next();
//    int count = resultSet.getInt("rowcount");
//    int randomPointer = new Random().nextInt(count);
//    resultSet = statement.executeQuery("SELECT *  FROM quotes");
//    resultSet.absolute(randomPointer);
//    resultSet.next();
//    int id = resultSet.getInt("id");
//    Quote quote = new Quote();
//    quote.setID(id);
//    quote.setQuote(resultSet.getString("quote"));
			StringBuffer sql = new StringBuffer();
			conn = Pool.getDataSource().getConnection();
			statement = conn.createStatement();
			resultSet = statement
					.executeQuery("SELECT COUNT(*) AS rowcount FROM quotes");
			resultSet.next();
			int count = resultSet.getInt("rowcount");
			Integer randomPointer = new Random().nextInt(count);
			resultSet = statement.executeQuery("SELECT *  FROM quotes");
			resultSet.absolute(randomPointer);
			resultSet.next();
			int id = resultSet.getInt("id");
			quote = new Quote();
			quote.setID(id);
			quote.setQuote(resultSet.getString("quote"));

		} catch (SQLException e) {
			quote = null;

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		if (quote == null) {
			throw new KickstarterException("quote not found");
		}
		return quote;
	}

}