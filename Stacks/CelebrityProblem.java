import java.util.*;
public class CelebrityProblem {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]array=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        Stack <Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()!=1){
            int t=st.pop();
            int s=st.pop();
            if(array[t][s]==1){
                st.push(s);

            }
            else{
                st.push(t);}}
        int k=st.pop();
        for(int i=0;i<array.length;i++){
            if(k!=i&&array[k][i]==1){
                System.out.println("No Celebrity");
                return;
            }

        }
        for(int i=0;i<array.length;i++){
            if(k!=i&&array[i][k]==0){
                System.out.println("No Celebrity");
                return;
            }}
        System.out.println(k);}}
