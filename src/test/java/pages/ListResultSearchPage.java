package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class ListResultSearchPage {

    SelenideElement listResults = $(".codesearch-results");

    @Step("В списке результатов поиска переходим по сслыке: {repository}")
    public ListResultSearchPage selectRepository(String repository) {
        listResults.$(linkText(repository)).click();
        return this;
    }

}
