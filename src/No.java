import java.util.LinkedList;
import java.util.Queue;

public class No {
    int valor;
    No esquerdo, direito;

    No(int valor) {
        this.valor = valor;
    }

    public class Arvore {
        public void percursoEmNivel(No raiz) {

            Queue<No> filaDeNos = new LinkedList<No>();
            if (raiz != null) {
                filaDeNos.add(raiz);
                while (!filaDeNos.isEmpty()) {
                    No atual = filaDeNos.poll();
                    System.out.println(atual.valor + " ");
                    if (atual.esquerdo != null)  filaDeNos.add(atual.esquerdo);
                    if (atual.direito != null)  filaDeNos.add(atual.direito);
                    }
                }
            }
        }
    }
