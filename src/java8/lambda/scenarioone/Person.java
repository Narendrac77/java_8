package src.java8.lambda.scenarioone;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        LocalDate localDate = LocalDate.now();
        return Period.between(birthday,localDate).getDays();
    }

    public Sex getGender(){
        return gender;
    }



    public void printPerson() {
        // ...
    }
}
