import java.util.*;

public class PROGRAM18 {
    static class Edge {
        int to;
        long w;
        Edge(int to, long w) {
            this.to = to;
            this.w = w;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        List<Edge>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long w = sc.nextLong();
            adj[u].add(new Edge(v, w));
            adj[v].add(new Edge(u, w));
        }

        long[] dist = new long[n];
        Arrays.fill(dist, -1);

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        pq.add(new long[]{0, s});
        dist[s] = 0;

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];

            if (d > dist[u]) continue;

            for (Edge e : adj[u]) {
                long nextDist = d + e.w;
                if (dist[e.to] == -1 || nextDist < dist[e.to]) {
                    dist[e.to] = nextDist;
                    pq.add(new long[]{nextDist, e.to});
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(dist[i]).append(i == n - 1 ? "" : " ");
        }
        System.out.println(sb.toString());
    }
}
