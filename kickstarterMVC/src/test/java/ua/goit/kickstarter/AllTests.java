package ua.goit.kickstarter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CategoryDaoTest.class, QuoteDaoTest.class })
public class AllTests {

}
