package mono;

import java.util.Arrays;

public class ordenar {

	public ordenar() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int [] arr = {2,8,1,1,3,1,1,4,4,2,4,7,9,6};
		Arrays.sort(arr);
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
				
		}
		System.out.println("]");
		
		mostrarRepetidos(arr);
	}
	
	
	 static void mostrarRepetidos(int[] pArray){
		 	int aux = 0;
	        for(int i=0;i<pArray.length-1;i++){
	            for(int j=i+1;j<pArray.length;j++){
	                if(pArray[i]==pArray[j]){
	                    //System.out.println("Elemento repetido: " + pArray[i]);
	                    aux++;
	                }
	            }
	        }
	        System.out.println(" En total existen "+aux+" Elementos repetidos");
	    }
}
