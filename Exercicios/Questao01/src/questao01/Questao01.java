package questao01;

/**
 *
 * @author Samuel
 */
public class Questao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            x = i;
        }

        System.out.print(x + " ");

    }

}
