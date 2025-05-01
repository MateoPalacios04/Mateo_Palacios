public class Heroe implements Comparable<Heroe> {

    private String nombre;
    private String raza;
    private int nivelPoder;
    private String habilidad;
    private double nv;

    public Heroe(String nombre, String raza, int nivelPoder, String habilidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPoder = nivelPoder;
        this.habilidad = habilidad;
    }



    public Heroe(String nombre, String raza, String habilidad, String np) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public double aumentoPoder(){
        if(raza == "mutante"){

            nv= getNivelPoder()*1.3;

            System.out.printf("El nivel de poder del mutante es: "+nv);

        } return nv;



    }

    public double aumentoPoder2(){
        if(raza == "alien"){

            nv= getNivelPoder()*1.5;

            System.out.printf("El nivel de poder del alien es: "+nv);

        } return nv;
    }

    @Override
    public int compareTo(Heroe other) {
        int sumThis = this.nivelPoder;
        int sumOther = other.nivelPoder;
        return Integer.compare(sumThis, sumOther);
    }

    @Override
    public String toString(){
        return "El nombre de heroe es: "+ getNombre() + "la raza es: "+getRaza() + "su habilidad es: " + getHabilidad() + "su nivel de poder es: "+getNivelPoder();

    }







}
