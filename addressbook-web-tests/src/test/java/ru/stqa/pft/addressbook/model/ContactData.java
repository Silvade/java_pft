package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData
{
    private int id = Integer.MAX_VALUE;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nickname;
    private String photoPath;
    private String title;
    private String company;
    private String address;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String fax;
    private String email;
    private String email2;
    private String email3;
    private String homepage;
    private String dayOfBirthday;
    private String monthOfBirthday;
    private String yearOfBirthday;
    private String dayOfAnniversary;
    private String monthOfAnniversary;
    private String yearOfAnniversary;
    private String groupName;
    private String address2;
    private String phone2;
    private String notes;
    private String allPhones;
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

    public String getPhotoPath()
    {
        return photoPath;
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
        return dayOfBirthday;
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
        return dayOfAnniversary;
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

    public ContactData withPhotoPath(String photoPath)
    {
        this.photoPath = photoPath;
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
        this.dayOfBirthday = dayOfBirthday;
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
        this.dayOfAnniversary = dayOfAnniversary;
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
