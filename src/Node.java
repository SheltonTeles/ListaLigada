public class Node <T> {
    

    private T elemento;
    private Node<T>proximo;


    //gerar construtor vazio

    public Node(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public Node
    
    public T getElemento() {
        return elemento;
    }
    public Node<T> getProximo() {
        return proximo;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Node [elemento=" + elemento + ", proximo=" + proximo + "]";
    }

    

    
}
