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
					matrix.initPrint();
					break;
				case 3:
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
	}

	