package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase
{
    @Test
    public void testContactDeletion() throws Exception
    {
        app.getNavigationHelper().gotoPage("home");
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().clickAlert();
    }

    @Test
    public void testAllContactsDeletion() throws Exception
    {
        app.getNavigationHelper().gotoPage("home");
        app.getContactHelper().selectAllContacts();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().clickAlert();
    }
}
