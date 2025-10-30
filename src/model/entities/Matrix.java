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
	
	// método de resetar do grafo
	public void initReseltMatrix() {
		this.matrix = new Integer[getSize()][getSize()];
		
		for (int row=0; row<getSize();row++)
			for(int column=0; column<getSize();column++)
					matrix[row][column] = 0;
	}
	
	// método de inicialização do grafo
	public void initPrint() {		
		for (int row=0; row<getSize();row++) {
			for(int column=0; column<getSize();column++)
					System.out.print(" " + matrix[row][column]);
		System.out.printf("\n");
		}
	}
	
	// Setando o valor no Array
	public int update(int row, int column, int value) {
		return this.matrix[row][column] = value;
	}
}