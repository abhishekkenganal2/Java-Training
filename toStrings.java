
class Employee {
    String name;
    int age;

    Employee() {
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age + " Hello Abhi";
    }
}

public class toStrings {
    public static void main(String[] args) {
        Employee emp = new Employee("Java", 21);
        System.out.println(emp);
        Employee e1 = new Employee("Java",21);
        System.out.println(emp == e1);
        System.out.println(emp.equals(e1));
    }
}
