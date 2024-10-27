public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void personName(){
        System.out.println("Person Name:" +name);
    }

    public void personAge(){
        System.out.println("Person Age:" +age);
    }

    public void displayPersonDetails(){
        System.out.println("Person Details Name:"+name+ "," + "Age:"+age);
    }

    public static void main(String[] args) {
        Person person = new Person("Yukti",1);
        person.personName();
        person.personAge();
        person.displayPersonDetails();

    }
}
