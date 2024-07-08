package Sept2023Day1;

import java.util.Scanner;

public class InternationalRound {
    private static int PossibleWay(int x)
    {
        if(x<=2)
            return -1;
        int res=2;
        for (int i=x-1;i>=1;i--)
        {
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter value of N");
        int N=kb.nextInt();
        int result=PossibleWay(N);
        System.out.println(" Possible ways of seating the members "+result);
    }
}
