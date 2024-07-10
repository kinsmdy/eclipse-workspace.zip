import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkCheck {

	@Test
	void test() {
		System.setProperty("webdriver.chrome.driver", "D:/webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("http://www.google.co.th");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<list.size();i++) {
			if(!list.get(i).getText().equals(""))
			System.out.println(" "+list.get(i).getText());
		}
		
		Thread.sleep(500);
		driver.close();
		System.out.println("Finish !!!");
	}

}
