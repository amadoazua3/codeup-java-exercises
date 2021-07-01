public class Person {

    private String name;

    public static void main(String[] args) {

//        The class should have a constructor that accepts a `String` value and sets
//        the person's name to the passed string.

//        Create a `main` method on the class that creates a new `Person` object and
//        tests the above methods.

        Person person = new Person("Amado");

//        person.setName("Jesse");
        person.sayHello();


    }

    public Person(){}

    public Person(String name){
      this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name

        System.out.println("Hello " + this.name + "!");

    }


}
