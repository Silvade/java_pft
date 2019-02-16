package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends BaseHelper
{

    public GroupHelper(WebDriver wd)
    {
        super(wd);
    }

    public void submitGroupCreation()
    {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData)
    {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation()
    {
        click(By.name("new"));
    }

    public void deleteSelectedGroups()
    {
        click(By.name("delete"));
    }

    public void selectGroup()
    {
        click(By.name("selected[]"));
    }

    public void initGroupModification()
    {
        click(By.name("edit"));
    }

    public void submitGroupModification()
    {
        click(By.name("update"));
    }

    public void returnToGroupPage()
    {
        click(By.linkText("group page"));
    }

    public void createGroup(GroupData group)
    {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }

    public boolean isThereAGroup()
    {
        return isElementPresent(By.name("selected[]"));
    }

    public boolean isThereAGroupByName(String name)
    {
        try
        {
            wd.findElement(By.name("new_group")).findElement(By.xpath("//*[contains(text(), '" + name + "')]"));
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }
}
