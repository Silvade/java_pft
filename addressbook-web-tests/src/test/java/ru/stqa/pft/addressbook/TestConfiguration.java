package ru.stqa.pft.addressbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestConfiguration
{
    private WebDriver wd;

    public WebDriver setUp() throws Exception
    {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        Util.login(wd, "admin", "secret");

        return wd;
    }

    public void tearDown() throws Exception
    {
        Util.gotoPage(wd, "Logout");
        wd.quit();
    }
}
