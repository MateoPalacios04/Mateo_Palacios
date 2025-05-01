import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Heroe> listaheores = new ArrayList<>();
        boolean continuar = true;

        System.out.println("Sistema de clasificacion de heroes");

        while (continuar) {

            System.out.println("Introduce el nombre del heroe:");
            String nombre = scanner.nextLine();

            System.out.println("Introduce el raza del heroe:");
            String raza = scanner.nextLine();

            System.out.println("Introduce habilidad del heroe:");
            String habilidad = scanner.nextLine();

            System.out.println("Introduce el np del heroe:");
            String np = scanner.nextLine();






            Heroe rango = new Heroe(nombre, raza, habilidad, np);
            rango.setNombre(nombre);
            rango.setRaza(raza);
            rango.setHabilidad(habilidad);
            rango.setNivelPoder(Integer.parseInt(np));

            listaheores.add(rango);

            System.out.println("¿Deseas ingresar otro conjunto de items? (s/n):");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        Collections.sort(listaheores);

        System.out.println("\nObjetos ordenados según la suma de sus IDs:");
        for (Heroe r : listaheores) {
            System.out.println(r);
        }

        System.out.println("\nPrograma finalizado.");
        scanner.close();
    }
}