package ru.stqa.pft.addressbook.model;

import com.google.gson.annotations.Expose;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;
import java.util.Objects;

@Entity
@Table(name = "addressbook")
@XStreamAlias("contact")
public class ContactData
{
    @Id
    @XStreamOmitField
    private int id = Integer.MAX_VALUE;
    @Expose
    @Column(name = "firstname")
    private String firstName;
    @Expose
    @Column(name = "middlename")
    private String middleName;
    @Expose
    @Column(name = "lastname")
    private String lastName;
    @Expose
    private String nickname;
    @Type(type = "text")
    private String photo;
    @Expose
    private String title;
    @Expose
    private String company;
    @Expose
    @Type(type = "text")
    private String address;
    @Expose
    @Column(name = "home")
    @Type(type = "text")
    private String homePhone;
    @Expose
    @Column(name = "mobile")
    @Type(type = "text")
    private String mobilePhone;
    @Expose
    @Column(name = "work")
    @Type(type = "text")
    private String workPhone;
    @Expose
    @Type(type = "text")
    private String fax;
    @Expose
    @Type(type = "text")
    private String email;
    @Expose
    @Type(type = "text")
    private String email2;
    @Expose
    @Type(type = "text")
    private String email3;
    @Expose
    @Type(type = "text")
    private String homepage;
    @Expose
    @Column(name = "bday")
    @Type(type = "byte")
    private byte dayOfBirthday;
    @Expose
    @Column(name = "bmonth")
    private String monthOfBirthday;
    @Expose
    @Column(name = "byear")
    private String yearOfBirthday;
    @Expose
    @Column(name = "aday")
    @Type(type = "byte")
    private byte dayOfAnniversary;
    @Expose
    @Column(name = "amonth")
    private String monthOfAnniversary;
    @Expose
    @Column(name = "ayear")
    private String yearOfAnniversary;
    @Expose
    @Transient
    private String groupName;
    @Expose
    @Type(type = "text")
    private String address2;
    @Expose
    @Type(type = "text")
    private String phone2;
    @Expose
    @Type(type = "text")
    private String notes;
    @Transient
    private String allPhones;
    @Transient
    private String allEmails;

    @Override
    public String toString()
    {
        return "ContactData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getNickname()
    {
        return nickname;
    }

    public File getPhoto()
    {
        return new File(photo);
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getCompany()
    {
        return company;
    }

    public String getAddress()
    {
        return address;
    }

    public String getHomePhone()
    {
        return homePhone;
    }

    public String getMobilePhone()
    {
        return mobilePhone;
    }

    public String getWorkPhone()
    {
        return workPhone;
    }

    public String getFax()
    {
        return fax;
    }

    public String getEmail()
    {
        return email;
    }

    public String getEmail2()
    {
        return email2;
    }

    public String getEmail3()
    {
        return email3;
    }

    public String getHomepage()
    {
        return homepage;
    }

    public String getDayOfBirthday()
    {
        return String.valueOf(dayOfBirthday);
    }

    public String getMonthOfBirthday()
    {
        return monthOfBirthday;
    }

    public String getYearOfBirthday()
    {
        return yearOfBirthday;
    }

    public String getDayOfAnniversary()
    {
        return String.valueOf(dayOfAnniversary);
    }

    public String getMonthOfAnniversary()
    {
        return monthOfAnniversary;
    }

    public String getYearOfAnniversary()
    {
        return yearOfAnniversary;
    }

    public String getGroupName()
    {
        return groupName;
    }

    public String getAddress2()
    {
        return address2;
    }

    public String getPhone2()
    {
        return phone2;
    }

    public String getNotes()
    {
        return notes;
    }

    public String getAllPhones()
    {
        return allPhones;
    }

    public String getAllEmails()
    {
        return allEmails;
    }

    public ContactData withId(int id)
    {
        this.id = id;
        return this;
    }

    public ContactData withFirstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    public ContactData withMiddleName(String middleName)
    {
        this.middleName = middleName;
        return this;
    }

    public ContactData withLastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    public ContactData withNickname(String nickname)
    {
        this.nickname = nickname;
        return this;
    }

    public ContactData withPhoto(File photo)
    {
        this.photo = photo.getPath();
        return this;
    }

    public ContactData withTitle(String title)
    {
        this.title = title;
        return this;
    }

    public ContactData withCompany(String company)
    {
        this.company = company;
        return this;
    }

    public ContactData withAddress(String address)
    {
        this.address = address;
        return this;
    }

    public ContactData withHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
        return this;
    }

    public ContactData withMobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public ContactData withWorkPhone(String workPhone)
    {
        this.workPhone = workPhone;
        return this;
    }

    public ContactData withFax(String fax)
    {
        this.fax = fax;
        return this;
    }

    public ContactData withEmail(String email)
    {
        this.email = email;
        return this;
    }

    public ContactData withEmail2(String email2)
    {
        this.email2 = email2;
        return this;
    }

    public ContactData withEmail3(String email3)
    {
        this.email3 = email3;
        return this;
    }

    public ContactData withHomepage(String homepage)
    {
        this.homepage = homepage;
        return this;
    }

    public ContactData withDayOfBirthday(String dayOfBirthday)
    {
        this.dayOfBirthday = Byte.parseByte(dayOfBirthday);
        return this;
    }

    public ContactData withMonthOfBirthday(String monthOfBirthday)
    {
        this.monthOfBirthday = monthOfBirthday;
        return this;
    }

    public ContactData withYearOfBirthday(String yearOfBirthday)
    {
        this.yearOfBirthday = yearOfBirthday;
        return this;
    }

    public ContactData withDayOfAnniversary(String dayOfAnniversary)
    {
        this.dayOfAnniversary = Byte.parseByte(dayOfAnniversary);
        return this;
    }

    public ContactData withMonthOfAnniversary(String monthOfAnniversary)
    {
        this.monthOfAnniversary = monthOfAnniversary;
        return this;
    }

    public ContactData withYearOfAnniversary(String yearOfAnniversary)
    {
        this.yearOfAnniversary = yearOfAnniversary;
        return this;
    }

    public ContactData withGroupName(String groupName)
    {
        this.groupName = groupName;
        return this;
    }

    public ContactData withAddress2(String address2)
    {
        this.address2 = address2;
        return this;
    }

    public ContactData withPhone2(String phone2)
    {
        this.phone2 = phone2;
        return this;
    }

    public ContactData withNotes(String notes)
    {
        this.notes = notes;
        return this;
    }

    public ContactData withAllPhones(String allPhones)
    {
        this.allPhones = allPhones;
        return this;
    }

    public ContactData withAllEmails(String allEmails)
    {
        this.allEmails = allEmails;
        return this;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, firstName, lastName);
    }
}
