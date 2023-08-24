//Hecho por: Andrés López Corrales
import java.util.Scanner;

//Ejercicio 3: Sacar raíz de un número positivo y lanzar excpeción si es negativo
public class NumeroNegativoExcepcion extends Exception {

    public NumeroNegativoExcepcion(){ //Constructor sin parametros
        super();
    }

    public NumeroNegativoExcepcion(String msg){ //Constructor con parametros
        super(msg);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un numero: ");

        try{
            double valorNumerico = scanner.nextDouble();
            if (valorNumerico >= 0){
                System.out.println(Math.sqrt(valorNumerico));
            }else {
                throw new NumeroNegativoExcepcion ("Error. Ingresaste un numero negativo");
            }

        }catch (NumeroNegativoExcepcion nne){
            System.out.println(nne.getMessage());
        }

        scanner.close(); //Cerrar Scanner

    }//end main
}
