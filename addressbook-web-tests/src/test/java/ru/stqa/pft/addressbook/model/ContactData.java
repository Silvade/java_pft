package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData
{
    private final int id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickname;
    private final String photoPath;
    private final String title;
    private final String company;
    private final String address;
    private final String homePhone;
    private final String mobilePhone;
    private final String workPhone;
    private final String fax;
    private final String email1;
    private final String email2;
    private final String email3;
    private final String homepage;
    private final String dayOfBirthday;
    private final String monthOfBirthday;
    private final String yearOfBirthday;
    private final String dayOfAnniversary;
    private final String monthOfAnniversary;
    private final String yearOfAnniversary;
    private final String groupName;
    private final String address2;
    private final String phone2;
    private final String notes;

    public ContactData(int id, String firstName, String middleName, String lastName, String nickname, String photoPath,
                       String title, String company, String address,
                       String homePhone, String mobilePhone, String workPhone, String fax,
                       String email1, String email2, String email3, String homepage,
                       String dayOfBirthday, String monthOfBirthday, String yearOfBirthday,
                       String dayOfAnniversary, String monthOfAnniversary, String yearOfAnniversary,
                       String groupName, String address2, String phone2, String notes)
    {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.photoPath = photoPath;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.fax = fax;
        this.email1 = email1;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.dayOfBirthday = dayOfBirthday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearOfBirthday = yearOfBirthday;
        this.dayOfAnniversary = dayOfAnniversary;
        this.monthOfAnniversary = monthOfAnniversary;
        this.yearOfAnniversary = yearOfAnniversary;
        this.groupName = groupName;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
    }

    public ContactData(String firstName, String middleName, String lastName, String nickname, String photoPath,
                       String title, String company, String address,
                       String homePhone, String mobilePhone, String workPhone, String fax,
                       String email1, String email2, String email3, String homepage,
                       String dayOfBirthday, String monthOfBirthday, String yearOfBirthday,
                       String dayOfAnniversary, String monthOfAnniversary, String yearOfAnniversary,
                       String groupName, String address2, String phone2, String notes)
    {
        this.id = Integer.MAX_VALUE;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.photoPath = photoPath;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.fax = fax;
        this.email1 = email1;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.dayOfBirthday = dayOfBirthday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearOfBirthday = yearOfBirthday;
        this.dayOfAnniversary = dayOfAnniversary;
        this.monthOfAnniversary = monthOfAnniversary;
        this.yearOfAnniversary = yearOfAnniversary;
        this.groupName = groupName;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
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

    public String getEmail1()
    {
        return email1;
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
}
