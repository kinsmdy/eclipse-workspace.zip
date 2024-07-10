import static org.junit.jupiter.api.Assertions.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LinkCheck {

	@Test
	void test() {
		System.setProperty("webdriver.chrome.driver", "D:/webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.npru.ac.th");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println("number of links : "+list.size());
		for(int i=0; i<list.size();i++) {
			if(!list.get(i).getText().equals(""))
			System.out.println(" "+list.get(i).getText());
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        for (WebElement link : list) {
            String url = link.getAttribute("href");

            // ตรวจสอบสถานะของลิงก์
            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int respCode = conn.getResponseCode();

                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }

            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
		
		driver.close();
		System.out.println("Finish !!!");
	}

}
