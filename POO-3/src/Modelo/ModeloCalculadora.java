
package Modelo;


public class ModeloCalculadora {
    public double realizarOperacion(double num1, double num2, String operacion) {
        double resultado = 0;
        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("Operacion no valida.");
                return Double.NaN;
        }
        return resultado;
    }
    
}
