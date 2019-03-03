package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ContactHelper extends BaseHelper
{

    public ContactHelper(WebDriver wd)
    {
        super(wd);
    }

    public void createContact(ContactData cd)
    {
        fillContactForm(cd, true);
        submitContactCreation();
    }

    public Contacts all()
    {
        Contacts contacts = new Contacts();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for(WebElement e : elements)
        {
            List<WebElement> contactData = e.findElements(By.tagName("td"));
            ContactData cd = new ContactData()
                    .withId(parseInt(contactData.get(0).findElement(By.tagName("input")).getAttribute("value")))
                    .withLastName(contactData.get(1).getText()).withFirstName(contactData.get(2).getText());

            contacts.add(cd);
        }

        return contacts;
    }

    public void selectContactById(int id)
    {
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for(WebElement e : elements)
        {
            WebElement checkbox = e.findElements(By.tagName("td")).get(0).findElement(By.tagName("input"));

            if(id == parseInt(checkbox.getAttribute("value")))
            {
                checkbox.click();
                return;
            }
        }
    }

    public void modify(ContactData contact)
    {
        initContactModificationById(contact.getId());
        fillContactForm(contact, false);
        submitContactModification();
    }
    public void delete(ContactData contact)
    {
        selectContactById(contact.getId());
        deleteSelectedContacts();
    }

    public void fillContactForm(ContactData contactData, boolean creation)
    {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickname());

        if(contactData.getPhotoPath() != null)
        {
            file(By.name("photo"), contactData.getPhotoPath());
        }
        else if(!creation)
        {
            click(By.name("delete_photo"));
        }

        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email"), contactData.getEmail1());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());
        type(By.name("homepage"), contactData.getHomepage());
        select(By.name("bday"), contactData.getDayOfBirthday());
        select(By.name("bmonth"), contactData.getMonthOfBirthday());
        type(By.name("byear"), contactData.getYearOfBirthday());
        select(By.name("aday"), contactData.getDayOfAnniversary());
        select(By.name("amonth"), contactData.getMonthOfAnniversary());
        type(By.name("ayear"), contactData.getYearOfAnniversary());

        if(creation)
        {
            if(contactData.getGroupName() == null)
            {
                select(By.name("new_group"), "[none]");
            }
            else
            {
                select(By.name("new_group"), contactData.getGroupName());
            }
        }
        else
        {
            Assert.assertFalse(isElementPresent(By.name("new group")));
        }
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
    }

    public void submitContactCreation()
    {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void initContactModificationById(int id)
    {
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for(WebElement e : elements)
        {
            List<WebElement> row = e.findElements(By.tagName("td"));
            WebElement checkbox = row.get(0).findElement(By.tagName("input"));

            if(id == parseInt(checkbox.getAttribute("value")))
            {
                row.get(7).click();
                return;
            }
        }
    }

    public void submitContactModification()
    {
        click(By.xpath("(//input[@name='update'])[2]"));
    }

    public void selectAllContacts()
    {
        click(By.id("MassCB"));
    }

    public void deleteSelectedContacts()
    {
        click(By.xpath("//input[@value='Delete']"));
    }

    public boolean isThereAContact()
    {
        return isElementPresent(By.name("selected[]"));
    }
}
