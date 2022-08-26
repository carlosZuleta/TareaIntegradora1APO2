package model;

import java.util.Random;

public class Tablero {
    private Node ini = addX();
    private Random r = new Random();

    public Tablero() {
        addY();
        posRamdon("F");
        posRamdon("D");
        cambiar(4, 4, "X");
    }

    public String toStringT(){
        String to = "";
        Node act = ini;
        Node der = ini;
        while (true){
            for (int i = 0; i < 8; i++) {
                to += der.getType()+ "\t";
                der=der.getDerecha();
            }
            to+="\n";
            if (act.getAbajo()==null){
                break;
            } else {
                act=act.getAbajo();
                der=act;
            }
        }
        return to;
    }

    public boolean cambiar(int x, int y, String str){
        Node toUp = ini;
        boolean r = false;
        for (int i = 0; i < x; i++) {
            toUp = toUp.getDerecha();
        }
        for (int i = 0; i < y; i++) {
            toUp = toUp.getAbajo();
        }
        if (toUp.getType().equals("x")){
            toUp.setType(str);
            r=true;
        }
        return r;
    }

    public void posRamdon(String str){
        while (true) {
            int x = r.nextInt(8);
            int y = r.nextInt(8);
            boolean b = cambiar(x,y,str);
            if (b){
                break;
            }
        }
    }

    public Node addX(){
        Node act = new Node("x", null, null, null, null);
        Node ant = null;
        Node toR = act;
        for (int i = 0; i < 7; i++) {
            act.setDerecha(new Node("x", null, null, null, null));
            ant = act;
            act = ant.getDerecha();
            act.setIzquierda(ant);
        }
        return toR;
    }

    public void addY(){
        for (int i = 0; i < 7; i++) {
            Node last = ini;
            Node nodeNew = addX();

            while (true){
                if (last.getAbajo()==null){
                    break;
                } else {
                    last = last.getAbajo();
                }
            }

            for (int j = 0; j < 8; j++) {
                last.setAbajo(nodeNew);
                nodeNew.setArriba(last);
                last=last.getDerecha();
                nodeNew=nodeNew.getDerecha();
            }
        }

    }
}