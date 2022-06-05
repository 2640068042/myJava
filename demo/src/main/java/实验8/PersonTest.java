package 实验8;

import java.util.Date;
/*
书p400
11.2
2022.5.6
 */
public class PersonTest {
    public static void main(String[] args) {
        Person a=new Person("xaio","nanchang","1234","5678");
        System.out.println(a.toString());
        Student b=new Student("xaio","nanchang","1234","5678",Student.grade1);
        System.out.println(b.toString());
        Employee c=new Employee();
        System.out.println(c.toString());
        Faculty d=new Faculty();
        System.out.println(d.toString());
        Staff e=new Staff();
        System.out.println(e.toString());
    }
}
//Person类
class Person {
    String name = "xiaohong";
    String adress = "tianjian19";
    String telephone = "123456";
    String email = "theEmail";

    public Person() {
    }

    public Person(String name, String adress, String telephone, String email) {
        this.name = name;
        this.adress = adress;
        this.telephone = telephone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person  "+name;
    }
}
//Student类
class Student extends Person{
    public static String grade1="大一";
    public static String grade2="大二";
    public static String grade3="大三";
     String grade=grade1;
    public Student(){
    }

    public Student(String name, String adress, String telephone, String email,String grade) {
        super(name, adress, telephone, email);
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Student  "+name;
    }
}
//Employee类
class Employee extends Person{
    final String office="theOffice";
    final  int salary=3000;
    MyDate employdate=new MyDate();
    public Employee(){
    }

    public Employee(String name, String adress, String telephone, String email, MyDate employdate) {
        super(name, adress, telephone, email);
        this.employdate = employdate;
    }

    public String toString(){
        return "Employee  "+name;
    }
}
//Faculty类
class Faculty extends Employee{
    final String worktime="10years";
    final String level="4";
    public Faculty(){}

    public Faculty(String name, String adress, String telephone, String email, MyDate employdate) {
        super(name, adress, telephone, email, employdate);
    }

    public String toString(){
        return "Faculty  "+name;
    }
}
//Staff类
class Staff extends Employee{
    final String title="nb";
    public Staff(){}

    public Staff(String name, String adress, String telephone, String email, MyDate employdate) {
        super(name, adress, telephone, email, employdate);
    }

    public String toString(){
        return "Staff  "+name;
    }
}
//MyDate类
class MyDate{
    int year;
    int month;
    int day;
    public MyDate(){
       this(System.currentTimeMillis());
    }
    public MyDate(long currentTime){
        Date now=new Date(currentTime);
        new MyDate(now.getYear(),now.getMonth(),now.getDate());
    }
    public MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
}