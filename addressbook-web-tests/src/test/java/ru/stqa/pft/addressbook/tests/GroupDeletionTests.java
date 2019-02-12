package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase
{
    @Test
    public void testGroupDeletion() throws Exception
    {
        app.getNavigationHelper().gotoPage("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoPage("groups");
    }

    @Test
    public void testGroupsDeletion() throws Exception
    {
        app.getNavigationHelper().gotoPage("groups");
        int[] groupNumbers = new int[]{1, 2, 4};
        app.getGroupHelper().selectGroups(groupNumbers);
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoPage("groups");
    }
}
