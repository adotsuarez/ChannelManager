package com.adotsuarez;

/**
 * @author adotsuarez
 * (C) Agustin Suarez Martinez, 2020 - adot.c1.biz
 */

public class Canal {
    // TEMAS DE CANALES
    public static enum tema {
        GAMEPLAYS,
        VLOGS,
        HUMOR,
        TUTORIALES
    }

    // PROPIEDADES DE CANAL
    private String url;
    private int anho;
    private double crecimiento;
    private tema tematica;

    // Constructor
    public Canal(String url, int anho, double crecimiento, tema tematica) {
        this.url = url;
        this.anho = anho;
        this.crecimiento = crecimiento;
        this.tematica = tematica;
    }

    /*
    // Constructor vacio
    public Canal() {
        this.url = "";
        this.anho = 0;
        this.crecimiento = 0.0;
        this.tematica = tema.GAMEPLAYS;
    }
     */

    // Getters & Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public double getCrecimiento() {
        return crecimiento;
    }

    public void setCrecimiento(double crecimiento) {
        this.crecimiento = crecimiento;
    }

    public tema getTematica() {
        return tematica;
    }

    public void setTematica(tema tematica) {
        this.tematica = tematica;
    }

    // toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Canal:\n");

        sb.append("- URL: ").append(url).append('\n');
        sb.append("- ANHO: ").append(anho).append('\n');
        sb.append("- CRECIMIENTO: ").append(crecimiento).append('\n');
        sb.append("- TEMATICA: ").append(tematica).append("\n\n");

        return sb.toString();
    }
}
