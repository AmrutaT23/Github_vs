/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.*/
abstract class Marks    //abstract class
{
    abstract double getPercentage();    //abstract method
}
class StudentA extends Marks    //Inherit class
{
    double sub1;
    double sub2;
    double sub3;
    
    StudentA(double s1,double s2,double s3) //Constructor
    {
      this.sub1 = s1;
      this.sub2 = s2;
      this.sub3 = s3;
    }
     double getPercentage()
    {
        return ((sub1+sub2+sub3)/300)*100;
    
    }
}
class StudentB extends Marks    //Inherit class
{
    double sub1;
    double sub2;
    double sub3;
    double sub4;
    
    StudentB(double s1,double s2,double s3,double s4)   //Constructor
    {
        this.sub1 = s1;
        this.sub2 = s2;
        this.sub3 = s3;
        this.sub4 = s4;
    }
    double getPercentage()
    {
        return ((sub1+sub2+sub3+sub4)/400)*100;
        
    }
}
class Abst3
{
    public static void main(String args[])
    {
        Marks m1 = new StudentA(50,66,75);  //(Factory method) Instance creation
        System.out.println("Percentage of student A is:"+m1.getPercentage());

        Marks m2 = new StudentB(50,66,75,85);   //(Factory method) Instance creation
        System.out.println("Percentage of student B is:"+m2.getPercentage());
    }
}