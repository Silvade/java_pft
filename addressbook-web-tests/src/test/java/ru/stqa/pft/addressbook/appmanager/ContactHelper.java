package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends BaseHelper
{

    public ContactHelper(WebDriver wd)
    {
        super(wd);
    }

    public void fillContactForm(ContactData contactData)
    {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickname());
        file(By.name("photo"), contactData.getPhotoPath());
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
        select(By.name("new_group"), contactData.getGroupName());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
    }

    public void modifyContactForm(ContactData contactData)
    {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickname());
        if("".equals(contactData.getPhotoPath()))
        {
            click(By.name("delete_photo"));
        }
        else
        {
            file(By.name("photo"), contactData.getPhotoPath());
        }
        type(By.name("company"), contactData.getCompany());
        type(By.name("title"), contactData.getTitle());
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
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
    }

    public void submitContactCreation()
    {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void initContactModification(int number)
    {
        click(By.id("logo"));
        click(By.xpath("(//img[@alt='Edit'])[" + number + "]"));
    }

    public void submitContactModification()
    {
        click(By.xpath("(//input[@name='update'])[2]"));
    }
}
