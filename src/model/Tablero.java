package model;

import java.util.Random;

public class Tablero {
    private Node ini = addX();
    private Node f = null;
    private String dire=null;
    private boolean isO=true;
    private Random r = new Random();

    public Tablero() {
        addY();
        posRamdon("D");
        this.f = posRamdon("F");
        //cambiar(4, 4, "=");
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
    /*
    debe ser el numero de columna y fila que el usuairo eliga - 1
     */
    public Node cambiar(int x, int y, String str){
        Node toUp = ini;
        Node r = null;
        for (int i = 0; i < x; i++) {
            toUp = toUp.getDerecha();
        }
        for (int i = 0; i < y; i++) {
            toUp = toUp.getAbajo();
        }
        if (toUp.getType().equals("X")){
            toUp.setType(str);
            r=toUp;
        }
        return r;
    }

    public Node posRamdon(String str) {
        Node c = null;
        try {
            while (true) {
                int x = r.nextInt(7);
                int y = r.nextInt(8);
                c = cambiar(x,y,str);
                if (c!=null){
                    break;
                }
            }
        } catch (Exception e){

        }
        return c;
    }

    public Node addX(){
        Node act = new Node("X", null, null, null, null);
        Node ant = null;
        Node toR = act;
        for (int i = 0; i < 7; i++) {
            act.setDerecha(new Node("X", null, null, null, null));
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

            while (true) {
                if (last.getAbajo() == null) {
                    break;
                } else {
                    last = last.getAbajo();
                }
            }

            for (int j = 0; j < 8; j++) {
                last.setAbajo(nodeNew);
                nodeNew.setArriba(last);
                last = last.getDerecha();
                nodeNew = nodeNew.getDerecha();
            }
        }
    }

    public void inicioBusqueda(){




    }


}
/*
public Node  verificarposy(Node act){

        if((act.getAbajo()!=null) && act.getAbajo().getType().equals("X")){
            return act.getAbajo();
        }else if((act.getArriba()!=null) && act.getArriba().getType().equals("X"))  {
            return act.getArriba();
        }
        return null;

    }
    public Node  verificarposx(Node act){

        if((act.getDerecha()!=null) && act.getDerecha().getType().equals("X")){
            return act.getDerecha();
        }else if((act.getIzquierda()!=null) && act.getIzquierda().getType().equals("X"))  {
            return act.getIzquierda();
        }
        return null;

    }

    //iniciador
    public boolean simular(){
        Node vf = verificarposx(ini);
        Node vf2 = verificarposy(ini);
        boolean r = false;
        if (vf!=null){
            isPosX = true;
            if (vf.getType().equals("o")){
                r = false;
            } else {
                if (simular(ini)){
                    r=true;
                }

            }
        } else if (vf2!=null) {
            isPosX=false;
            if (vf2.equals("o")){
                r=false;
            } else {
                if (simular(ini)){
                    r=true;
                }
            }
        } else {
            r=false;
        }
        return r;
    }
    public boolean simular(Node act){
        if (isPosX){
            if (verificarposx(act)==null){
                return false;
            } else if (verificarposx(act).getType().equals("D")) {
                return true;
            } else if (verificarposx(act).getType().equals("o")){
                isPosX=false;
                if (isO){
                    return false;
                }{
                    isO = true;
                    return simular(act);
                }
            } else {
                if (verificarposx(act).getType().equals("x"))
                isO = false;
                return simular(verificarposx(act));
            }
        } else {
            if (verificarposy(act)==null){
                return false;
            } else if (verificarposy(act).getType().equals("D")) {
                return true;
            } else if (verificarposy(act).getType().equals("o")){
                isPosX=false;
                if (isO){
                    return false;
                }{
                    isO = true;
                    return simular(act);
                }
            } else {
                isO = false;
                return simular(act);
            }
        }
    }
 */
