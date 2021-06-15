package co.com.toyota.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class Generics extends PageObject {

    public void mouseClick(WebElementFacade element) {
        waitFor(4).seconds();
        element.waitUntilClickable().click();
    }

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions( getDriver() );
        actions.moveToElement( element ).build().perform();
    }

    public void printText (WebElementFacade element) {
        String text = element.getTextValue();
        System.out.print(text);
    }

    public void selectOptions(String option, String element) {
        List<WebElementFacade> items = findAll(element);
        int num_options = items.size();
        for (int i = 0; i < num_options; i++) {
            if (items.get(i).getText().trim().contains(option)) {
                items.get(i).waitUntilClickable().click();
                break;
            }
        }
    }
}
