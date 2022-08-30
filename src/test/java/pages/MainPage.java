package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import constants.Urls;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

private SelenideElement enterOption =$(By.xpath("//li//div[@role='button']"));
private SelenideElement searchButton =$(By.xpath("//div//button[@type='submit']"));
    public void openMainBookingPage() {
        open(Urls.BOOKING_MAINPAGE_URL);
    }

    public void enterHotelName(String hotel, String entryFieldName) {
        String entryFieldXpath = String.format("//div//input[@name='ss']", entryFieldName);
        $(By.xpath(entryFieldXpath)).shouldBe(Condition.visible).click();
        hotel = "Congress Plaza Hotel Chicago ";
        $(By.xpath(entryFieldXpath)).sendKeys(hotel);
        enterOption.click();
    }


    public void clickSearchButton() {
        searchButton.click();

    }

}
