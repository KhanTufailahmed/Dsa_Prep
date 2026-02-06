package BasicPattern;
// *****
// *   *
// *   *
// *****
public class Patt2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                if (i == 1 || j == 1 || i == y || j == x) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
