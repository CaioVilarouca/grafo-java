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
	
	// método de limpar e inicialização matriz
	public void initReseltMatrix() {
		this.matrix = new Integer[getSize() + 1][getSize() + 1];
	
		for (int row=1; row <= getSize();row++)
			for(int column=1; column <= getSize();column++)
					matrix[row][column] = 0;
	}
	
	// método de Imprimir
	public void initPrint() {		
		
		for (int row=1; row <= getSize();row++) {
			for(int column=1; column <= getSize();column++)
					System.out.print(" " + matrix[row][column]);
		System.out.printf("\n");
		}
	}
	
	// Setando o valor no Array
	public int update(int row, int column, int value) {
		return this.matrix[row][column] = value;
	}
}