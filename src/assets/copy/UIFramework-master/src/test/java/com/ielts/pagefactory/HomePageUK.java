package com.ielts.pagefactory;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.gov.uk/check-uk-visa/y")
public class HomePageUK extends PageObject {


    @FindBy(xpath = "/html/body/div[6]/main/div/div/form/div/div/div/select")
    WebElement dropdown;

    @FindBy(xpath = "//*[@id=\"response\"]/option[100]")
    WebElement selcountry;

    @FindBy(xpath = "//*[@id=\"current-question\"]/button")
    WebElement countrybutton;

    @FindBy(xpath = "/html/body/div[6]/main/div/div/form/div/div/div/fieldset/div[2]/div[3]/label")
    WebElement selstudy;

    @FindBy(xpath = "/html/body/div[6]/main/div/div/form/div/button")
    WebElement studybutton;

    @FindBy(xpath = "/html/body/div[6]/main/div/div/form/div/div/div/fieldset/div[2]/div[2]/input")
    WebElement duration;

    @FindBy(xpath = "/html/body/div[6]/main/div/div/form/div/button")
    WebElement durationbutton;

    public void clickdropdown() throws InterruptedException {
    }
    public void selectcountry() throws InterruptedException {
    }
    public void Clicknextpage() throws InterruptedException {
    }
    public void selectstudy() throws InterruptedException {
    }
    public void clickstudybutton() throws InterruptedException {
    }
    public void selectmorethan6months() throws InterruptedException {
    }



    public void selectIeltsScore(String intieltsscore) throws AWTException, InterruptedException {


        iletscore.click();

        if (intieltsscore.trim().equals("7"))

        {
            iletscore_7.click();
        }

        else if (intieltsscore.trim().equals("8"))

        {
            iletscore_8.click();

        } else if (intieltsscore.trim().equals("9"))

        {
            iletscore_9.click();
        }

        else

        {

            iletscore.click();
        }

        Thread.sleep(3000);
    }

    public void selectIeltsOrg(String intieltsorg) throws AWTException, InterruptedException {

        iletorg.sendKeys(intieltsorg);
//		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", searchorg);
//		Thread.sleep(500);

    }

    public void searchorganization() throws InterruptedException, AWTException {


        searchorg.click();
    }

}