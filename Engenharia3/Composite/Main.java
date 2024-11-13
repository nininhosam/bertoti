import java.util.ArrayList;

class Composite {
    public static void main (String[] args){
        Manager m1 = new Manager("Michael");
        Manager m2 = new Manager("Harry");
        Manager m3 = new Manager("Tony");

        Employee e1 = new Employee("Amanda");
        Employee e2 = new Employee("Barney");
        Employee e3 = new Employee("Charles");
        Employee e4 = new Employee("Dante");
        Employee e5 = new Employee("Eugene");
        Employee e6 = new Employee("Fran");
        m3.AddSubordinate(e1);
        m3.AddSubordinate(e2);
        m3.AddSubordinate(e3);

        m2.AddSubordinate(e4);
        m2.AddSubordinate(e5);
        m2.AddSubordinate(m3);

        m1.AddSubordinate(e6);
        m1.AddSubordinate(m2);

        System.out.println(m1.name+" tem "+m1.count()+" Funcionarios em seu time");
    }
}