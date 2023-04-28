public class Node <T> {
    

    private T elemento;
    private Node<T>proximo;
    
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

    
}
