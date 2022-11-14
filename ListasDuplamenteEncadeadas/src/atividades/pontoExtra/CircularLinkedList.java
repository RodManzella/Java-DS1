package atividades.pontoExtra;

public class CircularLinkedList<T extends Comparable <T>> {
    private DoublyNode<T> first;
    private DoublyNode<T> last;
    private int nodeNumber;
    private int nodeLimit;

    public boolean isEmpty(){
        if(this.nodeNumber == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void insertFirst(T value){
        DoublyNode<T> newNode = new DoublyNode<>(value);  
        
        if(this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
            this.nodeNumber++;
            this.last.setNext(this.first);  //garantindo circularidade da lista
            this.first.setPrevious(this.last);
        }
        else{
            newNode.setNext(this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
            this.nodeNumber++;
            this.last.setNext(this.first);
            this.first.setPrevious(this.last);

        }
    }

    public void insertLast(T value){
        DoublyNode<T> newNode = new DoublyNode<>(value);

        if(this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
            this.nodeNumber++;
            this.last.setNext(this.first);
            this.first.setPrevious(this.last);
        }else{
            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;
            this.nodeNumber++;
            this.last.setNext(this.first);
            this.first.setPrevious(this.last);        
        }
        
    }

    public void showAll(){
        DoublyNode<T> aux = this.first;

        if(this.isEmpty()){
            System.out.println("List is empty!");
        }

        else{
            for(int i = 0; i < nodeNumber; i++){
                System.out.println(aux.getData());
                aux = aux.getNext();
            }
        }
  
    }

    public void deleteFirst(){
        if(this.isEmpty()){
            System.out.println("List is empty! ");
        }
        else if(this.nodeNumber == 1){
            this.first = null;
            this.last = null;
            this.nodeNumber = 0;
        }
        else{
            this.first = this.first.getNext();
            this.nodeNumber--;
            this.last.setNext(this.first);
            this.first.setPrevious(this.last);
            
        }
    }

    public void deleteLast(){

        if(this.isEmpty()){
            System.out.println("List is empty! ");
        }
        else if(this.nodeNumber == 1){
            this.first = null;
            this.last = null;
            this.nodeNumber = 0;
        }
        else{
            this.last = this.last.getPrevious();
            this.nodeNumber--;
            this.last.setNext(this.first);
            this.first.setPrevious(this.last);
        }
    }

    public DoublyNode<T> searchList(T value){  //busca simples(não está ordenado)

        if(this.isEmpty()){
            return null;
        }
        else if(value.compareTo(this.first.getData()) == 0){
            return this.first;
        }
        else if(value.compareTo(this.last.getData()) == 0){
            return this.last;
        }
        
        else{
            DoublyNode<T> aux = this.first;
            for(int i = 0; i < this.nodeNumber; i++){
                if(aux.getData().compareTo(value) == 0){
                    return aux;
                }
                aux = aux.getNext();
            }
        }
        return null;
    }

    
}
