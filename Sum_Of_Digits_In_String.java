package string;
public class Sum_Of_Digits_In_String {
    public static void main(String[] args) {
        String input = "giris100tech30hub20";
        int sum = calculateSumOfDigits(input);
        System.out.println("Sum of digits in the string: " + sum);
    }

    public static int calculateSumOfDigits(String str) {
        int sum = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber.append(ch);
            } else {
                if (currentNumber.length() > 0) {
                    sum += Integer.parseInt(currentNumber.toString());
                    currentNumber.setLength(0);
                }
            }
        }
        // Add the last number if it exists
        if (currentNumber.length() > 0) {
            sum += Integer.parseInt(currentNumber.toString());
        }
        return sum;
    }
}
