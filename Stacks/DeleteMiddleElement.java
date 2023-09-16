import java.util.*;
public class DeleteMiddleElement {
    static void deleteMid(Stack<Integer> stack,int n, int curr)
    {
        if (stack.empty() || curr == n)
            return;

        int x = stack.pop();

        deleteMid(stack, n, curr+1);
        if (curr != n/2)
            stack.push(x);
    }
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            stack.push(arr[i]);
        }
        deleteMid(stack, stack.size(), 0);
        while (!stack.empty())
        {
            int p=stack.pop();
            System.out.print(p +" ");}}}
