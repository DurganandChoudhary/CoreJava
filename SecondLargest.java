package Array;

import java.util.Arrays;

public class SecondLargest {

    static void print2ndlargest(int arr[],int size)
    {
        int i,first,second;

        if(size<2)
        {
            System.out.println("Invalid input....");
            return;
        }
        Arrays.sort(arr);

        for(i=size-2;i>=0;i--)
        {
            if(arr[i] != size-1)
            {
                System.out.println("Second largest element is \n"+arr[i]);
                return;
            }
        }
        System.out.println("There is no second largest element");

    }

    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,2};
        int n=arr.length;
        print2ndlargest(arr, n);
        
    }
    
}
