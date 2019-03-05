package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase
{
    public void ensurePreconditions(String group)
    {
        app.goTo().groupPage();
        if(!app.group().isThereAGroupByName(group))
        {
            GroupData gd = new GroupData().withName(group);
            app.group().create(gd);
        }
    }

    @Test(enabled = false)
    public void testContactCreation() throws Exception
    {
        app.goTo().homePage();
        Contacts before = app.contact().all();
        ContactData cd = new ContactData().withFirstName("Aleksandr").withMiddleName("Sergeyevich").withLastName("Golovin").withNickname("Chick")
                .withPhotoPath("C:\\Users\\Maria\\Pictures\\Aleksandr_Golovin.jpg").withTitle("Footballer")
                .withCompany("AS Monaco FC").withAddress("Stade Louis II, Fontvielle, Monaco")
                .withHomePhone("472-890").withMobilePhone("88002253535").withWorkPhone("123456").withFax("654321")
                .withEmail("mail@mail.ru").withEmail2("mail1@mail.ru").withEmail3("mail2@mail.ru")
                .withHomepage("www.asmonaco.com").withDayOfBirthday("30").withMonthOfBirthday("May").withYearOfBirthday("1996")
                .withDayOfAnniversary("27").withMonthOfAnniversary("July").withYearOfAnniversary("2018")
                .withGroupName("Test1").withAddress2("Kaltan, Russia").withPhone2("2-10-64").withNotes("He played for PFC CSKA Moscow.");
        ensurePreconditions(cd.getGroupName());
        app.goTo().newContactPage();
        app.contact().createContact(cd);

        app.goTo().homePage();
        Contacts after = app.contact().all();
        assertThat(after.size(), equalTo(before.size() + 1));

        assertThat(after, equalTo(
                before.withAdded(cd.withId(after.stream().mapToInt(ContactData::getId).max().getAsInt()))));
    }
}
