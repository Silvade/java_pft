package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper
{
    public NavigationHelper(WebDriver wd)
    {
        super(wd);
    }

    public void gotoPage(String page)
    {
        click(By.linkText(page));
    }
}
