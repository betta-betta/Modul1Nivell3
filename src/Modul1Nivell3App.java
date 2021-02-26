
public class Modul1Nivell3App {

	public static void main(String[] args) {
		
		int[] array={1,2,3,4,5,6,7,8,9,10};
		int[] aux=new int [array.length];
		
		for(int i=array.length-1,j=0;i>=0;i--,j++ ) {
			aux[j]=array[i];
		System.out.print (aux[j]+" ");
		
		}
		
	}

}
