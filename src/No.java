import java.util.LinkedList;
import java.util.Queue;

public class No {
    int valor; //valor
    No esquerdo, direito; //esquerdo e direito

    No(int v) { //construtor
        this.valor = v;
    }

    public class Arvore {
        public void percorreArvore(No raiz) {

            Queue<No> listaNivelada = new LinkedList<No>();
            if (raiz != null) {
                listaNivelada.add(raiz); //adiciona a raíz na lista
                while (!listaNivelada.isEmpty()) {
                    No t = listaNivelada.poll();
                    System.out.println(t.valor + " ");
                    if (t.esquerdo != null)  listaNivelada.add(t.esquerdo);
                    if (t.direito != null)  listaNivelada.add(t.direito);
                    }
                }
            }
        }
    }
