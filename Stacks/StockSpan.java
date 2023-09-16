import java.util.*;
public class StockSpan{

    public static void main(String args[])  {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int []stock=new int [s];
        for(int i=0;i<s;i++){
            stock[i]=sc.nextInt();
        }
        Stock(stock);
    }
    public static void Stock(int []array){
        int []s=new int [array.length];
        Stack<Integer>stack=new Stack<>();
        for(int j=0;j<array.length;j++){
            while(!stack.isEmpty()&&array[j]>array[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                s[j]=j+1;
            }
            else{
                s[j]=j-stack.peek();
            }
            stack.push(j);
        }
        for(int k=0;k<s.length;k++){
            System.out.print(s[k]+" ");
        }
        System.out.print("END");
    }

}
