package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;



public class ListOfHotelsPage {
    private SelenideElement hotelName = $(By.xpath("//h3//a//div[@data-testid='title' and contains(text(), 'Congress Plaza Hotel Chicago')]"));
    private SelenideElement raiting = $(By.xpath("//h3//a//div[@data-testid='title' and contains(text(), 'Congress Plaza Hotel Chicago')]//following::a[2]//div[contains(text(),'7.3')]"));

    public String isPresentedHotelName(String hotel) {
        String actualNameHotel = hotelName.getText();
        return actualNameHotel;
    }

    public String isPresentedRatingHotel() {
        String actualRating = raiting.getText();
        return actualRating;
    }
}

