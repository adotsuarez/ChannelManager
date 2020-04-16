package com.adotsuarez;

import java.util.Calendar;

/**
 * @author adotsuarez
 * (C) Agustin Suarez Martinez, 2020 - adot.c1.biz
 */
public class ListaCanales {
    private int numCanales;
    private String nombre;
    private Canal[] canales;

    /** Constructor
     * @param nombre Nombre del canal
     * @param tam Tamanho maximo del vector
     */
    public ListaCanales(String nombre, int tam) {
        numCanales=0;
        this.nombre = nombre;
        this.canales = new Canal[tam];
    }

    /** Crea un nuevo canal y lo inserta al final
     * @param c Nuevo canal
     * @throws Exception (NPE)
     */
    public void nuevoCanal(Canal c) throws Exception {
        if (numCanales != canales.length) {
            canales[numCanales] = c;
            numCanales++;
        } else {
            throw new Exception("⛔️️ Error NPE. Todos los espacios ocupados. El canal NO se ha añadido.");
        }
    }

    /** Devuelve el numero de canales existentes
     * @return numero de canales existentes
     */
    public int getNumCanales() {
        return numCanales;
    }

    /** Actualiza el numero de canales existentes
     * @param numCanales numero de canales existentes
     */
    public void setNumCanales(int numCanales) {
        this.numCanales = numCanales;
    }

    /** Devuelve el canal en una posicion
     * @param pos posicion a buscar
     * @return el canal en la posicion dada
     * @throws Exception Fuera de rango
     */
    public Canal canalAt(int pos) throws Exception {
        if (pos >= 0 && pos < numCanales) {
            return canales[pos];
        } else {
            throw new Exception("‼️️ Error. Fuera de rango: se ha devuelto 'null'.");
        }
    }

    /** Devuelve el canal en una posicion
     * @return el canal mas antiguo
     * @throws Exception Sin canales
     */
    public Canal masAntiguo() throws Exception {
        if (numCanales != 0) {
            Canal lowestCanal = canales[0];
            
            for (int i = 0; i < numCanales; i++) {
                if (canales[i].getAnho() < lowestCanal.getAnho()) {
                    lowestCanal = canales[i];
                }
            }
            return lowestCanal;
        } else {
            throw new Exception("‼️️ Error. No hay canales.");
        }
    }
}
