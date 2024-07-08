package Sept2023Day1;

import java.util.Scanner;

public class IntelligenceAgency {
    private static int sumOfNo(int no)
    {
        int temp=no;
        int sum=0;
        while (temp>0)
        {
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Value of N");
        int n=kb.nextInt();
        System.out.println("Value of R");
        int r=kb.nextInt();
        int result=sumOfNo(n)*r;
        if(r==0)
            System.out.println("0");
        else {
             if(Integer.toString(result).length()>=2)
                 result=sumOfNo(result);
        }
        System.out.println(result);
    }
}
