package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase
{
    @Test
    public void testGroupModification()
    {
        app.getNavigationHelper().gotoPage("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test", "ttest", "tttest"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().gotoPage("groups");
    }
}
