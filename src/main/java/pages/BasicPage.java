package pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void clickButton(String text) {
        $(By.xpath("//div[contains(text()," + "'" + text +  "'"  +")]")).click();
        //div[contains(text(),'Log In')]
    }

    //button[@class='ant-btn sc-jtRfpW GcRXp ant-btn-primary']//span[contains(text(),'Log in')]
    public void clickButtonSpan(String text){
        $(By.xpath("//span[contains(text()," + "'" + text  + "'" +")]/..")).click();

    }
}
