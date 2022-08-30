package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.ListOfHotelsPage;
import pages.MainPage;

import java.awt.*;


public class SearchHotelSteps {

    MainPage mainPage;
    ListOfHotelsPage listOfHotelsPage;

    @Before
    public void setUp() {
        Configuration.timeout = 6000;
        Dimension size
                = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) size.getWidth();
        int height = (int) size.getHeight() - 50;
        Configuration.browserSize = String.format("%dx%d", width, height);
        mainPage = new MainPage();
        listOfHotelsPage = new ListOfHotelsPage();
    }

    @Given("Main Booking Page is opened")
    public void mainBookingPageOpened() {
        mainPage.openMainBookingPage();
    }


    @When("User enters {string} into the {string} field")
    public void userEntersIntoTheField(String hotel, String entryFieldName) {
        mainPage.enterHotelName("Congress Plaza Hotel Chicago", "Destination/property name:");
    }


    @And("Clicks  {string} Button")
    public void clicksButton(String buttonSubmit) {
        mainPage.clickSearchButton();

    }

    @Then("{string} is presented on  page")
    public void isPresentedOnPage(String hotel) {
        listOfHotelsPage.isPresentedHotelName("Congress Plaza Hotel Chicago");

    }

}
