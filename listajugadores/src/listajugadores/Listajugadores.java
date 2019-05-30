package listajugadores;

import java.util.Scanner;

public class Listajugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        int goles = 0;
        double sueldo = 0;
        int sumaGoles = 0;
        double sumaSueldo=0;
        double promedioSueldo = 0;
        int ingresar = 0;
        String mensajeReporte = "";
        //se presenta el encabezado
        mensajeReporte = String.format("%s%s\n", mensajeReporte,
                "Listado de jugadores");
        //se presenta las variables a ingresar
        mensajeReporte = String.format("%s%s\t\t%s\t\t%s\t\t%s\n",
                mensajeReporte, "Nombre", "Apellido", "Goles", "Sueldo");
        boolean bandera = true;// nos sirve para verificar nuestar condicion 
        int opcion = 0;
        while (bandera == true) { 
            ingresar++;
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido");
            apellido = entrada.nextLine();
            System.out.println("Ingrese número de goles ");
            goles = entrada.nextInt();
            System.out.println("Ingrese sueldo");
            sueldo = entrada.nextDouble();
            entrada.nextLine();
            sumaGoles = sumaGoles + goles;
            sumaSueldo= sumaSueldo+sueldo;
            mensajeReporte = String.format("%s%s\t\t%s\t\t%d\t\t%f\n",
                    mensajeReporte, nombre, apellido, goles, sueldo);
            System.out.println("Desea ingresar otro jugador --- 1-si / 2-no");
            opcion = entrada.nextInt();
            if(opcion==2){ // si no se desea seguir ingresando  bandera cambia
                bandera = false;
            }
            entrada.nextLine();
        }
        //se presenta resultados
        promedioSueldo = (double) sumaSueldo/ opcion;
        mensajeReporte = String.format("%sPromedio de sueldo:%f\n",
                mensajeReporte, promedioSueldo);
        mensajeReporte = String.format("%sTotal goles:%d\n",
                mensajeReporte, sumaGoles);
        System.out.printf("%s\n", mensajeReporte);
    }

}
