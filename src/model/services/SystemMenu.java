	package model.services;
	
	import java.util.Scanner;
	
	import model.entities.Matrix;
	
	public class SystemMenu {	
		private Integer option;
		private Scanner scanner = new Scanner(System.in);
		private Matrix matrix = new Matrix();
		
		public Integer getOption() {
			return option;
		}
	
		public void setOption(Integer option) {
			this.option = option;
		}
		
		// Menu de opção principal 
		public void menu() {
			do {
				menuOption();
				switch (getOption()) {
				case 1:
					sizeMatrix();
					matrix.initReseltMatrix();
					break;
				case 2:
					validationPrint();
					matrix.initPrint();
					break;
				case 3:
					updateMatrix();
					break;
				case 4:
					break;
				}
			}while(getOption() != 5);
		}
		
		// Menu principal 
		public int menuOption() {
			System.out.print("\n====== MENU DE CONTROLE ======="
					+ "\n= 1: Inicializar a Matriz     ="
					+ "\n= 2: Imprimir a Matriz        ="
					+ "\n= 3: Inserir valor na Matriz  ="
					+ "\n= 4: Identificar o Menor      ="
					+ "\n= 5: Sair do Programa         ="
					+ "\n==============================="
					+"\n     Informe a opção: ");
			setOption(scanner.nextInt());
			System.out.println("Menu: " + option +"\n");
			validationOption();
			return getOption();
		}
		
		// Regras de negócio de validação de opção
		public int validationOption() { 
			if (getOption() > 5) {
				System.out.println("(Menu entre 1 e 5): informado: " + getOption());
				return 0;
			}
			if (getOption() < 0) {
				System.out.println("(Número negativo): informado: " + getOption());
				return 0;
			}
			if (getOption() == 0) {
				System.out.println("(Menu entre 1 e 5): informado: " + getOption());
				return 0;
			}
			return getOption();
		}					
		
		// Método para obter o tamanho da matriz
		public int sizeMatrix() {
			System.out.print("Informe o tamanho da matriz: ");
			matrix.setSize(scanner.nextInt());
			validationSize();	
			return matrix.getSize();
		}
		
		// Regras de négocio de validação de tamanho da matriz
		public int validationSize() {
			if (matrix.getSize() == 0) {
				System.out.println("Tamanho não informado: [" +matrix.getSize()+"] | Status[Não Salvo]");
				return 0;
			}		
			if (matrix.getSize() < 0) {
				System.out.println("Número negativo: [" +matrix.getSize()+"] | Status[Não Salvo]");
				return 0;
			}
			System.out.println("Tamanho: [" + matrix.getSize() + "] | Status[Salvo]");
			return matrix.getSize();
		}		
		
		// Regra de négocio de print
		public int validationPrint() {
			if (matrix.getSize() == null) {
				matrix.setSize(0);
				System.out.println("Tamanho não informado: [" +matrix.getSize()+"] | Matriz não pode ser imprimida");
				return matrix.getSize();
			}		
			System.out.println("Tamanho: [" + matrix.getSize() + "] | Matriz imprimida com SUCESSO");
			return matrix.getSize();
		}
		
		public int updateMatrix() {
			if (matrix.getSize() == null) {
				matrix.setSize(0);
				System.out.println("Tamanho não informado: [" +matrix.getSize()+"] | Matriz não pode sofrer UPDATE");
				return matrix.getSize();
			}	
			
			System.out.println("Informe linha, coluna e valor: ");
			System.out.print("Linha: ");
			int row = scanner.nextInt();
			System.out.print("Coluna: ");
			int column = scanner.nextInt();
			System.out.print("Valor: ");
			int value = scanner.nextInt();
			
			if (row == column) {
				System.out.println("Interseção é proibida | Status[Não Salvo]");
				return 0;
			}
			
			if (row < 0 || column < 0) {
				System.out.println("Valor negativos | Status[Não Salvo]");
				return 0;
			}
			
			if (value == 0) {
				System.out.println("Valor 0 invalido! | Status[Não Salvo]");				
				return 0;
			}
			
			if (value < 0) {
				System.out.println("Valor negaivo! | Status[Não Salvo]");				
				return 0;
			}
			
			if (matrix.getMatrix()[row][column] > 0) {
				System.out.printf("Nessa posição tem um valor gravado: %d \nDigite um novo valor para sobrepor ou o mesmo valor caso não queria:", matrix.getMatrix()[row][column]);		
				int newValue = scanner.nextInt();
				System.out.println("Valor informado: " + newValue + "\nUpdate com SUCESSO");
				return matrix.update(row, column, newValue);
			}
			System.out.println("UPDATE COM SUCESSO");
			return matrix.update(row, column, value);
		}		
	}

	