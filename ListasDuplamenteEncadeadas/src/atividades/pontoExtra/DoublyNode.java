package atividades.pontoExtra;

public class DoublyNode<T extends Comparable<T>> {
    private DoublyNode<T> next;
    private DoublyNode<T> previous;
    private T data;

    
    public DoublyNode(T data) {
        this.data = data;
    }

    public DoublyNode<T> getNext() {
        return next;
    }
    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }
    public DoublyNode<T> getPrevious() {
        return previous;
    }
    public void setPrevious(DoublyNode<T> previous) {
        this.previous = previous;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }


}