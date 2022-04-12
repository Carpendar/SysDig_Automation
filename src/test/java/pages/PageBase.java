package pages;

import org.openqa.selenium.WebDriver;

abstract class PageBase {

    protected WebDriver driver;
    protected String pageTitle;
    protected String pageUrl;

    public PageBase() {}
    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public boolean ValidatePageTitle(String title){
        String _title = this.driver.getTitle();
        return _title.equals(title);
    }

}
