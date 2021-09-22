package dad.codesignal;

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
}
