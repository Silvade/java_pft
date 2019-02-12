package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.BaseHelper;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase
{
    @Test
    public void testContactModification()
    {
        app.getNavigationHelper().gotoPage("home");
        app.getContactHelper().initContactModification(3);
        ContactData cd = new ContactData("Fyodor", "Nikolayevich", "Chalov", "Esthete",
                "C:\\Users\\Maria\\Pictures\\chalov.jpg", "", "PFC CSKA Moscow", "Russia, Moscow, VEB Arena",
                "89999999999", "", "", "", "f@c.ru", "", "",
                "https://www.pfc-cska.com/", "10", "April", "1998",
                "21", "September", "2016", "","Moscow",
                "", "The best footballer of Russia in 2017");
        app.getContactHelper().modifyContactForm(cd);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoPage("home");
    }

    @Test
    public void testClearContact()
    {
        app.getNavigationHelper().gotoPage("home");
        app.getContactHelper().initContactModification(4);
        ContactData cd = new ContactData("", "", "", "",
                "", "", "", "",
                "", "", "", "", "", "", "",
                "", "-", "-", "-",
                "-", "-", "-", "-","",
                "", "");
        app.getContactHelper().modifyContactForm(cd);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoPage("home");
    }
}
