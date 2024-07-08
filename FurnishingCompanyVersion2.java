package Sept2023Day1;

import java.util.Scanner;

public class FurnishingCompanyVersion2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input (String)");
        String input=kb.next();
        System.out.println("Enter length of subString ");
        int lenSubStr=kb.nextInt();
        char ch='a';
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int i=0;i<input.length();i++)
        {
            if(i%lenSubStr==0)
            {
                max=Math.max(max,count);
                count=0;
            }
            if(input.charAt(i)==ch)
                count++;
        }
        System.out.println(max);
    }
}
