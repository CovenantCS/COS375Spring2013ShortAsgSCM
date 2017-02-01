/*
 * Code adapted from StackOverflow
 */

import java.util.Random;

public class Hello {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(capitalizeString(randomString(-229985452)));
        sb.append(" ");
        sb.append("Josh Humpherys");
        System.out.println(sb.toString());
    }

    private static String randomString(int i) {
        Random r = new Random(i);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int k = r.nextInt(27);
            if(k == 0) {
                break;
            }
            sb.append((char)('`' + k));
        }
        return sb.toString();
    }

    private static String capitalizeString(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
