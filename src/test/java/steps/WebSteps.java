package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Открыть Github")
    public WebSteps openGitHub() {
        open("https://github.com");

        return this;
    }

    @Step("Найти репозиторий {repository}")
    public WebSteps searchRepository(String repository) {
        $(".header-search-input").setValue(repository).pressEnter();

        return this;
    }

    @Step("Перейти в найденный репозиторий {repository}")
    public WebSteps openRepository(String repository) {
        $(linkText(repository)).click();

        return this;
    }

    @Step("Проверить отображение вкладки Issues в репозитории {repository}")
    public WebSteps checkIssueTab() {
        $(partialLinkText("Issues")).should(Condition.visible);

        return this;
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        final WebDriver driver = WebDriverRunner.getWebDriver();
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
