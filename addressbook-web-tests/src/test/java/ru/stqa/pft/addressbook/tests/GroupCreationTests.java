package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase
{
    @Test
    public void testGroupCreation() throws Exception
    {
        app.getNavigationHelper().gotoPage("groups");
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test", "test1", "test2"));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().gotoPage("groups");
    }

    @Test
    public void testEmptyGroupCreation()
    {
        app.getNavigationHelper().gotoPage("groups");
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().gotoPage("groups");
    }
}
