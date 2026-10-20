import java.util.*;

public class PROGRAM19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }

        Stack<Integer> st = new Stack<>();
        long maxArea = 0;

        for (int i = 0; i <= n; i++) {
            long curH = (i == n) ? 0 : h[i];
            while (!st.isEmpty() && (i == n || h[st.peek()] >= curH)) {
                int top = st.pop();
                long height = h[top];
                int width = st.isEmpty() ? i : (i - st.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }

        System.out.println(maxArea);
    }
}
