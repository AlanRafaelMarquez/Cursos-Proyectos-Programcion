package RetornoDeValores;

import javax.swing.*;

public class Main {
    public static void main (String[]args){



        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

        RetornoDeValores op = new RetornoDeValores();
        /*int suma = op.Sumar(n1,n2);
        int resta = op.Restar(n1,n2);
        int multi = op.Multi(n1,n2);
        int divi = op.Divi(n1,n2);
*/
        System.out.println("La suma es: "+op.Sumar(n1,n2));
        System.out.println("La resta es: "+op.Restar(n1,n2));
        System.out.println("La multiplicacion es: "+op.Multi(n1,n2));
        System.out.println("La division es: "+op.Divi(n1,n2));

        //op.MostrarResultados(suma,resta,multi,divi);



    }
}
