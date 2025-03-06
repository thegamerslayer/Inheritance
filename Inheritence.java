package Practice_2nd;

class Student{
    String name;
    int age;
    void output(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

class Teacher extends Student{
        int salary;
        void output1(){
            System.out.println("Salary : "+salary);
        }
}

class Professor extends Teacher{

}

class Clerk extends Student {
    int employeeNumber;
    void output2(){
        System.out.println("Employee ID : "+employeeNumber);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        /*Professor professor=new Professor();
        professor.name="Debanjan";
        professor.age=20;
        professor.salary=20000;
         */

        Clerk clerk=new Clerk();
        clerk.employeeNumber=106;
        clerk.output2();
    }
}
