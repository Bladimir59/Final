/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal;

/**
 *
 * @author REVOLUCION
 */
public class Avion extends Vehiculo{

    public Avion(int experiencia) {
        super(experiencia);
    }


    public void MovEspecial(){
        
    }

    @Override
    public void CrearVehiculo() {
        setNombre("Nombre");
        setTipo("Avion");
        setNivel(1);
        setExperiencia(0);
        setHP(100);
        setPP(10);
        setEstado(true);
        setAtaque(0);
        setDefensa(0);
        setPunteria(0);       
        
    }
    
    
}
