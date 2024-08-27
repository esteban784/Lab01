import java.util.Scanner;

public class Consola {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Calculadora calcul = new Calculadora();

        while (true) {
            System.out.println("Ingrese la operacion que desea realizar:");
            System.out.println("1 suma ");
            System.out.println("2 resta ");
            System.out.println("3 multiplicacion ");
            System.out.println("4 division ");
            System.out.println("5 seno ");
            System.out.println("6 coseno");
            System.out.println("7 tangente");
            System.out.println("8 raiz ");
            System.out.println("9 potencia ");
            System.out.println("10 iva ");
            System.out.println("11 salir ");
            int opc = ingreso.nextInt();

            if (opc == 11) {
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (opc) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Ingrese el primer número:");
                    float a = ingreso.nextFloat();
                    System.out.println("Ingrese el segundo número:");
                    float b = ingreso.nextFloat();
                    calcul.num1 = a;
                    calcul.num2 = b;
                    switch (opc) {
                        case 1:
                            calcul.suma();
                            System.out.println("La suma es: " + calcul.resultado);
                            break;
                        case 2:
                            calcul.resta();
                            System.out.println("La resta es: " + calcul.resultado);
                            break;
                        case 3:
                            calcul.multiplicacion();
                            System.out.println("La multiplicacion es: " + calcul.resultado);
                            break;
                        case 4:
                            calcul.divicion();
                            System.out.println("La division es: " + calcul.resultado);
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Ingrese el numero:");
                    float c = ingreso.nextFloat();
                    calcul.num1 = c;
                    calcul.sen();
                    System.out.println("El seno es: " + calcul.resultado);
                    break;
                  case 6:
                    System.out.println("Ingrese el numero:");
                    float d = ingreso.nextFloat();
                    calcul.num1 = d;
                    calcul.cos();
                    System.out.println("El coseno es: " + calcul.resultado);
                    break;    

                case 7:
                    System.out.println("Ingrese el numero:");
                    float e = ingreso.nextFloat();
                    calcul.num1 = e;
                    calcul.tan();
                    System.out.println("El tangente es: " + calcul.resultado);
                    break;

                case 8:
                    System.out.println("Ingrese el número:");
                    float f = ingreso.nextFloat();
                    System.out.println("Ingrese el índice de la raíz:");
                    float indice = ingreso.nextFloat();
                    calcul.num1 = f;
                    calcul.raizEnesima(indice);
                    System.out.println("La raíz " + indice + " de " + f + " es: " + calcul.resultado);
                    break;

                case 9:
                    System.out.println("Ingrese el número:");
                    float g = ingreso.nextFloat();
                    System.out.println("Ingrese el exponente:");
                    float exponente = ingreso.nextFloat();
                    calcul.num1 = g;
                    calcul.potenciaEnesima(exponente);
                    System.out.println(g + " elevado a la potencia " + exponente + " es: " + calcul.resultado);
                    break;

                case 10:
                    System.out.println("Ingrese el monto:");
                    float monto = ingreso.nextFloat();
                    System.out.println("Ingrese el porcentaje de IVA:");
                    float iva = ingreso.nextFloat();
                    calcul.iva(monto, iva);
                    System.out.println("El IVA es: " + calcul.resultado);
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
