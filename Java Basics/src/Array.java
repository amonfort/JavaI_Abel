public class Array {

    public static void main(String[] args) {

        //double[] myList;         // declare preferred way.
        //double myList[];         // declare works but not preferred way.
        //double[] myList = new double[10];        //create
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);

        // foreach Print all the array elements
        for (double element : myList) {            //crea una mena de variable que hi posa tot el contingut del array
            System.out.println(element);
        }
    }
}