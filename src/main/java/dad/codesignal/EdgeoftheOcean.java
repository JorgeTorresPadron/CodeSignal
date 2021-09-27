package dad.codesignal;

import java.util.Arrays;

public class EdgeoftheOcean {

	int adjacentElementsProduct(int[] inputArray) {
		int producto = 0;
		int productoMaximo = -2147483648; // El minimo valor posible de un Integer para hacer la comprobacion
		for (int i = 0, j = i + 1; i < inputArray.length - 1 && j < inputArray.length; i++, j++) {
			producto = inputArray[i] * inputArray[j];
			if (producto > productoMaximo) {
				int a = inputArray[i];
				int b = inputArray[j];
				productoMaximo = producto;
			}
		}
		return productoMaximo;
	}
	
	int shapeArea(int n) {
		int area = 1;
		while (n > 1) {
			area += (n - 1) * 4; 
			n -= 1;
		}
		return area;
	}
	
	int makeArrayConsecutive2(int[] statues) {
		Arrays.sort(statues); //El array de menor a mayor
		int tamaños = 0;
		for(int i = 1; i<statues.length; i++){
		tamaños += (statues[i] - (statues[i-1]+1)); //Los tamaños que faltan
		}
		return tamaños;
		}
}
