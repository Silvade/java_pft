package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase
{
    @Test(enabled = false)
    public void testContactDeletion() throws Exception
    {
        app.goTo().homePage();
        if(!app.getContactHelper().isThereAContact())
        {
            ContactData cd = new ContactData("Aleksandr", "Sergeyevich", "Golovin", "Chick",
                    "C:\\Users\\Maria\\Pictures\\Aleksandr_Golovin.jpg",
                    "Footballer", "AS Monaco FC", "Stade Louis II, Fontvielle, Monaco",
                    "472-890", "88002253535", "123456", "654321",
                    "mail@mail.ru", "mail1@mail.ru", "mail2@mail.ru", "www.asmonaco.com",
                    "30", "May", "1996",
                    "27", "July", "2018",
                    null, "Kaltan, Russia", "2-10-64",
                    "He played for PFC CSKA Moscow.");
            app.goTo().newContactPage();
            app.getContactHelper().createContact(cd);
            app.goTo().homePage();
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteSelectedContacts();
        app.goTo().clickAlert();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }

    @Test(enabled = false)
    public void testAllContactsDeletion() throws Exception
    {
        app.goTo().homePage();
        app.getContactHelper().selectAllContacts();
        app.getContactHelper().deleteSelectedContacts();
        app.goTo().clickAlert();
    }
}
