package ua.goit.kickstarter;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.goit.kickstarter.dao.CategoryDao;
import ua.goit.kickstarter.dao.QuoteDao;
import ua.goit.kickstarter.dao.entities.Category;
import ua.goit.kickstarter.dao.entities.Quote;

@Controller
public class Main {

	@Autowired
	private QuoteDao quoteDao;

	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping(value = {"/","/main"}, method = RequestMethod.GET)
	public String doGet(Model model) {
		Quote randomQuote = quoteDao.getRandom();
		model.addAttribute("quote", randomQuote);
		List<Category> categories = categoryDao.getAllCategories();
		model.addAttribute("categories", categories);
		return "main";
	}

}
