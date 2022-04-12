import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class Login_TC extends TestBase{

    LoginPage loginPage;

    @Test
    public void canValidateLoginTitle() {
        //Arrange
        loginPage = new LoginPage(driver);
        // Act
        driver.get(loginPage.pageUrl);

        // Assert
        assertThat(loginPage.pageTitle).contains("Sysdig Monitor");
    }

    @Test
    public void canValidateAllLoginInputExists() {
        //Arrange
        loginPage = new LoginPage(driver);
        //Act
        driver.get(loginPage.pageUrl);
        //Assert
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(loginPage.IsLoginButtonDisplayed());
        softly.assertThat(loginPage.IsDisplayedForgotPasswordLink());
        softly.assertThat(loginPage.IsDisplayedUsernameTextBox());
        softly.assertThat(loginPage.IsDisplayedPasswordTextBox());
    }

}
