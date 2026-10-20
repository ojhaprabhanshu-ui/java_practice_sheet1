import java.util.*;

public class PROGRAM16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] grid = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    grid[i][j] = 0;

                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        int cr = cell[0];
                        int cc = cell[1];

                        for (int k = 0; k < 4; k++) {
                            int nr = cr + dr[k];
                            int nc = cc + dc[k];
                            if (nr >= 0 && nr < r && nc >= 0 && nc < c && grid[nr][nc] == 1) {
                                grid[nr][nc] = 0;
                                q.add(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
