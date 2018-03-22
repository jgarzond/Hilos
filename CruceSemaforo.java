/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucesemaforo;
jfdhfdhfdfhd

public class CruceSemaforo implements Runnable {
    
    private Semaforo semaforo;
    private long tiempoinicial;
    
    public CruceSemaforo(Semaforo semaforo, long tiempoinicial){
        this.semaforo=semaforo;
        this.tiempoinicial=tiempoinicial;
    }
    

    public static void main(String[] args) {
        Semaforo semaforo1= new Semaforo(1,"Semaforo 1",5000);
        Semaforo semaforo2= new Semaforo(3,"Semaforo 2",5000);
        long initialTime = System.currentTimeMillis();
        
        CruceSemaforo proceso1=new CruceSemaforo (semaforo1,initialTime);
        CruceSemaforo proceso2=new CruceSemaforo (semaforo2,initialTime);
        
        new Thread(proceso1).start();
        new Thread(proceso2).start();
        
    }
    @Override
	public void run() {
		this.semaforo.esperarcambio();
                this.semaforo.cambiocolor();
                
                
	}

    
}
