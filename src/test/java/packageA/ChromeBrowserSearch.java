package packageA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import com.qa.base.TestBase;

public class ChromeBrowserSearch extends TestBase{

	public static void main(String[] args) throws Exception {
		TestBase.initialization();
        System.out.println("Opening URL");
      
        JavascriptExecutor js =  (JavascriptExecutor)driver;
        Thread.sleep(2000);
        WebElement a =  (WebElement) js.executeScript("return document.querySelector('body > settings-ui').shadowRoot.querySelector('#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchInput')");
        a.sendKeys("Sachin Test");
        System.out.println("Test Complete");
	}

}
