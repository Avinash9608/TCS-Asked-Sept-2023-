package Sept2023Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class oddOccurringElement {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=kb.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter element in array ");
        for (int i=0;i<size;i++)
        {
            arr[i]=kb.nextInt();
        }
        Map<Integer, Integer> hm=new HashMap<>();
        for (int i=0;i<size;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        for (Map.Entry<Integer,Integer> entry: hm.entrySet())
        {
            if(entry.getValue()%2!=0)
            {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
