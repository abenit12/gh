/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioligabbva;

/**
 *
 * @author Abenit12
 */
public class Equipo implements Comparable<Equipo>{
    private int gc = 0, gf = 0, pe = 0, pg = 0, pp = 0;
    private String nombre;

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Equipo (String n, int pg, int pe, int pp, int gf, int gc){
        this.nombre = n;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
    }
    
    public Integer calculaPuntos(){
        return (this.pg * 3) + (this.pe);
    }
    
    @Override
    public int compareTo(Equipo o){
        int[] criteriosOrdenacion = {this.calculaPuntos().compareTo(o.calculaPuntos()),(this.balance().compareTo(o.balance()))};
        
        for (int unCriterio : criteriosOrdenacion) {
            if (unCriterio != 0) {
                return unCriterio;
            }
        }
        return 0;
    }
    
    public int partidosJugados(){
        int jugados = this.pg + this.pe + this.pp;
        return jugados;
    }
    
    public Integer balance(){
        return this.gf-this.gc;
    }
}
