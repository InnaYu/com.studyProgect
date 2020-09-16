package steps;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void openUrl(){
        open("https://grinfer.com/home");
    }
}
