import java.util.*;
 class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception {
        int n = sc.nextInt();
        Main main = new Main();
        StackUsingArray st = main.new StackUsingArray();
        Coding(st, n);
    }
    public static void Coding(StackUsingArray st, int n) throws Exception {
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int b=0;
            if(m==2)
                b=sc.nextInt();
            if(m==2)
                st.push(b);
            else if( !st.isEmpty() && m==1)
                System.out.println(st.pop());
            else if(m==1 && st.isEmpty())
                System.out.println("No Code");
        }
    }

    private class StackUsingArray {
        private int[] d;
        private int to;

        public static final int DC = 10;

        public StackUsingArray() throws Exception {
            this(DC);
        }

        public StackUsingArray(int cap) throws Exception {
            if (cap <= 0) {
                System.out.println("Invalid Capacity");
            }
            this.d = new int[cap];
            this.to= -1;
        }

        public int s() {
            return this.to + 1;
        }

        public boolean isEmpty() {
            if (this.s() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void push(int it) throws Exception {
            if (this.s() == this.d.length) {

                int[] temp= new int[2 * d.length];
                for(int i= 0;i < d.length;i++){
                    temp[i] = d[i];
                }

                d= temp;
            }
            this.to++;
            this.d[this.to] = it;
        }

        public int pop() throws Exception {
            if (this.s() == 0) {
                throw new Exception("Stack is Empty");
            }
            int va = this.d[this.to];
            this.d[this.to] = 0;
            this.to--;
            return va;
        }

        public int top() throws Exception {
            if (this.s() == 0) {
                throw new Exception("Stack is Empty");
            }
            int va = this.d[this.to];
            return va;
        }

        public void display() throws Exception {
            if (this.s() == 0) {
                throw new Exception("Stack is Empty");
            }
            for (int i = this.to; i>= 0; i--) {
                System.out.println(this.d[i]);
            }

        }

    }

}