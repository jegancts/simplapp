package com.ielts.pagefactory;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://takeielts.britishcouncil.org/organisations/organisations-recognise-ielts")
public class SearchResultPage extends PageObject {

	
	@FindBy(xpath="//p[contains(text(),'Click on the below')]")
	@CacheLookup
	WebElement Searchpagelandingtext;
	////h1[contains(text(),'Your search returned 0 results')]

	@FindBy(xpath="//h1[contains(text(),'Your search returned')]")
	@CacheLookup
	WebElement Searchpageresult;

	@FindBy(xpath="//div[@class='field-content item-bandscore']")
	List<WebElement> ieltsscoreresult;
    
	public void searchpagecheck(String ieltsccore) throws InterruptedException {

		String expectScore = "9.00";
		Double ScoreExp = 9.0;
		Assert.assertTrue(Searchpagelandingtext.isDisplayed());

		for (WebElement e : ieltsscoreresult) {

			String actScore = e.getText();
			System.out.println("Score Result" + e.getText());
			Assert.assertEquals(expectScore, actScore);
			Double ScoreAct = Double.parseDouble(e.getText());
			Assert.assertTrue(ScoreExp <= ScoreAct);

		}

	}
		public void searchpagecheckOrg(String ieltsccore) throws InterruptedException {
			String exptitle = "Your search returned 0";
			String acttitle = Searchpageresult.getText();
			String subtitle = acttitle.substring(1,22);
			Assert.assertNotEquals(exptitle, subtitle);

			}
			


}
