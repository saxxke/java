import java.util.ArrayList;

public class IntToIntarr {
    public static void main(String[] args) {
        int t = 45212558;
        int[] digits = convertToDigits(t);
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }

    public static int[] convertToDigits(int number) {
        ArrayList<Integer> digitList = new ArrayList<>();
        while (number > 0) {
            int digit = number % 10;
            digitList.add(0, digit);
            number /= 10;
        }
        int[] digits = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            digits[i] = digitList.get(i);
        }
        return digits;
    }
}
