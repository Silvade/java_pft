package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;
import java.util.Comparator;
import java.util.List;

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
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initContactModification(before.size() - 1);
        ContactData cd = new ContactData(before.get(before.size() - 1).getId(), "Fyodor", "Nikolayevich", "Chalov", "Esthete",
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
            app.getContactHelper().initContactModification(before.size() - 1);
        }
        app.getContactHelper().fillContactForm(cd, false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(before.size(), after.size());

        before.remove(before.size() - 1);
        before.add(cd);

        Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
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
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initContactModification(before.size() - 1);
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
