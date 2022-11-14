package atividades.pontoExtra;

public class LDECircular<T extends Comparable<T>> {
    private LDENode<T> prim;
    private LDENode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir (T valor) {
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux, anterior;
        if (this.isEmpty() == true) { // inserir na lista vazia
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.prim.getInfo()) < 0) { // inserir antes do primeiro
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.prim.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não efetuada!");
        }
        else if (valor.compareTo(this.ult.getInfo()) > 0) { // inserir depois do último
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.ult.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não efetuada!");
        }
        else { 
             aux = this.prim.getProx();
             while (true){
                 if (valor.compareTo(aux.getInfo()) == 0) {
                     System.out.println("Valor repetido. Inserção não efetuada!");
                     break;
                 }
                 else if (valor.compareTo(aux.getInfo()) < 0) { // achei local de inserção
                     anterior = aux.getAnt();
                     anterior.setProx(novo);
                     aux.setAnt(novo);
                     novo.setProx(aux);
                     novo.setAnt(anterior);
                     this.qtd++;
                     break;
                 }
                 else {
                     aux = aux.getProx();
                 }
             }       
        }
    }

    public LDENode<T> buscar (T valor) { // busca sequencial melhorada
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        }
        else if (valor.compareTo(this.ult.getInfo()) == 0) {
            return this.ult;
        }
        else if (valor.compareTo(this.ult.getInfo()) > 0) {
            return null;
        }
        else {
            aux = this.prim;
            while (aux.getProx() != null) {
                if (aux.getInfo().compareTo(valor) == 0) { // achei 
                    return aux;
                }
                else if (valor.compareTo(aux.getInfo()) > 0) {
                    aux = aux.getProx();
                }
                else {
                    return null;
                }
            }
        }  
        return null;
    }

    public void remover (T valor) {
        LDENode<T> retorno = this.buscar(valor);
        LDENode<T> anterior, proximo;
        if (retorno == null){
            System.out.println("Valor não encontrado");
        }
        else if (this.qtd == 1){ // lista com apenas um nó
            this.prim = null;
            this.ult = null;
            this.qtd = 0;
        }
        else if (retorno == this.prim){ // remover o primeiro
            this.prim = this.prim.getProx();
            this.prim.setAnt(null);
            this.qtd--;
        }
        else if (retorno == this.ult) { // remover o último
            this.ult = this.ult.getAnt();
            this.ult.setProx(null);
            this.qtd--;
        }
        else { // remover no "meio"
             anterior = retorno.getAnt();
             proximo = retorno.getProx();
             anterior.setProx(proximo);
             proximo.setAnt(anterior);
             this.qtd--;
        }        
    }

    public void exibirInfo(T valor){
        LDENode<T> resultadoBusca = new LDENode<>(valor);

        if(resultadoBusca != null){
            System.out.println(resultadoBusca.getInfo());
        }

        System.out.println("Matrícula não encontrada");
    }

    
}
