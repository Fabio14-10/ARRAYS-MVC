
package Modelo;

public class ModeloNumero {
        public void jugarFizzBuzz(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Numero no divisible ni por 3 ni por 5");
        }
    
}
}
