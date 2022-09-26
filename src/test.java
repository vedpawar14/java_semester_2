/*
 * Program to apply concept of inheritance
 * @author Ved pawar
 * @since 14th sep 2022
 * @version 1.8
 */



 class Person{
    public String name;
    public String dob;

    public Person(){}
    public Person(String name, String dob){
        this.name = name;
        this.dob = dob;

    }

    public String getName()
    {
        return name;
    }

    public String getDob(){
        return dob;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    
 }

 class Student extends Person{
    public String registerNumber;
    public String degree;

    public Student(){}
    public Student(String name, String dob, String registerNumber, String degree){
        super(name,dob);
        this.registerNumber = registerNumber;
        this.degree = degree;

    }

    public String getRegisterNumber()
    {
        return registerNumber;
    }

    public String getDegree(){
        return degree;
    }

    public void setRegisterNumber(String registerNumber){
        this.registerNumber = registerNumber;
    }

    public void setDegree(String degree){
        this.degree = degree;
    } 

    public String toString(){
        return "Student Info=>\n Name: %s, DOB: %s, Register Number: %s, Degree: %s".formatted(super.getName(),super.getDob(),this.getRegisterNumber(),this.getDegree());
    }
 }

public class test {
    public static void main(String[] args) {

         Student stu = new Student("Ved","2003 10 14" ,"21BCE0915","BTech");
         System.out.println(stu.toString());

    }
}
