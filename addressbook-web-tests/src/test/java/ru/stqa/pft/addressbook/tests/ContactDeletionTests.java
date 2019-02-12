package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase
{
    @Test
    public void testContactDeletion() throws Exception
    {
        app.getNavigationHelper().gotoPage("home");
        String[] contactNumbers = new String[]{"23"};
        app.getContactHelper().selectGroups(contactNumbers);
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().clickAlert();
    }

    @Test
    public void testAllContactsDeletion() throws Exception
    {
        app.getNavigationHelper().gotoPage("home");
        String[] contactNumbers = new String[]{"MassCB"};
        app.getContactHelper().selectGroups(contactNumbers);
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().clickAlert();
    }
}
