package constructorTest;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) throws Exception {
        Person person = new Person("Vadim", 21, "Kuznecova 7", "89063154641");
        Fraction fraction = new Fraction(1,20);

    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age, String adress, String phone) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110) this.age = age;
    }
}

class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}