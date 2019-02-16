package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase
{
    @Test
    public void testContactModification()
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
        }
        app.getContactHelper().initContactModification();
        ContactData cd = new ContactData("Fyodor", "Nikolayevich", "Chalov", "Esthete",
                "C:\\Users\\Maria\\Pictures\\chalov.jpg", "", "PFC CSKA Moscow", "Russia, Moscow, VEB Arena",
                "89999999999", "", "", "", "f@c.ru", "", "",
                "https://www.pfc-cska.com/", "10", "April", "1998",
                "21", "September", "2016", "Joker","Moscow",
                "", "The best footballer of Russia in 2017");
        if(!app.getGroupHelper().isThereAGroupByName(cd.getGroupName()) && cd.getGroupName() != null)
        {
            GroupData gd = new GroupData(cd.getGroupName(), null, null);
            app.getNavigationHelper().gotoGroupPage();
            app.getGroupHelper().createGroup(gd);
            app.getNavigationHelper().gotoHomePage();
            app.getContactHelper().initContactModification();
        }
        app.getContactHelper().fillContactForm(cd, false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();
    }

    @Test
    public void testClearContact()
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
                    "Test3", "Kaltan, Russia", "2-10-64",
                    "He played for PFC CSKA Moscow.");
            app.getNavigationHelper().gotoNewContactPage();
            if(!app.getGroupHelper().isThereAGroupByName(cd.getGroupName()) && cd.getGroupName() != null)
            {
                GroupData gd = new GroupData(cd.getGroupName(), null, null);
                app.getNavigationHelper().gotoGroupPage();
                app.getGroupHelper().createGroup(gd);
                app.getNavigationHelper().gotoNewContactPage();
            }
            app.getContactHelper().createContact(cd);
        }
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        ContactData cd = new ContactData("", "", "", "",
                null, "", "", "",
                "", "", "", "", "", "", "",
                "", "-", "-", "",
                "-", "-", "", null,"",
                "", "");
        app.getContactHelper().fillContactForm(cd, false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();
    }
}
