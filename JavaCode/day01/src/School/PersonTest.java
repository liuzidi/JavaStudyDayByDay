package School;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "孙悟空";
        p1.age = 18;
        p1.sex = 1;
        p1.showAge();
        p1.study();
        int newAge = p1.addAge(20);
        p1.showAge();
        System.out.println(newAge);
        System.out.println("System.out:");
    }
}
