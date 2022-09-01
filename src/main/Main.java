package main;
import java.util.*;

import model.Tablero;

public class Main {

    public static Scanner sc=new Scanner(System.in);
    public static Tablero tablero = new Tablero();
    public static void main(String[] args) {
        //System.out.println(tablero.toStringT());
        while (true){
            System.out.println(tablero.toStringT());
            sc.nextLine();
            System.out.println("---------");
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            System.out.println("------------");
            String h=sc.nextLine();


            tablero.cambiar(x-1,y-1, h);
            //System.out.println(tablero.simular());
        }
    }
}
