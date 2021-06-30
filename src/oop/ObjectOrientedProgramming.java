package oop;

public class ObjectOrientedProgramming {


    public static void main(String[] args) {
        // tell me about a person

        Person person = new Person();

        person.setName("Amado");

        System.out.println(person.getEntertainment("ride rollercoasters"));

        Person tiffanyPerson = new Person();
        tiffanyPerson.setName("Tiffany");
        System.out.println(tiffanyPerson.getEntertainment("tubing the river"));


    }



}
