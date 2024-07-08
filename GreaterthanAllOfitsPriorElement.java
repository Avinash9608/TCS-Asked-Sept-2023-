package Sept2023Day1;

import java.util.Scanner;

public class GreaterthanAllOfitsPriorElement {
    public static void main(String[] args) {
//        int[] arr={3,4,5,8,9};
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size= kb.nextInt();
        if (size < 1 || size > 20) {
            System.out.println("Invalid input size. Size should be between 1 and 20.");
            return;
        }
        int[] arr=new int[size];
        System.out.println("Enter element in array (1<=Arr[i]<=10000)");
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter element at index "+i);
            arr[i]= kb.nextInt();
        }


        int result=1;
        boolean res=false;
        for(int i=1;i<arr.length;i++)
        {
            int count=i;
            while (count>0) {
                count--;

                if (arr[i] > arr[count]) {
                    res = true;

                }else {
                    res=false;
                }
            }
            if(res==true)
                ++result;
        }
        System.out.println(result);
    }
}
