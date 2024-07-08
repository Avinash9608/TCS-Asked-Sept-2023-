package Sept2023Day1;

import java.util.Scanner;

public class ChocolateFactory {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of chocolate Packet");
        int N=kb.nextInt();
        System.out.println("Enter packets ");
        int[] choArray=new int[N];
        for (int i=0;i<N;i++)
        {
            choArray[i]=kb.nextInt();
        }
        for (int i=0;i<N-1;i++)
        {

            if(choArray[i]==0)
            {
                int x=i+1;
                while (x<N)
                {
                    if(choArray[x]==0)
                        x++;
                        break;
                }
                if(x<N) {
                    int temp = choArray[x];
                    choArray[i] = temp;
                    choArray[x] = 0;
                }
            }
        }
        for (int x:choArray)
            System.out.print(x+" ");
    }
}
