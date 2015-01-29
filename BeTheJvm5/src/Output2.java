/**
 * Created by abel on 29-01-2015.
 */
public class Output2 {

    public static void main(String [] args) {
        Output2 o = new Output2();
        o.go();

        int x = 5, y = 5;

        /*System.out.println(++x); // outputs 6
        System.out.println(x); // outputs 6

        System.out.println(y++); // outputs 5
        System.out.println(y); // outputs 6*/
    }


    // because ++x is preincrement
    //         x++ is postincrement

    void go() {

        int y = 7;
        for(int x = 1; x < 8; x++) {
            y++;

            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println("x = " + x);
                break;
            }
        }
    }
}
