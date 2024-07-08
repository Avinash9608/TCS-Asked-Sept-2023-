package Sept2023Day1;

import java.util.Scanner;

public class TogglingAllBits {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter decimal number ");
        int n=kb.nextInt();
        int togglingBit=n^((1 << Integer.toBinaryString(n).length()) - 1);
        System.out.println("TogglingBit "+togglingBit);
    }
}
