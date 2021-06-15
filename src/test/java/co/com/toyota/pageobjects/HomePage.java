package co.com.toyota.pageobjects;

import co.com.toyota.utils.Generics;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class HomePage extends PageObject {
    Generics function;


    @FindBy(xpath = "(//div[@class='slick-track'])[1]")
    private WebElementFacade carBanner;

    @FindBy(css = "#btnCookies")
    private WebElementFacade cookieButton;

    public void acceptCookies() {
        function.mouseClick(cookieButton);
    }
    public void clickCar() {
        function.mouseClick(carBanner);
    }

    public void SelectBanner(String option) {
        String bannerList = "(//ul[@role='tablist'])[1]/li";
        function.selectOptions(option, bannerList);
    }
}

