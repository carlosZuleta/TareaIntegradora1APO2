package main;
import java.util.*;

import model.Tablero;

public class Main {

    public static Scanner sc=new Scanner(System.in);
    public static Tablero tablero = new Tablero();
    public static void main(String[] args) {
        boolean salir = false;
        int opt;
        String nick = "";

        while(!salir){
            System.out.println("/--------------------------------/");
            System.out.println("1. Nueva partida");
            System.out.println("2. Ver puntaje");
            System.out.println("3. Salir");
            System.out.println("/--------------------------------/");

            System.out.println("-----eliga una opcion----");
            opt = sc.nextInt();

            switch (opt){
                case 1:
                    System.out.pintln("Digite su nickName de jugador:");
                    nick = sc.nextLine();

                    System.out.println("Bienvenido "+nick);

                    System.out.println("/--------------------/");
                    System.out.println(tablero.toStringT());
                    menu2();
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;

            }
            public void menu2(){
                boolean salir2 = false;
                int opt2;

                while(!salir2){
                    System.out.println("/--------------------------------/");
                    System.out.println("1. poner tuberia");
                    System.out.println("2. simular");
                    System.out.println("3. Salir");
                    System.out.println("/--------------------------------/");

                    System.out.println("-----eliga una opcion----");
                    opt2 = sc.nextInt();
                    switch (opt2){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                }
            }
        }
        //System.out.println(tablero.toStringT());
        /*while (true){
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
        }*/




    }

}
