/**
 * Created by abel on 29-01-2015.
 */


/*
 The constructors have no explicit return type
 Use to give initial values to the instance variables defined by the class
 java automatically provides constructors to classes
 */

public class MethodsConstructors {

    public static void main(String args[]) {
        MyClass t1 = new MyClass(10);         //declara t1 i li diu que pertany a la clase MyClass i li pasa el valor 10
        MyClass t2 = new MyClass(20);
        System.out.println(t1.x + " " + t2.x);    //imprimeix el valor de la x de MyClass
    }
}

class MyClass {
    int x;

    // Following is the constructor
    MyClass(int i ) {
        x = i+1;                     //he fet que modifiqui el parametre que li pasa
    }
}