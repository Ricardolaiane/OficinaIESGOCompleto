package br.edu.iesgo.control;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Timer;
import br.edu.iesgo.model.Pessoa;
import br.edu.iesgo.view.HomeView;

public class HomeControl {

	Pessoa pessoa;
	HomeView view;
	private Timer timer ;

	public HomeControl(Pessoa pessoa, HomeView view){
		this.pessoa = pessoa;
		this.view = view;
		eventos();
	}


	void eventos() {
		view.getBotaoEnviar().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				pessoa.setNome(view.getTextFieldNome().getText());
				pessoa.setSobrenome(view.getTextFieldSobrenome().getText());

				String nomeCompleto = "Parabéns" + pessoa.getNome()+" "+ pessoa.getSobrenome() + " " + "Você criou seu primeiro"
						+ " app Executável Java";
				fadeInFadeOutEffect(nomeCompleto);

				try {
					view.getLabelNomeCompleto().setText(nomeCompleto);

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}


		});
	}



	public void fadeInFadeOutEffect(String text) {
		timer = new Timer(50, new ActionListener() {
			private float alpha = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (alpha < 1) { 
					alpha += 0.05f; 
					view.getLabelNomeCompleto().setForeground(new Color(0, 0, 0, alpha)); 
				} else { 
					view.getLabelNomeCompleto().setText(text); 
					Timer fadeInTimer = new Timer(100, new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if (alpha > 0) { 
								alpha -= 0.05f; 
								view.getLabelNomeCompleto().setForeground(new Color(0, 0, 0, alpha)); 
							} else { 
								((Timer) e.getSource()).stop(); 
							}
						}
					});
					fadeInTimer.start(); 

					view.getLabelNomeCompleto().setFont(new Font("Lucida Calligraphy", Font.PLAIN, 10));

				}
			}
		});
		timer.start(); 
	}




}
