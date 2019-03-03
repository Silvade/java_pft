package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase
{
    @Test(enabled = false)
    public void testContactCreation() throws Exception
    {
        app.goTo().homePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.goTo().newContactPage();
        ContactData cd = new ContactData("Aleksandr", "Sergeyevich", "Golovin", "Chick",
                "C:\\Users\\Maria\\Pictures\\Aleksandr_Golovin.jpg",
                "Footballer", "AS Monaco FC", "Stade Louis II, Fontvielle, Monaco",
                "472-890", "88002253535", "123456", "654321",
                "mail@mail.ru", "mail1@mail.ru", "mail2@mail.ru", "www.asmonaco.com",
                "30", "May", "1996",
                "27", "July", "2018",
                "Test1", "Kaltan, Russia", "2-10-64",
                "He played for PFC CSKA Moscow.");
        if(!app.group().isThereAGroupByName(cd.getGroupName()) && cd.getGroupName() != null)
        {
            GroupData gd = new GroupData().withName(cd.getGroupName());
            app.goTo().groupPage();
            app.group().create(gd);
            app.goTo().newContactPage();
        }
        app.getContactHelper().createContact(cd);

        app.goTo().homePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(before.size() + 1, after.size());

        before.add(cd);

        Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }

    @Test(enabled = false)
    public void testEmptyContactCreation() throws Exception
    {
        app.goTo().newContactPage();
        app.getContactHelper().submitContactCreation();
    }
}
