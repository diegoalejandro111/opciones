import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        int valor1;
        int valor2;
        int suma;
        int multi;
        int edad;
        int valorAgregado;
        int base;
        int altura;
        int area;
        int opcion1;
        int opcion2;
        int opcion3;
        int opcion;
        int valor;

        System.out.printf(" por favor elija una de las siguientes opciones,1,2,3 " );
        System.out.println(" la opcion 1 sirve para ingresar dos valores " );
        System.out.println( " la opcion 2 sirve para ingresar su edad " );
        System.out.println(" la opcion 3 sirve para ingresar los valores correspondientes del triangulo " );
        opcion = entrada.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("por favor digite dos valores");
                valor1 = entrada.nextInt();
                valor2 = entrada.nextInt();

                suma = valor1 + valor2;
                multi = valor1 * valor2;

                System.out.println("el resultado de la suma es: " + suma);
                System.out.println("el resultado de la multi es :" + multi);


                    case 2:
                        System.out.println("por favor escriba su edad");

                        edad = entrada.nextInt();


                        if (edad >=  18) {
                            System.out.println("usted es mayor de edad");
                            System.out.println("el usuario ya es mayor de edad se le hara un cobro de 10mil + su edad");

                            valorAgregado = edad + 10000;
                            System.out.println("su valorAgregado es de :" + valorAgregado);
                        } else {
                            System.out.println(" usted es menor de edad toda via no genera cobro");

                        }
                        System.out.print("porfavor ingrese su nombre " );
                        System.out.println("ERRORRRRRR  usted no pudo ingresar su nombre por problemas tecnicos en la pagina wed " );
                        System.out.println("por favor pro_siga respondiendo las siguientes preguntas y aga de cuenta que nada paso " );



            case 3:
                            System.out.println("por favor ingresa la base la altura de un triangulo y hallar y mostrar el area del triangulo");
                            base = entrada.nextInt();
                            altura = entrada.nextInt();
                            area = entrada.nextInt();

                            area= (base+altura)/2;

                            System.out.println("el area del triangulo es :"+area);


                        case 4:
                            System.out.print("usted no excogio ninguna opcion por favor seleccione una opcion puede ser 1 - 2 - 3");

                           opcion1 = entrada.nextInt();
                           opcion2 = entrada.nextInt();
                           opcion3 = entrada.nextInt();

                    }
                }
                }

