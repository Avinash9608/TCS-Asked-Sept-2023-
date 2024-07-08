package Sept2023Day1;

import java.util.Scanner;

public class FurnishingCompany {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your input (String)");
        String input=kb.next();
        System.out.println("Enter length of subString ");
        int lenSubStr=kb.nextInt();
        char ch='a';
        int max=Integer.MIN_VALUE;
        for (int i=0;i<input.length()-lenSubStr;i++)
        {
            String res=input.substring(i,i+lenSubStr);
            int count=0;
            for (int j=0;j<res.length();j++)
            {
                if(ch==res.charAt(j))
                    count++;
            }
            max=Math.max(count,max);
        }
        System.out.println(max);
    }
}
