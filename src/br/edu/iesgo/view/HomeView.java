package br.edu.iesgo.view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class HomeView {

	private JFrame frame;
	private JTextField textFieldNome;
	private JTextField textFieldSobrenome;
	private JLabel labelNomeCompleto;
	private JButton botaoEnviar;

	public HomeView() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(HomeView.class.getResource("/com/sun/javafx/webkit/prism/resources/panIcon.png")));
		frame.setBounds(100, 100, 489, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Brush Script MT", Font.PLAIN, 21));
		labelNome.setBounds(10, 96, 85, 14);
		panel.add(labelNome);
		
		JLabel labelSobrenome = new JLabel("Sobrenome");
		labelSobrenome.setFont(new Font("Brush Script MT", Font.PLAIN, 20));
		labelSobrenome.setBounds(10, 141, 103, 14);
		panel.add(labelSobrenome);
		
		botaoEnviar = new JButton("Enviar");
		botaoEnviar.setBounds(332, 183, 89, 23);
		panel.add(botaoEnviar);
		
		JLabel labelTitulo = new JLabel("Semana Acadêmica IESGO");
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		labelTitulo.setForeground(Color.BLUE);
		labelTitulo.setBounds(115, 25, 293, 33);
		panel.add(labelTitulo);
		
		textFieldNome = new JTextField();
		textFieldNome.setBackground(SystemColor.menu);
		textFieldNome.setBounds(105, 93, 322, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setBackground(SystemColor.menu);
		textFieldSobrenome.setBounds(104, 138, 323, 20);
		panel.add(textFieldSobrenome);
		textFieldSobrenome.setColumns(10);
		
		labelNomeCompleto = new JLabel("Digite seu nome!");
		labelNomeCompleto.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 20));
		labelNomeCompleto.setBounds(0, 258, 473, 23);
		panel.add(labelNomeCompleto);
		
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public void setTextFieldNome(JTextField textFieldNome) {
		textFieldNome = textFieldNome;
	}

	public JTextField getTextFieldSobrenome() {
		return textFieldSobrenome;
	}

	public void setTextFieldSobrenome(JTextField textFieldSobrenome) {
		this.textFieldSobrenome = textFieldSobrenome;
	}

	public JLabel getLabelNomeCompleto() {
		return labelNomeCompleto;
	}

	public void setLabelNomeCompleto(JLabel labelNomeCompleto) {
		this.labelNomeCompleto = labelNomeCompleto;
	}

	public JButton getBotaoEnviar() {
		return botaoEnviar;
	}

	public void setBotaoEnviar(JButton botaoEnviar) {
		this.botaoEnviar = botaoEnviar;
	}
	
	
}
