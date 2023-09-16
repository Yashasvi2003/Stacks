import java.util.*;
public class GreaterElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int len=sc.nextInt();
        int []array=new int [len];
        for(int i=0;i<len;i++)
        {
            array[i]=sc.nextInt();
        }
        int []res=new int[array.length];
        Stack<Integer> stack=new Stack<>();
        for(int j=0;j<array.length*2;j++)
        {
            while(!stack.isEmpty() && array[j%array.length]>array[stack.peek()])
            {
                res[stack.pop()]=array[j%array.length];
            }
            if(j<array.length)
                stack.push(j);
        }
        while(!stack.isEmpty())
        {
            res[stack.pop()]=-1;
        }
        for(int h=0;h<res.length;h++)
        {
            System.out.print(res[h]+" ");}}}
