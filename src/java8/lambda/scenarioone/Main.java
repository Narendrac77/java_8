package src.java8.lambda.scenarioone;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


    }

    public static void printPersons(List<Person> roster, Predicate<Person> tester) {

        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }

        }
    }

    /*CheckPerson printPerson = new CheckPerson() {
        @Override
        public boolean test(Person p) {
            return p.getGender() == Person.Sex.MALE
                    && p.getAge() >= 18
                    && p.getAge() <= 25;
        }
    };*/   //Above code is replaced with lambda Expression

    CheckPerson printPerson = p -> p.getGender() == Person.Sex.MALE
            && p.getAge() >= 18
            && p.getAge() <= 25;
         }

   /* public void printPersons(
                List<Person> roster,
                new CheckPerson() {
                    public boolean test(Person p) {
                        return p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25;
                    }
                }
        );*/


