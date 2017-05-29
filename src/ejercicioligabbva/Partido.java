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
public class Partido {
    private int resultadoLocal = 0, resultadoVisitante = 0;
    private Equipo equipoLocal, equipoVisitante;
    
    public Equipo getEquipoLocal(){
        return equipoLocal;
    }
    public Equipo getEquipoVisitante(){
        return equipoVisitante;
    }
    public int getResultadoLocal(){
        return resultadoLocal;
    }
    public int getResultadoVisitante(){
        return resultadoVisitante;
    }
    public Partido (Equipo local, int golesLocal, Equipo visitante, int golesVisitante){
        resultadoLocal = golesLocal;
        resultadoVisitante = golesVisitante;
        equipoLocal = local;
        equipoVisitante = visitante;
    }
}
