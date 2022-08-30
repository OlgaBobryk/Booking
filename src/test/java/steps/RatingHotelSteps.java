package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ListOfHotelsPage;
import pages.MainPage;

import java.awt.*;


public class RatingHotelSteps {
    MainPage mainPage;
    ListOfHotelsPage listOfHotelsPage;



    @Then("{string} is presented for {string}")
    public void isPresentedFor(String rating, String hotel) {
        listOfHotelsPage.isPresentedRatingHotel();
        Assert.assertEquals(listOfHotelsPage.isPresentedRatingHotel(), rating, "There isn't any hotel with this name");
    }
}
