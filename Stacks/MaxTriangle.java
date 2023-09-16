import java.util.*;
public class MaxTriangle {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            while (top >= 0 && heights[stack[top]] >= heights[i]) {
                right[stack[top]] = i;
                top--;
            }
            left[i] = (top >= 0) ? stack[top] + 1 : 0;
            stack[++top] = i;
        }
        for (int i = 0; i < n; i++) {
            int area = (right[i] - left[i]) * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static int maximalRectangle(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;
        int[] heights = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    heights[j] = 0;
                } else {
                    heights[j]++;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int maxArea = maximalRectangle(matrix);
        System.out.println(maxArea);}}
