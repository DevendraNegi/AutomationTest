package steps;

import java.util.concurrent.TimeUnit;

import com.automation.qa.base.TestBase;
import com.automation.qa.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class GenralSteps extends TestBase {
	LoginPage loginPage;

	public GenralSteps() {
		super();// TODO Auto-generated constructor stub
		logger.info("GenralSteps.super()");
	}

	@Before
	public void setUp() {
		logger.info("setUp");
		initilization();
		loginPage = new LoginPage();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {
		logger.info("tearDown");
		driver.close();
		

	}

}
