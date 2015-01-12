import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Tushar on 1/12/2015.
 */
public class Main {
    public static void main(String [] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr = getInts(br);
        Sort sort=new Sort(arr);
        String tmp = selectSort(br);
        if(tmp.equalsIgnoreCase("B"))
            System.out.println("sorted using bubble"+sort.sortWithBubble());
        else if(tmp.equalsIgnoreCase("S"))
            System.out.println("sorted using selection"+sort.sortWithSelection());
        else
            System.out.println("Invalid input");


    }

    private static String selectSort(BufferedReader br) throws IOException {
        System.out.println("Enter B for bubble sort Or S for selection sort");
        return br.readLine();
    }

    private static int[] getInts(BufferedReader br) throws IOException {
        String []ip=br.readLine().trim().split(" ");
        int []arr=new int[ip.length];
        for(int i=0;i<ip.length;i++)
        {
            arr[i]=Integer.parseInt(""+ip[i]);
        }
        return arr;
    }
}
