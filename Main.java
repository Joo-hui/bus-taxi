import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArray = new int[]{1, 2, 3, 4,5};
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length-1]);

        char c = 's';
        int n = 10;

        System.out.println(c);
        System.out.println(n);

        int[] numArray = new int[]{10, 20, 30};
        System.out.println(numArray[numArray.length -1]);

    }
}