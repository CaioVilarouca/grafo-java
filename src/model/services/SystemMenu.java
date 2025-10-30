	package model.services;
	
	import java.util.Scanner;
	
	import model.entities.Matrix;
	
	public class SystemMenu {	
		private Integer option;
		private Matrix matrix = new Matrix();
		private Scanner scanner = new Scanner(System.in);
		
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
					System.out.println(matrix.getMatrix());
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				}
			}while(getOption() != 5);
		}
		
		// Regras e negócio 
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
			
				public int menuOption() {
					System.out.print("====== MENU DE CONTROLE ======="
							+ "\n= 1: Inicializar a Matriz     ="
							+ "\n= 2: Imprimir a Matriz        ="
							+ "\n= 3: Inserir valor na Matriz  ="
							+ "\n= 4: Identificar o Menor      ="
							+ "\n= 5: Sair do Programa         ="
							+ "\n==============================="
							+"\n     Informe a opção: ");
					
					setOption(scanner.nextInt());
					System.out.println("Menu: " + option);
					validationOption();
					return getOption();
				}
				
				/*public int sizeMatrix() {
					System.out.print("Informe o tamanho da matriz:");
					matrix.setSize(scanner.nextInt());
					
					// Regra de négocio
					if (matrix.getSize() == 0) {
						System.out.println("Tamanho não informado: " +matrix.getSize()+" status[Não Salvo]");
						return 0;
					}		
					
					if (matrix.getSize() < 0) {
						System.out.println("Número negativo: " +matrix.getSize()+" status[Não Salvo]");
						return 0;
					}
					
					System.out.println("Tamanho: " + matrix.getSize() + " status[Salvo]");
					return matrix.getSize();
				}*/
						
	}

	