package model.entities;


public class Matrix {
	private Integer size;
	private Integer[][] matrix;
	
	public Matrix() {
		
	}
	
	public Integer getSize() {
		return size;
	}		
	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(Integer[][] matrix) {
		this.matrix = matrix;
	}
	
	// método de inicialização do grafo
	public void initReseltMatrix() {
		matrix = new Integer[getSize()][getSize()];
		
		for (int string=0; string<getSize();string++)
			for(int column=0; column<getSize();column++)
					matrix[string][column] = 0;
	}
	
	public void initPrint() {		
		for (int string=0; string<getSize();string++) {
			for(int column=0; column<getSize();column++)
					System.out.print(" " + (matrix[string][column] = 0));
		System.out.printf("\n");
		}
	}
}