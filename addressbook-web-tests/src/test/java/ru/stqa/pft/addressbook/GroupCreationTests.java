package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupCreationTests
{
    private WebDriver wd;
    private TestConfiguration tc;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception
    {
        tc = new TestConfiguration();
        wd = tc.setUp();
    }

    @Test
    public void testGroupCreation() throws Exception
    {
        Util.gotoPage(wd, "groups");
        initGroupCreation();
        fillGroupForm(new GroupData("test", "test1", "test2"));
        submitGroupCreation();
        Util.gotoPage(wd, "groups");
    }

    private void submitGroupCreation()
    {
        wd.findElement(By.name("submit")).click();
    }

    private void fillGroupForm(GroupData groupData)
    {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    private void initGroupCreation()
    {
        wd.findElement(By.name("new")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception
    {
        tc.tearDown();
    }

    private boolean isElementPresent(By by)
    {
        try
        {
            wd.findElement(by);
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

    private boolean isAlertPresent()
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
