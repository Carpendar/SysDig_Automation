# SysDig_Automation

A collection of practices, scripts and scenarios with the intent to automate the validation of SysDig SUT.

## Introduction/Technology Stack
# [![][Logo]][Selenium-Jupiter]
  [Selenium-Jupiter] is an open-source Java library that implements a [JUnit 5] extension for developing [Selenium WebDriver] tests. Selenium-Jupiter uses several features of the Jupiter extension (such as parameters resolution, test templates, or conditional test execution). Thanks to this, the resulting Selenium-Jupiter tests follow a minimalist approach (i.e., the required boilerplate code for WebDriver is reduced) while providing a wide range of advanced features for end-to-end testing.
## Local browsers
Selenium-Jupiter can be used to control local browsers programmatically using Selenium WebDriver. To do that, we need to specify the flavor of the browser to be used by declaring `WebDriver` parameters in tests or constructors. For instance, we declare a `ChromeDriver` parameter to use Chrome, `FirefoxDriver` for Firefox, and so on.
## Design Patterns & Architecture
- Page Object Model (POM)
- Base Test abstract object to enforce setting Url and browser
- Selenium Page Factory uses lazy loading of WebElements
- SOLID [https://www.baeldung.com/solid-principles]
### Build Execute

```
$cd SysDig_Automation - root of project
$  ./gradlew :cleanTest :test --tests "Login_TC" - 
```
## Implement scenarios and scripts
- Create java class that extends TestBase.java. 
- Test class naming convention, {Scenario}TC-{INT}
- Create annotations for elements and test methods.


## TODO
- Add expanded test result summary. [https://roukou.org/2021/10/08/junit5-readable-reports-with-gradle/ ]
- Multi browser support.
- Validate 100% coverage, currently only MVP login validated at this time.
- Consider using Serenity Screenplay for BDD/TDD strategy [https://serenity-bdd.github.io/theserenitybook/latest/index.html]
- Consider DI and parametrization Spring boot [ https://howtodoinjava.com/spring-boot2/testing/spring-boot-2-junit-5/ ]

[Logo]: https://bonigarcia.dev/img/seljup.png
[Selenium-Jupiter]: https://bonigarcia.dev/selenium-jupiter/
[JUnit 5]: https://junit.org/junit5/docs/current/user-guide/
[Selenium WebDriver]: https://www.selenium.dev/docs/site/en/webdriver/
[WebDriverManager]: https://github.com/bonigarcia/webdrivermanager