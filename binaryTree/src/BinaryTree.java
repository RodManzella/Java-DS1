public class BinaryTree<T extends Comparable<T>> {
    private Node<T> raiz;

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

    public T procurar(T value) {
        if (this.isEmpty() == true) {
            return null;
        } else {
            return this.raiz.findNode(value);
        }
    }

    public void exibirOrdenado() {
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

    public void remove(T value) {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            this.raiz = this.removeNode(this.raiz, value);
        }
    }

    private Node<T> removeNode(Node<T> r, T value) {
        if (r != null) {
            if (value.compareTo(r.getInfo()) == 0) {
                Node<T> pai, filho;
                if (r.getLeft() == null && r.getRight() == null) { 
                    r = null;
                } else if (r.getLeft() == null) { 
                    r = r.getRight();
                } else if (r.getRight() == null) { 
                    r = r.getLeft();
                } else { 
                    pai = r;
                    filho = pai.getLeft();
                    while (filho.getRight() != null) {
                        pai = filho;
                        filho = filho.getRight();
                    }
                    pai.setRight(filho.getLeft());
                    r.setInfo(filho.getInfo());
                }
            } else if (value.compareTo(r.getInfo()) < 0) {
                r.setLeft(removeNode(r.getLeft(), value));
            } else {
                r.setRight(removeNode(r.getRight(), value));
            }
        }
        return r;
    }

}
