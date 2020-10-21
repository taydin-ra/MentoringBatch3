package arrays;

public class StringReverse {
    public static void main(String[] args) {
        String[] str = {"Cumming", "Garfield", "Alpharetta"};

        for (int i = str.length - 1; i >= 0; i--) {
           // System.out.print(str[i]);
            char[] c = str[i].toCharArray();
            for (int j = c.length - 1; j >= 0; j--) {
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}
