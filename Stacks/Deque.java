import java.util.*;
public class Deque
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        int n=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            st1.push(j);
        }
        for(int j=0;j<n;j++)
        {
            st2.push(st1.pop());
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(st2.pop()+" ");}}}
