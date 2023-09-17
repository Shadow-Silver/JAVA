
import java.util.Arrays; //Mostrar elementos de un array
import java.util.Scanner; //leer datos de entrada
public class Main {
    public static void main(String[] args) {
        System.out.print("-----------------");System.out.println("|");// con ln en print es para saltar linea
        System.out.print("Digite 10 numeros");System.out.println("|");
        System.out.print("-----------------");System.out.println("|");
//Añadir los 10 numeros del array
        int T=10; //tamaño del array
        int array[];
        array= new int[T];
        Scanner datos = new Scanner (System.in);
        for(int i=0; i<=9; i++){
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese el numero de la posicion "+ i+" del array:");
            int numeros = datos.nextInt();
            array[i] = numeros;
        }

//menu
        Scanner opcion = new Scanner (System.in);// leer entrada de datos
        System.out.println("-----------------");
        System.out.println("Menu de opciones:");System.out.println("1. Sumar ");System.out.println("2. Numeros pares");System.out.println("3. Numeros impares");System.out.println("4. Promedio");
        System.out.println(".........................");
        System.out.print("Eliga la opcion deseada:");
        int menu = opcion.nextInt();
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += array[i];
        }
        switch (menu) {
            case 1:
                System.out.println("Ha Elegido la opcion de Sumar.");
                System.out.print("Los elementos del array son:"); System.out.println(Arrays.toString(array)); //imprimir elementos del array
                System.out.println("La suma del array es: " + suma);
                break;
            case 2:
                System.out.println("Ha Elegido la opcion de Identificar numeros pares del array.");
                System.out.print("Los elementos del array son:"); System.out.println(Arrays.toString(array)); //imprimir elementos del array
                int pares = 0;
                for (int i = 0; i < 10; i++) {
                    if (array[i] % 2 == 0) {
                        System.out.println("El número " + array[i] + " es par");
                        pares++;
                    } else {
                    }
                }
                System.out.println("Total de números pares en el array: " + pares);
                System.out.print("(");
                for (int i : array){

                    if (i % 2 == 0){

                        System.out.print(i+",");

                    }
                }
                System.out.println(")");

                break;
            case 3:
                System.out.println("Ha Elegido la opcion Identificar numeros impares del array.");
                System.out.print("Los elementos del array son:"); System.out.println(Arrays.toString(array)); //imprimir elementos del array
                int impares = 0;
                for (int i = 0; i < 10; i++) {
                    if (array[i] % 2 != 0) {
                        System.out.println("El número " + array[i] + " es impar");
                        impares++;
                    } else {
                    }
                }
                System.out.println("Total de números impares en el array: " + impares);
                System.out.print("(");
                for (int i : array){

                    if (i % 2 != 0){

                        System.out.print(i+",");

                    }
                }
                System.out.println(")");
                break;
            case 4:
                float promedio = suma/T;
                System.out.println("Ha Elegido la opcion de Promedio.");
                System.out.print("Los elementos del array son:"); System.out.println(Arrays.toString(array)); //imprimir elementos del array
                System.out.println("La promedio del array es: " + promedio);
                break;
            default:
                System.out.println("Opcion no valida. :( ");

        }

    }
}

