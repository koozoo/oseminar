package ru.gb.oseminar2.data;

public abstract class User {
    private String firstname, lastname, patronymic;

    public User(String firstname, String lastname, String patronymic) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
