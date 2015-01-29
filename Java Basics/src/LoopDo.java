public class LoopDo {

    public static void main(String args[]){
        int x = 1;
        int y;
        do{
            System.out.print("value of x : " + x );
            y=x-1;
            do{   //countdown to 0
                System.out.print(" " + y);
                y--;
            }while (y >= 0);
            x++;
            System.out.print("\n");
        }while( x < 20 );
    }
}

/*
public class LoopDo {
   public static void main(String args[]){
      int x = 10;
      do{
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }while( x < 20 );
   }
}
 */