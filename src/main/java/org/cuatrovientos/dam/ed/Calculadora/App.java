package org.cuatrovientos.dam.ed.Calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	String operacion = args[0]; // Se establece la operacion que se desea //
        double numero1 = Double.parseDouble(args[1]); 
        double numero02 = Double.parseDouble(args[2]);

        switch (operacion.toLowerCase()) {
		
		     case "suma": 
			  System.out.println("Resultado: " + (numero1 + numero02)); 
			  break;
		
            case "resta":
                System.out.println("Resultado: " + (numero1 - numero02));
                break;
            case "multiplicacion":
                System.out.println("Resultado: " + (numero1 * numero02));
                break;
            case "division":
                if (numero02 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero02));
                }
            default:
                System.out.println("Operación no válida. Las opciones son: suma, resta, multiplicacion o division.");
        }
    }
    }

