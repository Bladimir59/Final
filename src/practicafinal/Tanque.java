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
public class Tanque extends Vehiculo{
    
    public Tanque(String Nombre, String Tipo, int Nivel, int experiencia, int HP, int PP, boolean Estado, int Ataque, int Defensa, int Punteria) {
        super(Nombre, Tipo, Nivel, experiencia, HP, PP, Estado, Ataque, Defensa, Punteria);
    }

    @Override
    public void CrearVehiculo() {
        setNombre("Nombre");
        setTipo("Tanque");
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
