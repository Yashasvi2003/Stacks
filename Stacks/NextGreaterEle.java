
import java.util.*;
public class NextGreaterEle {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++)
                arr[i] = scn.nextInt();

            nextLarger(arr);

            t--;
        }

    }

    // Function to print Next Greater Element for each element of the array
    public static void nextLarger(int[] arr) {

// Write Code here
        int[] sol=new int[arr.length];
        Stack <Integer> stak = new Stack <>();
        for(int i=0;i<arr.length;i++){
            while(!stak.isEmpty() && arr[i]>arr[stak.peek()]){
                sol[stak.pop()]=arr[i];
            }
            stak.push(i);
        }
        while(!stak.isEmpty()){
            sol[stak.pop()]=-1;
        }
        for(int j=0;j<sol.length;j++){
            System.out.println(arr[j]+","+sol[j]);
        }
    }
}