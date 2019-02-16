package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase
{
    @Test
    public void testContactDeletion() throws Exception
    {
        app.getNavigationHelper().gotoHomePage();
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
            app.getNavigationHelper().gotoNewContactPage();
            app.getContactHelper().createContact(cd);
            app.getNavigationHelper().gotoHomePage();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().clickAlert();
    }

    @Test
    public void testAllContactsDeletion() throws Exception
    {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectAllContacts();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().clickAlert();
    }
}
