/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.*/
abstract class Bank     //abstract class
{
    abstract void getBalance();     ////abstract method
}
class BankA extends Bank        //Inherit class
{
    void getBalance()
    {
        System.out.println("$100 is deposited in bank A");
    }
}
class BankB extends Bank        //Inherit class
{
    void getBalance()
    {
        System.out.println("$150 is deposited in bank B");
    }
}
class BankC extends Bank        //Inherit class
{
    void getBalance()
    {
        System.out.println("$200 is deposited in bank C");
    }
}
class Abst2
{
    public static void main(String args[])
    {
       Bank b1 =new BankA();    //(Factory method) Instance creation
        b1.getBalance();        //Method call
        Bank b2 =new BankB();   // Instance creation
        b2.getBalance();        //Method call       
        Bank b3 =new BankC();   // Instance creation
        b3.getBalance();        //Method call
    }
}