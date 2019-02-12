package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase
{
    @Test
    public void testContactCreation() throws Exception
    {
        app.getNavigationHelper().gotoPage("add new");
        app.getContactHelper().fillContactForm(new ContactData("Aleksandr", "Sergeyevich", "Golovin", "Chick",
                "C:\\Users\\Maria\\Pictures\\Aleksandr_Golovin.jpg",
                "Footballer", "AS Monaco FC", "Stade Louis II, Fontvielle, Monaco",
                "472-890", "88002253535", "123456", "654321",
                "mail@mail.ru", "mail1@mail.ru", "mail2@mail.ru", "www.asmonaco.com",
                "30", "May", "1996",
                "27", "July", "2018",
                "Test1", "Kaltan, Russia", "2-10-64",
                "He played for PFC CSKA Moscow."));
        app.getContactHelper().submitContactCreation();
    }

    @Test
    public void testEmptyContactCreation() throws Exception
    {
        app.getNavigationHelper().gotoPage("add new");
        app.getContactHelper().submitContactCreation();
    }
}
