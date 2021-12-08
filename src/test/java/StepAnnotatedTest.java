import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.WebSteps;

public class StepAnnotatedTest {

    private static final String REPOSITORY = "kyattonippu/hw_lesson_6";

    private final WebSteps steps = new WebSteps();

    @Owner("kyattonippu")
    @Feature("Search in GitHub")
    @Story("Search Issues tab with StepAnnotatedTest")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Search Issues tab in Github with StepAnnotatedTest")
    @Link(name = "GitHub", url = "https://github.com")
    @Test

    public void  checkIssuesAnnotatedSteps () {

        steps.openGitHub()
                .searchRepository(REPOSITORY)
                .openRepository(REPOSITORY)
                .checkIssueTab()
                .takeScreenshot();

    }
}
