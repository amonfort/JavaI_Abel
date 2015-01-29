/**
 * Created by abel on 29-01-2015.
 */
public class DecissionMakingIf {

    public static void main(String args[]){
        //if
        int x = 10;

        if( x < 20 ){
            System.out.print("x=" + x + " and is smaller than 10 \n");
        }
        if( x > 5 ){
            System.out.print("x=" + x + " and is bigger than 5 \n");
        }

        //if... else
        int y = 30;

        if( y < 20 ){
            System.out.print("Y=" + y + " and is smaller than 20 \n");
        }else{
            System.out.print("Y=" + y + " and is bigger than 20 \n");
        }

        //if... else... if
        int z = 30;
        System.out.print("Z=" + z + "\n");


        if( z == 10 ){
            System.out.print("Value of Z is 10 \n");
        }else if( z == 20 ){
            System.out.print("Value of Z is 20 \n");
        }else if( z == 30 ){
            System.out.print("Value of Z is 30 \n");
        }else{
            System.out.print("This is else statement \n");
        }

        //Nested if... else
        int a = 30;
        int b = 10;

        if( a == 30 ){
            if( b == 10 ){
                System.out.print("X = 30 and Y = 10");
            }
        }
    }


}

/*
    public class ArrayFromMethod {
        public static void main(String args[]){
            int x = 10;
            if( x < 20 ){
                System.out.print("This is if statement");
            }
        }
    }
    public class Test {
       public static void main(String args[]){
          int x = 30;
          if( x < 20 ){
             System.out.print("This is if statement");
          }else{
             System.out.print("This is else statement");
          }
       }
    }
        public class Test {
       public static void main(String args[]){
          int x = 30;
          if( x == 10 ){
             System.out.print("Value of X is 10");
          }else if( x == 20 ){
             System.out.print("Value of X is 20");
          }else if( x == 30 ){
             System.out.print("Value of X is 30");
          }else{
             System.out.print("This is else statement");
          }
       }
    }
        public class Test {
           public static void main(String args[]){
              int x = 30;
              int y = 10;
              if( x == 30 ){
                 if( y == 10 ){
                     System.out.print("X = 30 and Y = 10");
                  }
               }
            }
        }
 */