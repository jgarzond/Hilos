/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucesemaforo;

/**
 *
 * @author juangarzon
 */
public class Semaforo {
    private int estado;
    private String Nombre;
    private int tiempoinicial;
    private String color;
    public Semaforo(int estado, String Nombre, int tiempoinicial){
        this.estado=estado;
        this.Nombre=Nombre;
        this.tiempoinicial=tiempoinicial;
        switch(estado){
            case 1:
                this.color="Rojo";
                break;
            case 2:
                this.color="Amarillo";
                break;
            case 3:
                this.color="Verde";
        }   
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTiempoinicial() {
        return tiempoinicial;
    }

    public void setTiempoinicial(int tiempoinicial) {
        this.tiempoinicial = tiempoinicial;
    }
    
    public String getColor() {
        return color;
    }
    
    
    
}
