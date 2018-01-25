package ClasesUtiles;

import java.util.ArrayList;
/* Silvestre Leonardo Gonz�lez Abreu	(170404)
 * 15/nov/2017
 * Generaci�n de la clase para manejar arreglos y listas con m�todos gen�ricos de acceso est�tico.
 */
public class ManejadorArreglosGenerico {

	public static <T extends Comparable<T>> int mayor(T[] arr,int n){
		int indMay=0;
		
		for(int i=1;i<n;i++)
			if(arr[i].compareTo(arr[indMay])>0){
				indMay=i;
			}
		return indMay;
	}
	public static <T extends Comparable<T>> int mayor(T[] arr,int n,int ini){
		int indMay=ini;
		
		for(int i=ini+1;i<n;i++)
			if(arr[i].compareTo(arr[indMay])>0){
				indMay=i;
			}
		return indMay;
	}
	public static <T extends Comparable<T>> int menor(T[] arr,int n) {
		int indMen=0;
		
		for(int i=1;i<n;i++)
			if(arr[i].compareTo(arr[indMen])<0) {
				indMen=i;
			}
		return indMen;
	}
	public static <T extends Comparable<T>> int menor(T[] arr,int n,int ini) {
		int indMen=ini;
		
		for(int i=ini+1;i<n;i++)
			if(arr[i].compareTo(arr[indMen])<0) {
				indMen=i;
			}
		return indMen;
	}
	public static <T extends Comparable<T>> int cuantosMayX(T[] arr,int n,T x) {
		int cont=0;
		
		for(int i=0;i<n;i++)
			if(arr[i].compareTo(x)>0)
				cont++;
		return cont;
	}
	public static <T extends Comparable<T>> int cuantosMenX(T[] arr,int n,T x) {
		int cont=0;
		
		for(int i=0;i<n;i++)
			if(arr[i].compareTo(x)<0)
				cont++;
		return cont;
	}
	public static <T extends Comparable<T>> ArrayList<Integer> cualesMayX(T[] arr,int n,T x) {
		ArrayList<Integer> inds=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
			if(arr[i].compareTo(x)>0)
				inds.add(i);
		return inds;
	}
	public static <T extends Comparable<T>> ArrayList<Integer> cualesMenX(T[] arr,int n,T x) {
		ArrayList<Integer> inds=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
			if(arr[i].compareTo(x)<0)
				inds.add(i);
		return inds;
	}
	public static <T> void swap(T[] arr,int ind1,int ind2) {
		T temp;
		
		temp=arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
	}
	public static <T> void invierte(T[] arr,int n) {
		for(int i=0;i<n/2;i++) {
			swap(arr,i,n-i-1);
		}		
	}
	public static <T extends Comparable<T>> int union(T[] arrA,T[] arrB,int nA,int nB,T[] arrR) {
		int i=0,j=0,k=0;
		
		while(i<nA && j<nB){
			if(arrA[i].compareTo(arrB[j])<0){
				arrR[k]=arrA[i];
				i++;
			}
			else {
				arrR[k]=arrB[j];
				if(arrA[i].equals(arrB[j]))
					i++;
				j++;
			}
			k++;
		}
		if(i<nA)
			for(int r=i;r<nA;r++){
				arrR[k]=arrA[r];
				k++;
			}
		else
			for(int r=j;r<nB;r++){
				arrR[k]=arrB[r];
				k++;
			}	
		return k;
	}
	public static <T extends Comparable<T>> int interseccion(T[] arrA,T[] arrB,int nA,int nB,T[] arrR) {
		int i=0,j=0,k=0;
		
		while(i<nA && j<nB) {
			if(arrA[i].equals(arrB[j])) {
				arrR[k]=arrA[i];
				i++;
				j++;
				k++;
			}
			else if(arrA[i].compareTo(arrB[j])<0)
				i++;
			else
				j++;
		}
		return k;
	}
	public static <T> void kCorrimientosIzq(T[] arr,int n,int k) {
		for(int i=0;i<n-k;i++)
			arr[i]=arr[i+k];
		for(int j=n-k;j<n;j++)
			arr[j]=null;
	}
	public static <T> void kCorrimientosIzq(T[] arr,int n,int k,int ini) {
		int i;
		
		for(i=ini;i<n-k;i++)
			arr[i]=arr[i+k];
		for(int j=i;j<n;j++)
			arr[j]=null;
	}
	public static <T> void kCorrimientosDer(T[] arr,int n,int k) {
		for(int i=n-1;i>=k;i--)
			arr[i]=arr[i-k];
		for(int j=0;j<k;j++)
			arr[j]=null;
	}
	public static <T> void kCorrimientosDer(T[] arr,int n,int k,int ini) {
		for(int i=n-1;i>=k+ini;i--)
			arr[i]=arr[i-k];
		for(int j=ini;j<k+ini;j++)
			arr[j]=null;
	}
	public static <T> void unCorrimientoDer(T[] arr,int n,int ini) {
		for(int i=n-1;i>=ini+1;i--)
			arr[i]=arr[i-1];
		arr[ini]=null;
	}
	public static <T extends Comparable<T>> void seleccionDirecta(T[] arr,int n) {
		int indMen;
		
		for(int i=0;i<n-1;i++) {
			indMen=menor(arr,n,i);
			swap(arr,i,indMen);
		}
	}
	public static <T> int eliminaRepetidosOrden(T[] arr,int n) {
		int i=0;
		
		while(i<n-1) {
			if(arr[i].equals(arr[i+1])) {
				kCorrimientosIzq(arr,n,1,i);
				n--;
			}
			i++;
		}
		return n;
	}
	public static <T> int busSecDes(T[] arr,int n,T x) {
		int i=0;
		
		while(i<n && !arr[i].equals(x))
			i++;
		if(i==n)
			i=-1;
		return i;
	}
	public static <T extends Comparable<T>> int busSecOrd(T[] arr,int n,T x) {
		int i=0;
		
		while(i<n && arr[i].compareTo(x)<0)
			i++;
		if(i==n || !arr[i].equals(x))
			i=-i-1;
		return i;
	}
	public static <T extends Comparable<T>> int busBin(T[] arr,int n,T x) {
		int ini=0,fin=n-1,mitad,res;
		mitad=(ini+fin)/2;
		
		while(ini<=fin && !arr[mitad].equals(x)) {
			if(x.compareTo(arr[mitad])>0)
				ini=mitad+1;
			else
				fin=mitad-1;
			mitad=(ini+fin)/2;
		}
		if(ini>fin)
			res=-ini-1;
		else
			res=mitad;
		return res;
	}
	public static <T extends Comparable<T>> boolean arrsCircIg(T[] arrA,int nA,T[] arrB,int nB) {
		boolean res=false;
		
		if(nA==nB) {
			int i=0,j=busSecDes(arrB,nB,arrA[i]);
			
			if(j>=0) {
				do {
					i++;
					j++;
					if(j==nB)
						j=0;
				}while(i<nA && arrA[i].equals(arrB[j]));
				if(i==nA)
					res=true;
			}
		}
		return res;
	}
	
	public static <T> T masRepetido(T[] arr,int n) {
		//soluci�n poco eficiente, pero que ejemplifica el uso de arreglos paralelos
		T[] aux=arr;
		Integer[] cont=new Integer[n];
		int i=1,par=0;
		
		for(int j=1;j<n;j++)
			aux[i]=null;
		
		cont[0]=1;
		while(i<n) {
			if(arr[i].equals(aux[par]))
				cont[par]++;
			else {
				par++;
				aux[par]=arr[i];
				cont[par]=1;
			}
			i++;
		}
		return aux[mayor(cont,par+1)];
	}
}