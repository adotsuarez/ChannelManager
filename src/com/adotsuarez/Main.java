package com.adotsuarez;

public class Main {

    public static void main(String[] args) {
        ListaCanales lista = new ListaCanales("TEST",5);
        Canal c1 = IO.creaCanal();
        Canal c2 = IO.creaCanal();

        try {
            lista.nuevoCanal(c1);
            lista.nuevoCanal(c2);
        } catch (Exception exc) {
            System.err.println("LLENO");
        }

        try {
            System.out.println(lista.masAntiguo());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
