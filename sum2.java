import java.util.Scanner;
import java.util.ArrayList;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,x[],i,j;
        N=sc.nextInt();
        x=new int[N];
        for(i=0;i<N;i++)
        {
            x[i]=sc.nextInt();
        }
        ArrayList<Integer>b=new ArrayList<Integer>(N);
        for(i=0;i<N;i++)
        {
           b.add(x[i]);
        }
        for(i=0;i<b.size();i++)
        {
            
            for(j=0;j<b.size();j++)
            {
                if(b.get(i)==b.get(j) && i!=j)
                {
                    b.remove(j);
                }
            }
            
        } 
        for(i=0;i<b.size();i++)
        {
            System.out.print(b.get(i)+" ");
        } 
        sc.close(); 
    }
}
