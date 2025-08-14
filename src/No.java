import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No {
    int v;
    No e, d;

    No(int v) {
        this.v = v;
    }

    public class Arvore {
        public void perc(No r) {

            Queue<No> q = new LinkedList<No>();
            if (r != null) {
                q.add(r);
                while (!q.isEmpty()) {
                    No t = q.poll();
                    System.out.println(t.v + " ");
                    if (t.e != null)  q.add(t.e);
                    if (t.d != null)  q.add(t.d);
                    }
                }
            }
        }
    }

