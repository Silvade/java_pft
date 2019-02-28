package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends BaseHelper
{

    public ContactHelper(WebDriver wd)
    {
        super(wd);
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

    public void initContactModification(int index)
    {
        List<WebElement> elements = wd.findElements(By.name("entry"));
        elements.get(index).findElements(By.tagName("td")).get(7).click();
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

    public void selectContact(int index)
    {
        List<WebElement> elements = wd.findElements(By.name("entry"));
        elements.get(index).findElements(By.tagName("td")).get(0).click();
    }

    public boolean isThereAContact()
    {
        return isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactData cd)
    {
        fillContactForm(cd, true);
        submitContactCreation();
    }

    public List<ContactData> getContactList()
    {
        List<ContactData> contacts = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for(WebElement e : elements)
        {
            List<WebElement> contactData = e.findElements(By.tagName("td"));
            ContactData cd = new ContactData(contactData.get(2).getText(), null, contactData.get(1).getText(), null, null,
                    null, null, null, null, null, null,
                    null, null, null, null, null,
                    null, null, null, null, null,
                    null, null, null, null, null);

            contacts.add(cd);
        }

        return contacts;
    }
}
