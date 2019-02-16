package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseHelper
{
    protected WebDriver wd;

    public BaseHelper(WebDriver wd)
    {
        this.wd = wd;
    }

    protected void click(By locator)
    {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text)
    {
        click(locator);
        if(text != null)
        {
            String existingText = wd.findElement(locator).getAttribute("value");
            if(!text.equals(existingText))
            {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }

    protected void file(By locator, String text)
    {
        wd.findElement(locator).sendKeys(text);
    }

    protected void select(By locator, String text)
    {
        click(locator);
        new Select(wd.findElement(locator)).selectByVisibleText(text);
        click(locator);
    }

    public boolean isElementPresent(By locator)
    {
        try
        {
            wd.findElement(locator);
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public boolean isAlertPresent()
    {
        try
        {
            wd.switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException e)
        {
            return false;
        }
    }
}
