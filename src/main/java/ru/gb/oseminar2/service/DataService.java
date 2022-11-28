package ru.gb.oseminar2.service;

import ru.gb.oseminar2.data.User;

import java.util.List;

public interface DataService {
    void createUser (String firstname, String lastname, String patronymic);

    List<User> getAll ();

    void deleteUser (Long id);
}
