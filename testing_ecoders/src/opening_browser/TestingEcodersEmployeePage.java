package opening_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingEcodersEmployeePage {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:5000/employee");
	Thread.sleep(5000);
	String titleofpage = driver.getTitle();
	System.out.println(titleofpage);
	String urlofpage = driver.getCurrentUrl();
	System.out.println(urlofpage);
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	String expectedtitle="ECODERS-employeepage";
	String expectedurl="http://127.0.0.1:5000/employee";
	if (expectedtitle.equals(titleofpage)) {
		System.out.println("Title matched employee page case passed");
	}else {
		System.out.println("Title did not match,employee page case passed.");
	}
	if (expectedurl.equals(urlofpage)) {
		System.out.println("Url matched employee page case passed");
	}else {
		System.out.println("Url did not match,employee page case passed.");
	}
	driver.quit();
	
}
}
