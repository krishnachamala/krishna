import java.io.*;
import java.util.Scanner;
class sum5{
    public static void main(String args[]){
        String line=null;
        int tt=0;
        float tb=0;
        float max=0;
        float min=9999;
        try{
        BufferedReader buf = new BufferedReader(new FileReader("data.csv"));
            while ((line = buf.readLine()) != null)   
          {  
	     String[] tr = line.split(",");
	    tb+=Float.parseFloat(tr[3]);
            tt++;
        if(Float.parseFloat(tr[3])>max){
            max=Float.parseFloat(tr[3]);
        }
        if(Float.parseFloat(tr[3])<min){
        min=Float.parseFloat(tr[3]);
        }
	   }  
       
    }
    catch (IOException e)   
	{  
		e.printStackTrace();  
	} 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice:\n");
    System.out.println("1.Total number of Transactions");
    System.out.println("2.Total bill amount");
    System.out.println("3.Maximum bill amount");
    System.out.println("4.Minimum bill amount");
    int n=sc.nextInt();
    sc.close();
    if(n==1){
        System.out.println("Total no.of transactions: "+tt);
    }
    if(n==2){
        System.out.println("Total Bill Amount: "+tb);
    }
    if(n==3)
    System.out.println("Maximum Bill Amount: "+max);
    if(n==4)
    System.out.println("Minimum Bill Amount: "+min);
    }
}