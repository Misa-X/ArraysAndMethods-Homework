package week5;
import java.util.*;
import java.util.Arrays;



public class Utility {

    public void methods(){
        System.out.println("\nNumber 1: ");

        int[] arr = {2, 4, 6, 8, 10};
        int[] arr2 = new int[arr.length+1];
        int max = arr[0];
        int max2 = arr[0];
        int h = 0;


        for(int i=0 ; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                h = i;

            }
        }
        System.out.println(max);
        for(int i = 0;i<arr.length;i++) {
            if (arr[i] < max && arr[i] > max2) {
                max2 = arr[i];
            }
        }
        for(int i=0;i<h;i++){
            arr2[i]= arr[i];
        }
        arr2[h] = max2;
        arr2[h+1]= max-max2;

        for(int i = h+2;i<arr.length;i++){
            arr2[i] = arr[i-1];
        }
        for(int i = h+2;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }

    public void shift(){
        System.out.println("\nNumber 2: ");

        int arr[] = { 2,4,6,8,10 };
        System.out.println(Arrays.toString(arr));

        int pos = arr[4];

        for(int i = 4; i>=1; i--)
        {
            arr[i]=arr[i-1];

        }
        arr[0]=pos;

        System.out.println(Arrays.toString(arr));
    }

    public void matrix(){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int lengthAr1 = arr[0].length;
        int length = arr.length;

        if(lengthAr1==arr.length) {
            for(int i=0;i<length;i++)
            {
                for(int j=0;j<lengthAr1;j++) {
                    arr[i][j]=arr[j][i];
                }
            }
        }
        int x=0;
        for(int i=0;i<length;i++)
            for(int j=0;j<lengthAr1;j++)
                if(arr[i][j]==arr[i][j])
                    x=1;
        if(x==1)
            System.out.println("Matrix is symmetric");
        else
            System.out.println("Matrix is not symmetric");
    }
}


