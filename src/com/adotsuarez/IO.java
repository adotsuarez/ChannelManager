package com.adotsuarez;

import java.util.Scanner;

/**
 * @author adotsuarez
 * (C) Agustin Suarez Martinez, 2020 - adot.c1.biz
 */
public class IO {

    /** Pide una cadena
     * @param msg mensaje a imprimir
     * @return La cadena introducida por el ususario
     */
    private static String leeCadena(String msg) {
        Scanner datainput = new Scanner(System.in);
        String toret;

        do {
            System.out.println(msg);
            toret = datainput.nextLine().trim();
        } while (toret.equals(""));
        return toret;
    }

    /** Pide un numero entero
     * @param msg mensaje a imprimir
     * @return El entero introducido por el ususario
     */
    private static int leeEntero(String msg) {
        Scanner datainput = new Scanner(System.in);
        int toret = 0;
        boolean existeError;

        do {
            try {
                existeError = false;
                System.out.println(msg);
                toret = Integer.parseInt(datainput.nextLine());
            } catch (NumberFormatException exc) {
                existeError = true;
                System.err.println("‼️ Error. Formato numerico invalido.");
            }
        } while (existeError);

        return toret;
    }

    /** Pide un numero real
     * @param msg mensaje a imprimir
     * @return El real introducido por el ususario
     */
    private static double leeReal(String msg) {
        Scanner datainput = new Scanner(System.in);
        double toret = 0;
        boolean existeError;

        do {
            try {
                existeError = false;
                System.out.println(msg);
                toret = Double.parseDouble(datainput.nextLine());
            } catch (NumberFormatException exc) {
                existeError = true;
                System.err.println("‼️ Error. Formato numerico invalido.");
            }
        } while (existeError);

        return toret;
    }

    /** Pide un tema
     * @param msg mensaje a imprimir
     * @return El tema introducido por el ususario
     */
    private static Canal.tema leeTema(String msg) {
        int opt;

        do {
            System.out.println(msg);

            for (int i = 0; i < Canal.tema.values().length; i++) {
                System.out.println((i+1) + ": " + Canal.tema.values()[i]);
            }

            opt = leeEntero("Tu entrada (de la lista anterior):");

        } while (opt < 1 || opt >= Canal.tema.values().length + 1);

        return Canal.tema.values()[opt-1];

    }

    /** Crea un canal
     * @return El tema introducido por el ususario
     */
    public static Canal creaCanal() {

        System.out.println("VAMOS A CREAR UN CANAL NUEVO ⏯\n");

        String url = leeCadena("URL del canal:");
        int anho = leeEntero("Anho:");
        double crecimiento = leeReal("Crecimiento del canal:");
        Canal.tema tematica = leeTema("Tema del canal:");

        return new Canal(url,anho,crecimiento,tematica);
    }
}
