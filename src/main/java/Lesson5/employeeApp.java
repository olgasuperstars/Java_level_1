package Lesson5;

public class employeeApp {
    public static void main(String[] args) {
        employee employee1 = new employee();
        System.out.println(employee1.name + ", " + employee1.position + ", " + employee1.mail + ", " + employee1.cell + ", "+  employee1.age);
employee1.name = "Иванов Иван Иванович";
employee1.position = "Директор";
employee1.mail = "iv@mail.ru";
employee1.cell = 678;
employee1.age = 45;



    }
}
