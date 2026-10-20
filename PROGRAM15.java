import java.util.*;

public class PROGRAM15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String start = sc.next();
        String target = sc.next();
        int n = sc.nextInt();

        Set<String> dict = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dict.add(sc.next());
        }

        if (start.equals(target)) {
            System.out.println(0);
            return;
        }

        if (!dict.contains(target)) {
            System.out.println(-1);
            return;
        }

        Queue<String> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();
        q.add(start);
        vis.add(start);

        int steps = 0;
        boolean found = false;

        while (!q.isEmpty()) {
            int sz = q.size();
            for (int k = 0; k < sz; k++) {
                String cur = q.poll();
                if (cur.equals(target)) {
                    found = true;
                    break;
                }

                char[] ch = cur.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    char orig = ch[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == orig) continue;
                        ch[i] = c;
                        String next = new String(ch);
                        if (dict.contains(next) && !vis.contains(next)) {
                            vis.add(next);
                            q.add(next);
                        }
                    }
                    ch[i] = orig;
                }
            }
            if (found) break;
            steps++;
        }

        System.out.println(found ? steps : -1);
    }
}
