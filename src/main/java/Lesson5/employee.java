package Lesson5;

public class employee {
    public int salary;
    public String name;
    public String position;
    public String mail;
    public int age;
    public int cell;
public employee(String name, String position, String mail, int cell, int salary,int age) {
    this.name = name;
    this.position = position;
    this.mail = mail;
    this.cell = cell;
    this.salary = salary;
    this.age = age;
}
public void info(){
    System.out.println(this.name + ", " + this.position + ", " + this.mail + ", " + this.cell + ", " + this.salary + ", " + this.age);
}



}
