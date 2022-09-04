package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class ListOfHotelsPage {
    private final String HOTEL_NAME = "//h3//a//div[@data-testid='title' and contains(text(), 'Congress Plaza Hotel Chicago')]";
    private final String HOTEL_RATING = "//h3//a//div[@data-testid='title' and contains(text(), 'Congress Plaza Hotel Chicago')]//following::a[2]//div[contains(@aria-label,'Scored ')]";

    public String isPresentedHotelName(String hotel) {
        String hotelName = String.format(HOTEL_NAME, hotel);
        $(By.xpath(hotelName)).getText();
        return hotel;
    }

    public String isPresentedRatingHotel(String rating) {
        String hotelRating = String.format(HOTEL_RATING, rating);
        $(By.xpath(hotelRating)).getText();
        return rating;
    }
}
