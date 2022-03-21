import com.sun.corba.se.impl.legacy.connection.USLPort;
import com.sun.deploy.net.socket.UnixSocketException;

import java.util.Scanner;

public class GuiaDeIntroduccion {

    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("<----------------------------------------------------------------------------------->");
            System.out.println("Ingrese el ejercicio a correr, para finalizar ingrese 0");
            System.out.println("<----------------------------------------------------------------------------------->");
            valor = sc.nextInt();
            switch (valor) {

                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    ejercicio15();
                    break;
                case 16:
                    ejercicio16();
                    break;
                case 17:
                    ejercicio17();
                    break;
                case 18:
                    ejercicio18();
                    break;
                case 0:
                    System.out.println("Exit ...");
                    break;
            }
        }while(valor!=0);
    }

    private static void ejercicio1(){
         int a=5;
         double b=39;
         char c='j';
        System.out.println("La suma de a + b es : " + (a+b));
        System.out.println("La resta de a - b es : " + (b-a));
        System.out.println("El valor numero del char es : " + (int)c);
    }

    public static void ejercicio2() {
        int x=5;
        int y=10;
        double n=30;
        double m = 50;
        System.out.println("Suma de x+y x suma de n+m : \n" + ((x+y)*(n+m)));
        System.out.println("Resta de x-y dividido por n+m : \n" + ((x-y)/(n+m)));
        System.out.println("Multiplicación de x*y + n*m : \n" + ((x*y) * (n*m)) );
        System.out.println("Division entre x/y + n/m : \n" + ((x/y)+(n/m)));
    }

    private static void ejercicio3(){
            int n = 10;
        System.out.println("N es igual a : " + n);
            n+=77;
        System.out.println("N + 77 es : " + n);
            n-=84;
        System.out.println("N a 3 : " + (n=3));
            n*=2;
        System.out.println("N por 2 es : " + n);
    }

    private static void ejercicio4(){
       int a=5;
       int b=6;
       int c=7;
       int d=8;
       int aux;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("\n");
        System.out.println("A igual a D " + a);
        System.out.println("B igual a C " + b);
        System.out.println("C igual a A " + c);
        System.out.println("D igual a B " + d);
    }

    private static void ejercicio5(){
        int a=9;
        if(a%2 ==0){
            System.out.println(a + " es un numero par");
        }else {
            System.out.println( a + " es un numero  impar");
        }
    }

    private static void ejercicio6(){
        int a=9;
        if(a>=0){
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero es negativo");
        }
    }

    private static void ejercicio7(){
        int a=100;
       if(a>=0){
           System.out.println(a + " es un numero positivo");
       }else{
           System.out.println(a + "es un numero negativo");
       }

       if(a%2==0){
           System.out.println(a + " es un numero par");
       }else{
           System.out.println(a + " es un numero impar");
       }

       if(a%5==0){
           System.out.println(a + " es un multiplo de 5");
       }else if(a%10==0){
           System.out.println(a + " es un multiplo de 5");
       }
       else{
           System.out.println(a + " no es multiplo de 5 ni de 10");
       }

       if(a>=100){
           System.out.println(a + " es un numero mayor o igual a 100");
       }else{
           System.out.println(a + " es un numero menor a 100");
       }
    }

    private static void ejercicio8(){
        String nombre= "Agustin Mineo";
        System.out.println("Buenos dias " + nombre);
    }

    private static void ejercicio9(){
        int num,numx2,numx3;
        System.out.println("Ingrese un numero entero \n");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();  /// Buffer de valor, lee el dato basicamente
        numx2=num*2;
        numx3=num*3;
        System.out.println("El numero " + num + " multiplicado por 2 es : " + numx2);
        System.out.println("El numero " + num + " multiplicado por 3 es : " + numx3);
    }

    private static void ejercicio10(){
        double farenheit,centigrados;
        System.out.println("Ingrese los grados Fahrenheit : ");
        Scanner sn = new Scanner(System.in);
        farenheit = sn.nextInt();
        centigrados= ((farenheit-32)*5)/9;
        System.out.println(farenheit + " Farenheit son " + centigrados + "º centigrados");
    }

    private static void ejercicio11(){
        Scanner sc = new Scanner(System.in);
        double radio, area, longitud;
        System.out.println("Ingrese el radio de la circunferencia : \n");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio,2);
        System.out.println("La longitud de la circunferencia es : " + longitud);
        System.out.println("El area de la circunferencia es : " + area);
    }

    private static void ejercicio12(){
        Scanner sc = new Scanner(System.in);
        double velocidadK,velocidadM;
        System.out.println("Ingrese la velocidad en K/h : \n");
        velocidadK = sc.nextDouble();
        velocidadM = velocidadK*1000/3600;
        System.out.println("La velocidad en m/s es de : " + velocidadM);
    }

    private static void ejercicio13(){
        Scanner sc = new Scanner(System.in);
        double cateto1,cateto2,hipotenusa;
        System.out.println("Ingrese el primer Cateto : \n");
        cateto1 = sc.nextDouble();
        System.out.println("Ingrese el segundo Cateto : \n");
        cateto2 = sc.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        System.out.println("La hipotenusa de los catetos es : " +hipotenusa);
    }

    private static void ejercicio14(){
        Scanner sc = new Scanner(System.in);
        double radio,num1,volumen;
        System.out.println("Ingrese el radio de la esfera");
        radio = sc.nextDouble();
        num1= Math.PI*Math.pow(radio,3);
        volumen = num1*(4.0/3); /// Se pone el . para que sea tipo double (cuatro tercios)
        System.out.println("El volumen de la esfera es de : " + volumen);
    }

    private static void ejercicio15(){
        Scanner sc = new Scanner(System.in);
        double lado1,lado2,lado3,area,total;
        System.out.println("Ingrese el lado 1");
        lado1 = sc.nextDouble();
        System.out.println("Ingrese el lado 2");
        lado2 = sc.nextDouble();
        System.out.println("Ingrese el lado 3");
        lado3 = sc.nextDouble();
        total= (lado1+lado2+lado3)/2;
        area = Math.sqrt(total*(total-lado1)*(total-lado2)*(total-lado3));
        System.out.println("El area del triangulo es de  : " + area);
    }

    private static void ejercicio16(){
        Scanner sc = new Scanner(System.in);
        int numero,primero,segundo,tercero;
        System.out.println("Ingrese un numero de 3 cifras");
        numero = sc.nextInt();
        primero = numero/100;
        segundo = ((numero/10)%10);
        tercero = numero%10;
        System.out.println("El primer numero es : " + primero);
        System.out.println("El segundo numero es : " + segundo);
        System.out.println("El tercer numero es : " + tercero);
    }

    private static void ejercicio17(){
        Scanner sc = new Scanner(System.in);
        int numero,numIm,numIm1;
        System.out.println("Ingrese un numero de 5 cifras");
        numero = sc.nextInt();
        numIm= numero/1000;
        //numIm1=numero/
    }

    private static void ejercicio18(){
        Scanner sc = new Scanner(System.in);
        int hora,minuto,segundo;
        System.out.println("Ingrese la Hora");
        hora = sc.nextInt();
        System.out.println("Ingrese los minutos");
        minuto = sc.nextInt();
        System.out.println("Ingrese los segundos");
        segundo = sc.nextInt();
        if(hora<24 && minuto <60 && segundo<60){
            System.out.println(hora +" : "+minuto +" : "+segundo + " es una hora valida");
        }else
        {
            System.out.println(hora +" : "+minuto +" : "+segundo + " es una hora invalida");
        }
    }
}
