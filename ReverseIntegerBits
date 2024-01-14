public class ReverseBitsWithoutFunction {
    public static void main(String[] args) {
        int num = 25; // You can change this to any integer you want to reverse the bits for
        System.out.println("Original number: " + Integer.toBinaryString(num));

        int reversedNum = 0;

        // Iterate through each bit in the integer
        for (int i = 0; i < 32; i++) {
            // Extract the rightmost bit from the input number
            int bit = (num >> i) & 1;

            // Set the corresponding bit in the reversed number
            reversedNum |= bit << (31 - i);
        }

        System.out.println("Reversed number: " + Integer.toBinaryString(reversedNum));
    }
}
