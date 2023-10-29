package org.example.uitests.pages;

import org.example.uitests.driver.WebDriverHolder;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

//    protected WebDriver driver;  //Фбо оголосити вебдрайвер, або викрорстати з "WebDriverHolder" класу, викоритовуючи Singletone

    public BasePage() {
//        this.driver = driver;
        PageFactory.initElements(WebDriverHolder.getInstance().getDriver(), this);
    }

}
