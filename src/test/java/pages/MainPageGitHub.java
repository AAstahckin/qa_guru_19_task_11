package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainPageGitHub {

    SelenideElement searchInput = $("[name=q]");

    @Step("Поиск репозитория по названию : {repository}")
    public MainPageGitHub searchRepository(String repository) {
        searchInput.setValue(repository).pressEnter();
        return this;
    }


}
