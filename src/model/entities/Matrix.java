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
		for (int row=0; row <= getSize();row++)
			System.out.print(" " + row);
		System.out.println();
		for (int row=1; row <= getSize();row++) {
			if (row <10)
				System.out.print(" " + row);
			else 
				System.out.print(row);
			for(int column=1; column <= getSize();column++)
				if (column < 10)
					System.out.print(" " + matrix[row][column]);
				else 
					System.out.print("  " + matrix[row][column]);
		System.out.printf("\n");
		}
	}
	
	// Setando o valor no Array
	public int update(int row, int column, int value) {
		return this.matrix[row][column] = value;
	}
	
	public int Readsmaller() {
		int valueSamller = 0;
		for (int row=1; row <= getSize();row++)
			for(int column=1; column <= getSize();column++)
				if (matrix[row][column] != 0) 
						valueSamller = 	matrix[row][column];
		
		for (int row=1; row <= getSize();row++)
			for(int column=1; column <= getSize();column++)
				if (matrix[row][column] > matrix[row][column]) 
					valueSamller = 	matrix[row][column];
		
		return valueSamller;
	}
}