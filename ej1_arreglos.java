import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej1_arreglos {
    final static int MAX = 10;
    public static void main (String[] args) {
      int Array[]=new int[MAX];
      cargaArreglo();
      imprimirArreglo();
    }

    public static void cargaArreglo(){
      for (int pos=0;pos<MAX;pos++){
        System.out.println ("Ingrese entero: "+pos);
        Array[pos]=obtenerEntero();
      }
    }

    public static void imprimirArreglo(){
      for (int pos=0;pos<MAX;pos++){
        System.out.println(Array[pos]);
      }
    }

    public static int obtenerEntero(){
      int valor = 0;
      boolean flag = false;
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      do{
        try{
          valor = new Integer(entrada.readLine());
          flag = true;
        }
        catch (Exception exc) {
          flag = false;
        }
      } while (!flag);
      return valor;
    }
}
