
class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public void presentarse() {
        System.out.println("+++hello, soy " + nombre + " y mi edad es " + edad + " años, y mi genero es "+genero+".");
    }
}
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25, "Femenino");
        Persona persona2 = new Persona("Luis", 30, "Masculino");
        persona1.presentarse();
        persona2.presentarse();
        System.out.println("¡QUE TENGAN UN LINDO DIA/NOCHE!");
    }
}
