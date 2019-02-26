package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase
{
    @Test
    public void testGroupDeletion() throws Exception
    {
        app.getNavigationHelper().gotoGroupPage();
        if(!app.getGroupHelper().isThereAGroup())
        {
            app.getGroupHelper().createGroup(new GroupData("test2", null, null));
        }
        int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoGroupPage();
        int after = app.getGroupHelper().getGroupCounter();
        Assert.assertEquals(after, before - 1);
    }
}
