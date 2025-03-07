import java.util.Scanner;
import java.util.ArrayList;
public class NextGreatestElement{
    public static ArrayList<Integer> nextLargerElement(int[] arr){
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(-1);
        }
    
        for(int i=0;i<n;i++ ){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    res.set(i,arr[j]);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        sc.close();
        ArrayList<Integer> res=nextLargerElement(arr);
        for(int x:res){
            System.out.println(x+" ");
        }
    }
}