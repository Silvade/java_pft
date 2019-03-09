package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactPhoneTests extends TestBase
{
    @BeforeMethod
    public void ensurePreconditions()
    {
        app.goTo().homePage();
        if(app.contact().all().size() == 0)
        {
            File photo = new File("src/test/resources/Aleksandr_Golovin.jpg");
            ContactData cd = new ContactData().withFirstName("Aleksandr").withMiddleName("Sergeyevich").withLastName("Golovin").withNickname("Chick")
                    .withPhoto(photo).withTitle("Footballer")
                    .withCompany("AS Monaco FC").withAddress("Stade Louis II, Fontvielle, Monaco")
                    .withHomePhone("472-890").withMobilePhone("88002253535").withWorkPhone("123456").withFax("654321")
                    .withEmail("mail@mail.ru").withEmail2("mail1@mail.ru").withEmail3("mail2@mail.ru")
                    .withHomepage("www.asmonaco.com").withDayOfBirthday("30").withMonthOfBirthday("May").withYearOfBirthday("1996")
                    .withDayOfAnniversary("27").withMonthOfAnniversary("July").withYearOfAnniversary("2018")
                    .withAddress2("Kaltan, Russia").withPhone2("2-10-64").withNotes("He played for PFC CSKA Moscow.");

            app.goTo().newContactPage();
            app.contact().createContact(cd);
            app.goTo().homePage();
        }
    }

    @Test
    public void testContactPhones()
    {
        app.goTo().homePage();
        ContactData cd = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(cd);

        assertThat(cd.getAllPhones(), equalTo(mergePhones(contactInfoFromEditForm)));
    }

    private String mergePhones(ContactData contact)
    {
        return Arrays.asList(contact.getHomePhone(), contact.getMobilePhone(), contact.getWorkPhone(), contact.getPhone2())
                .stream().filter((s) -> !s.equals(""))
                .map(ContactPhoneTests::cleaned)
                .collect(Collectors.joining("\n"));
    }

    public static String cleaned(String phone)
    {
        return phone.replaceAll("\\s", "").replaceAll("[-()]", "");
    }
}
