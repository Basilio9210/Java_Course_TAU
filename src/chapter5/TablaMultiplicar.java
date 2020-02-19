/*
Cuando uno plantea una clase en lugar de especificar todo el algoritmo
 en un único método (lo que hicimos en los primeros pasos de este tutorial) 
 es dividir todas las responsabilidades de las clase en un conjunto de métodos.

Un método hemos visto que tiene la siguiente sintaxis:

public void [nombre del método]() {
  [algoritmo]
}
Veremos que hay varios tipos de métodos:

Métodos con parámetros.
Un método puede tener parámetros:

public void [nombre del método]([parámetros]) {
  [algoritmo]
}
Los parámetros los podemos imaginar como variables locales al método, 
pero su valor se inicializa con datos que llegan cuando lo llamamos.

*/

import java.util.Scanner;

public class TablaMultiplicar {
    public void cargarValor() {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1);
    }
    
    public void calcular(int v) {
        for(int f=v;f<=v*10;f=f+v) {
            System.out.print(f+"-");
        }
    }
    
    public static void main(String[] ar) {
        TablaMultiplicar tabla;
        tabla=new TablaMultiplicar();
        tabla.cargarValor();
    }
}
