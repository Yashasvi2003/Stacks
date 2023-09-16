import java.util.*;
public class Histogram{
    public static long LargestRectangle(int[] len) {
        int n = len.length;
        Stack<Integer> st = new Stack<>();
        long Area = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || len[i] < len[st.peek()])) {
                int h = len[st.pop()];
                int w = st.isEmpty() ? i : i - st.peek() - 1;
                long area = (long) h * w;
                Area = Math.max(Area, area);
            }
            st.push(i);
        }

        return Area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] len = new int[N];
        for (int i = 0; i < N; i++) {
            len[i] = scanner.nextInt();
        }

        long largestRectangle = LargestRectangle(len);
        System.out.println(largestRectangle);
    }
}
