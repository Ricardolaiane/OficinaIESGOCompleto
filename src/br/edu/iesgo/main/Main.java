package br.edu.iesgo.main;

import javax.swing.SwingUtilities;

import br.edu.iesgo.control.HomeControl;
import br.edu.iesgo.model.Pessoa;
import br.edu.iesgo.view.HomeView;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HomeView view = new HomeView();
				Pessoa pessoa = new Pessoa();
				HomeControl controle = new HomeControl(pessoa, view);

			}
		});
	}
}
