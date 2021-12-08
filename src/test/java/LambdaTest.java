import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaTest {

    private static final String REPOSITORY = "kyattonippu/hw_lesson_6";

    @Owner("kyattonippu")
    @Feature("Search in GitHub")
    @Story("Search Issues tab with LambdaTest")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Search Issues tab in Github with LambdaTest")
    @Link(name = "GitHub", url = "https://github.com")
    @Test

    public void checkIssuesLambdaTest () {
        AllureLifecycle lifecycle = Allure.getLifecycle();
        step("Открыть Github", () -> {
            open("https://github.com");
        });
        step("Найти репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").setValue("kyattonippu/hw_lesson_6").pressEnter();
        });
        step("Перейти в найденный репозиторий " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Проверить отображение вкладки Issues в репозитории " + REPOSITORY, () -> {
            $(partialLinkText("Issues")).should(Condition.visible);
            lifecycle.addAttachment("Скриншот репозитория " + REPOSITORY, "image/png",
                    "png", takeScreenshot());
        });
    }

    private byte[] takeScreenshot() {
        final WebDriver driver = WebDriverRunner.getWebDriver();
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
