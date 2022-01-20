import javax.swing.JOptionPane;
public class dosArraysAPP {
 
    public static void main(String[] args) {
 
    	//Indicamos el tamaño del array
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int tamanio=Integer.parseInt(texto);
 
        //Creamos los arrays
        int array1[]=new int [tamanio];
        int array2[];
 
        //Rellenamos el array1
        rellenarArray(array1, 10, 100);
 
        //Apuntamos el array2 al array1
        array2=array1;
 
        //Creamos un nuevo array, usando el array1. Array1 tendra una nueva direccion.
        array1=new int[tamanio];
 
        rellenarArray(array1, 10, 100);

        int array3[]=multiplicador(array1, array2);
 
        System.out.println("Array1");
        mostrarArray(array1);
 
        System.out.println("Array2");
        mostrarArray(array2);
 
        System.out.println("Array3");
        mostrarArray(array3);
 
    }
    public static void rellenarArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){

            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
 
    public static int[] multiplicador(int array1[], int array2[]){
        int array3[]=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i]*array2[i];
        }
        return array3;
    }
}