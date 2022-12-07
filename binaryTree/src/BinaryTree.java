public class BinaryTree <T extends Comparable<T>> {
    private Node raiz;


    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T value) {
        if (this.isEmpty() == true) {
            this.raiz = new Node<>(value);
        } else {
            this.raiz.insertNode(value);
        }
    }


    public T buscar(T valor) {
        Node<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.raiz;
            while (aux != null) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    return aux.getInfo(); // Achou!!!
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    aux = aux.getLeft();
                } else {
                    aux = aux.getRight();
                }
            }
            return null; // Não achou!!!            
        }
    }

    

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            this.percorrerEmOrdem(this.raiz);
        }
    }

    private void percorrerEmOrdem(Node<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getRight());
        }
    }


}
