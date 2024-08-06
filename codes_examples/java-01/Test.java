


class Animal {
    protected String sonido;

    public Animal() {
        sonido = "Sonido no definido";
    }

    public void vocalizar(){
        System.out.println(sonido);
    }
}

class Mascota extends Animal {
    private String nombreMascota;

    public Mascota(){

    }

    public String nombre(){
        return(nombreMascota);
    }

    public void nombrar(String nombre){
        nombreMascota = nombre;
    }
}

class Perro extends  Mascota {

    public Perro() {
        sonido = "Ladrar";
    }
    
}


public class Test{

    public static void main(String[] args) {

        Mascota miPerro = new Perro();

        miPerro.nombrar("Inti");

        System.out.println("hola mundo");
        System.out.println("miPerro.nombre() = " + miPerro.nombre());
    
    }    

}