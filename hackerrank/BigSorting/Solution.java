import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        //  Arrays.sort(unsorted);
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int l1 = o1.length();
                int l2 = o2.length();
                if (l1 == l2) {
                    BigInteger b1 = new BigInteger(o1);
                    BigInteger b2 = new BigInteger(o2);
                    return b1.compareTo(b2);
                }
                else
                    return l1 -l2;

            }
        };
        Arrays.sort(unsorted, stringComparator);
        // System.out.println ("output");
        for (int i = 0; i < n ; i ++) {
            System.out.println (unsorted[i]);
        }
    }
}