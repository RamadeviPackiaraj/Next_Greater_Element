import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;
public class NextGreatestElement_Stack{
    public static ArrayList<Integer> nextLargestElement(int[] arr){
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
       //Initialize res with -1
        for(int i=0;i<n;i++){
            res.add(-1);
        }//traverse the array from right to left
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty()&&stk.peek()<=arr[i]){
                stk.pop();
            }//Asign next greater nextLargestElement
            if(!stk.isEmpty()){
                res.set(i,stk.peek());
            }
            stk.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        // Get array elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> res = nextLargestElement(arr);
        
        System.out.println("Next Greater Elements:");
        for (int x : res) {
            System.out.print(x + " ");
        }
        
        sc.close();
    }
}