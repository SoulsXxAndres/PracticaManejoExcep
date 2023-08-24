//Hecho por: Andrés López Corrales
import java.util.Scanner;

public class Main {

    //Ejercicio 1: Crear método caracterEn
    public static char caracterEn (String cadena, int numero) throws Exception{

        char devuelveValor = ' ';

        if (numero>=0 && numero < cadena.length()){
            devuelveValor = cadena.charAt(numero);

        }else {
            throw new Exception("Has intentado recuperar una posición " +
                    "de la cadena de caracteres que no existe");
        }
        return devuelveValor; //char que nos devuelve
    }

    //Ejercicio 2: En un main, utilizar método "caracterEn" para probar input de String
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");

        try {
            String lectTeclado = scanner.nextLine();
            System.out.println("Char obtenido: " + caracterEn(lectTeclado,7));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        scanner.close(); //Cerrar Scanner

    }//end main
}
