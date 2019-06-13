import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ej2 {
  final static int M = 10;
  final static int N = 10;
  public static void main(String[] args) {
    int matriz[][] = new int[M][N];
    carga_matriz(matriz);
    insertar_pos(matriz);
    imprimir_matriz(matriz);
  }
  public static void imprimir_matriz (int[][] mat){
    for (int i=0; i<M; i++) {
      for (int j=0; j<N; j++) {
        System.out.println(mat[I][J]+" ");
      }
      System.out.println(" ");
    }
  }
  public static void carga_matriz (int[][] mat){
    for (int i=0; i<M; i++){
      for (int j=0; j<N; j++){
        mat[i][j]=(int)(Math.random()*100+1);
      }
    }
  }
  public static void obtener_arreglo (int[] arr){
    boolean flag = false;
    for (int j=0; j<N; j++) {
      do {
        try{
          BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
          System.out.println("Ingrese número: "+j);
          arr[j] = new Integer(entrada.readLine());
          flag = true;
        }
        catch (Exception exc) {
          System.out.println(exc);
          flag = false;
        }
      } while (!flag);
    }
  }
  public static int obtener_posicion (){
    int valor = 0;
    boolean flag = false;
    do {
      try{
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingrese la posicion");
        valor = new Integer(entrada.readLine());
        if (valor<=N){
          flag = true;
        }
      }
      catch (Exception exc) {
        System.out.println(exc);
        flag = false;
      }
    } while (!flag);
    return valor;
  }
  public static void insertar_pos (int[][] mat){
    int array[] = new int[N];
    int pos;
    obtener_arreglo(array);
    pos = obtener_posicion();
  }
  public static void eliminar_pos (int[][] mat){
    int pos;
    pos = obtener_posicion();
    for (int j=0;j<N;j++){
      mat[pos][j] = 0;
    }
  }
  public static void ordenar_fila (int[][] mat){
    
  }
}
