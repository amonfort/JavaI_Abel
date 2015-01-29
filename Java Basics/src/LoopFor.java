public class LoopFor {

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90,};
        String [] names ={"Abel", "Daniel", "Irene", "Rita", "Dani"};

        for(int x = 0; x < 5; x = x+1) {     //inicia, expresió boleana, update
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
        for(int x : numbers ){            //recorre un vector
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");           //recorre un string

        for( String name : names ) {
            System.out.print( name );
            System.out.print(", ");
        }
    }
}

//recorda que es poden posar break; i continue;

/*
public class LoopFor {
    public static void main(String args[]) {
        for(int x = 10; x < 20; x = x+1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
    }
}
public class Test {
   public static void main(String args[]){
      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names ={"James", "Larry", "Tom", "Lacy"};
      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
   }
}
 */