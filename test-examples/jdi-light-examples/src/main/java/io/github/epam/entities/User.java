package io.github.epam.entities;

import com.epam.jdi.tools.DataClass;

public class User extends DataClass<User> {
    public String name = "Roman";
    public String firstName = "Roman";
    public String password = "Jdi1234";
    public String lastName;
    public String acceptConditions;
    public String position;
    public String passportNumber;
    public String passportSeria;
    public String description;
    public String gender;
    public String religion, weather;
}
