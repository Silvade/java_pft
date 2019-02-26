package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase
{
    @Test
    public void testGroupCreation() throws Exception
    {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().createGroup(new GroupData("test", null, null));
        int after = app.getGroupHelper().getGroupCounter();
        Assert.assertEquals(after, before + 1);
    }

    @Test
    public void testEmptyGroupCreation()
    {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().gotoGroupPage();
    }
}
