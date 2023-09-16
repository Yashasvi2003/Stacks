import java.util.*;
public class PlayimgCards {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int iterator = sc.nextInt();
        Stack<Integer>st = new Stack<Integer>();

        for(int i=0; i<number; i++){
            st.push(sc.nextInt());

        }
        int [] array = new int[iterator];
        int n= 0;
        int p = 2;
        while(n < iterator){
            boolean rr = true;
            for(int j=2; j<p; j++){
                if(p%j == 0){
                    rr = false;
                    break;
                }
            }
            if(rr){
                array[n] = p;
                n++;
            }
            p++;
        }
        n=0;
        Stack<Integer>st1 = new Stack<Integer>();
        Stack<Integer>st2 = new Stack<Integer>();
        Stack<Integer>st3 = new Stack<Integer>();

        while(n < iterator){
            if(n%2==0){
                while(!st3.isEmpty()){
                    st1.push(st3.pop());
                }
                while(!st.isEmpty()){
                    if(st.peek() % array[n] == 0){
                        st3.push(st.pop());
                    }
                    else{
                        st2.push(st.pop());
                    }
                }
                while(!st1.isEmpty()){

                    st3.push(st1.pop());

                }
            }

            else{
                while(!st3.isEmpty()){
                    st1.push(st3.pop());
                }
                while(!st2.isEmpty()){
                    if(st2.peek() % array[n] == 0){
                        st3.push(st2.pop());
                    }
                    else{
                        st.push(st2.pop());
                    }
                }
                while(!st1.isEmpty()){
                    st3.push(st1.pop());
                }
            }
            n++;
        }
        while(!st1.isEmpty()){
            System.out.println(st1.pop());
        }
        while(!st3.isEmpty()){
            System.out.println(st3.pop());
        }
        while(!st2.isEmpty()){
            System.out.println(st2.pop());
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
