package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RepositoryPage {

    SelenideElement issuesTab = $("#issues-tab");
    String issueNumberLink = "#issue_%s_link";

    @Step("Выбрать вкладку Issue")
    public RepositoryPage selectIssuesTab() {
        issuesTab.click();
        return this;
    }

    @Step("Проверяем имя {nameIssue} и номер {numberIssue} в Issues")
    public RepositoryPage checkIssueName(String numberIssue, String nameIssue) {
        $(String.format(issueNumberLink, numberIssue)).shouldHave(text(nameIssue));
        return this;
    }
}
