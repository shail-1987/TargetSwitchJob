
package coreLogic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.basePackage.Base;

public class ClickMethods extends Base {

	public static void clickElement(String xpath) {

		driver.findElement(By.xpath(xpath)).click();

	}

	public static void ClickUsingJS(String xpath) {

		WebElement Element = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Element);
	}

	public static void ClickUsingActions(String xpath) {

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpath))).click().build().perform();

	}

	public static void enterTextUsingXpath(String xpath, String text) {

		WebElement textBox = driver.findElement(By.xpath(xpath));
		textBox.sendKeys(text);

	}

	public static void enterTextUsingID(String ID, String text) {

		WebElement textBox = driver.findElement(By.id(ID));
		textBox.sendKeys(text);
	}

	public static void clickOnAutoSuggestedSearchResult(String xpath1, String enterText, String Expectedtext,
			String xpath2) {
		driver.findElement(By.xpath(xpath1)).sendKeys(enterText);
		DifferentWaits.explicitWait(xpath1);
		List<WebElement> el = driver.findElements(By.xpath(xpath2));

		for (WebElement x : el) {
			System.out.println(x.getText());
			if (x.getText().equals(Expectedtext)) {
				x.click();
			}

		}

	}

}
