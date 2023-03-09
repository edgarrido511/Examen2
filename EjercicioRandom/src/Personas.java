import java.util.Random;
public abstract class Personas {
    private String nombre;
    private boolean hasBarba;
    private boolean hasPelo;
    private boolean hasBrazos;
    private boolean isMayorEdad;
    Random random = new Random();
    boolean randomBoolean1 = random.nextBoolean();
    boolean randomBoolean2 = random.nextBoolean();
    boolean randomBoolean3 = random.nextBoolean();
    boolean randomBoolean4 = random.nextBoolean();
    public Personas(){
        this.hasBarba = randomBoolean1;
        this.hasPelo = randomBoolean2;
        this.hasBrazos = randomBoolean3;
        this.isMayorEdad = randomBoolean4;
    }
    public String getName(){
        return nombre;
    }
    public boolean gethasBarba(){
        return hasBarba;
    }
    public boolean gethasPelo(){
        return hasPelo;
    }
    public boolean gethasBrazos(){
        return hasBrazos;
    }
    public boolean getisMayorEdad(){
        return isMayorEdad;
    }
    public void eliminarNombre() {
        this.nombre = null;
    }
    public String setName(String nombre){
        return this.nombre = nombre;
    }
}

