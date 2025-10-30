package model.application;

import java.util.InputMismatchException;

import model.services.SystemMenu;

public class Program {
	public static void main (String[] args) {
		new Program().start();
	}
	public void start() {
		SystemMenu systemMenu = new SystemMenu();
		try {
			systemMenu.menu();
		}
		catch (InputMismatchException e) {
			System.out.println("Erro na entrada de atributos:");
		}
		finally {
			System.out.println("Encerrado!");
		}
	}
}