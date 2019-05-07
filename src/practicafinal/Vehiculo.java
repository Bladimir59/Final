package practicafinal;

/**
 *
 * @author Bladimir 
 */
public abstract class Vehiculo {
    private String Nombre;
    private String Tipo;
    private int Nivel;
    private int experiencia;
    private int HP;
    private int PP;
    private boolean Estado;
    private int Ataque;
    private int Defensa;
    private int Punteria;
    
    
    public abstract void CrearVehiculo();

    public Vehiculo(String Nombre, String Tipo, int Nivel, int experiencia, int HP, int PP, boolean Estado, int Ataque, int Defensa, int Punteria) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Nivel = Nivel;
        this.experiencia = experiencia;
        this.HP = HP;
        this.PP = PP;
        this.Estado = Estado;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.Punteria = Punteria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getPunteria() {
        return Punteria;
    }

    public void setPunteria(int Punteria) {
        this.Punteria = Punteria;
    }
}
