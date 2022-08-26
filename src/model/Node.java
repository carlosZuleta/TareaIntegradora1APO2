package model;

public class Node {
    private String type;
    private Node derecha;
    private Node izquierda;
    private Node arriba;
    private Node abajo;

    public Node(String type, Node derecha, Node izquierda, Node arriba, Node abajo) {
        this.type = type;
        this.derecha = derecha;
        this.izquierda = izquierda;
        this.arriba = arriba;
        this.abajo = abajo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Node getDerecha() {
        return derecha;
    }

    public void setDerecha(Node derecha) {
        this.derecha = derecha;
    }

    public Node getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Node izquierda) {
        this.izquierda = izquierda;
    }

    public Node getArriba() {
        return arriba;
    }

    public void setArriba(Node arriba) {
        this.arriba = arriba;
    }

    public Node getAbajo() {
        return abajo;
    }

    public void setAbajo(Node abajo) {
        this.abajo = abajo;
    }
}
