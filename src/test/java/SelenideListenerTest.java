import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideListenerTest {

    private static final String REPOSITORY = "kyattonippu/hw_lesson_6";

    @Owner("kyattonippu")
    @Feature("Search in GitHub")
    @Story("Search Issues tab with SelenideListener")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Search Issues tab in Github with SelenideListener")
    @Link(name = "GitHub", url = "https://github.com")
    @Test

    public void checkIssuesSelenideListener () {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");
        $(".header-search-input").setValue(REPOSITORY).pressEnter();
        $(linkText(REPOSITORY)).click();
        $(partialLinkText("Issues")).should(Condition.visible);
    }
}
