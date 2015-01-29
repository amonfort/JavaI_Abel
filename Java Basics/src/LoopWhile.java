public class LoopWhile {

    public static void main(String args[]) {
        int x = 10;

        while( x < 20 ) {
            System.out.print("value of x : " + x );
            int y = 0;
            while ( y < x){ //aquest while escriu tante sestrelletes com numeros
                System.out.print(" * ");
                y++;
            }
            x++;
            System.out.print("\n");
        }
    }
}

/*
public class LoopWhile {
    public static void main(String args[]) {
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
    }
}
 */