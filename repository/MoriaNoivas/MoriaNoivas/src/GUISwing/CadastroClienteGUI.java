package GUISwing;

import javax.swing.*;
import java.awt.*;

public class CadastroClienteGUI extends JFrame{
	

	JPanel painel;
	
	public void cadastroClienteGUI() {
	}
	
	public void Cadastro() {
		this.setSize(500,300);
		this.setTitle("Cadastro Cliente");
		
		setLayout(new GridLayout(2,1)); //Container comum
		
		JPanel painel = new JPanel();
		
		
		JLabel texto1 = new JLabel("Nome");
		JLabel texto2 = new JLabel("CPF");
		
		JTextArea input1 = new JTextArea(1,25);
		JTextArea input2 = new JTextArea(1,25);
		
		JButton botao = new JButton();	
		JButton botao2 = new JButton();		
		
	//	painel.setLayout(new GridLayout(2,2));
		
		painel.add(texto1);
		painel.add(input1);
		painel.add(botao);
		
		//painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
		painel.add(texto2);
		painel.add(input2);
		painel.add(botao2);
		
		this.add(painel);	
		
		this.setVisible(true);
		}

}
