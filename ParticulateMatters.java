package Sept2023Day1;

import java.util.Scanner;

public class ParticulateMatters {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elem in array ");
        for (int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("Enter fine amount ");
        int fine= kb.nextInt();
        System.out.println("Enter your date ");
        int date=kb.nextInt();
        int count=0;
        if(date%2==0)
        {
            for (int i=0;i<size;i++)
            {
                if(arr[i]%2!=0)
                    count++;
            }
        }else
        {
            for (int i=0;i<size;i++)
            {
                if(arr[i]%2==0)
                    count++;
            }
        }
        System.out.println("Your total colltected fine "+(count*fine));
    }
}
