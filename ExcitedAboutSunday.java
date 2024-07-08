package Sept2023Day1;

import java.util.Scanner;

public class ExcitedAboutSunday {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Day name ");
        String dayName=kb.next();
        String[] day={"sun","mon","tue","wed","thur","fri","sat"};
        int i=0;
        for ( i=0;i<day.length;i++)
        {
            if(dayName.equals(day[i]))
               break;
        }
        System.out.println("Enter Number of days ");
        int nday=kb.nextInt();
        int res=0;
        if(nday>=7)
        {
             res=1;
        }
        int rem=6-i;
        nday=nday-rem;
        if(nday>0)
            res+=nday/7;
        System.out.println("Number of sundays "+res);
    }
}
