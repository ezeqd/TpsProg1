import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa1{
    public static void main (String[] args) {
        int n;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        do {
          try {
            system.out.println("ingrese cantidad de triangulos");
            n = new integer (entrada.readline());
            for (int i=0; i<n; i++) {
              try {
                system.out.println("ingrese base");
                base = new integer (entrada.readline());
                system.out.println("ingrese altura");
                altura = new integer (entrada.readline());
                if ((base*altura)>12) {
                  mayores++;
                }
                system.out.println("La base es "+base);
                system.out.println("La altura es "+altura);
              }
              catch (Exception exc) {
                system.out.println(exc);
                base = 0;
                altura = 0;
              }
            }
          }
          catch (Exception exc) {
            system.out.println(exc);
            n = 0;
          }
        } while (n>=0);
        system.out.println("Hay "+mayores+" triangulos con superficie mayor a 12");
    }
}
