package GUISwing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI_Main {

	private JFrame frmPedido;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Main window = new GUI_Main();
					window.frmPedido.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPedido = new JFrame();
		frmPedido.setTitle("Cadastro de Cliente");
		frmPedido.getContentPane().setLayout(null);
		frmPedido.setSize(430,455);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(36, 238, 367, -214);
		frmPedido.getContentPane().add(desktopPane);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(255, 255, 0));
		desktopPane_1.setBounds(10, 75, 414, -51);
		frmPedido.getContentPane().add(desktopPane_1);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(24, 85, 69, 17);
		frmPedido.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(152, 85, 181, 20);
		frmPedido.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setName(null);
		
		JLabel lblCpf = new JLabel("RG:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(24, 120, 61, 17);
		frmPedido.getContentPane().add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 120, 181, 20);
		frmPedido.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastro de Cliente");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(68, 23, 213, 32);
		frmPedido.getContentPane().add(lblNewLabel_2);
		
		JLabel lblCpf_1 = new JLabel("CPF:");
		lblCpf_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf_1.setBounds(24, 155, 61, 17);
		frmPedido.getContentPane().add(lblCpf_1);
		
		JLabel lblCpf_1_1 = new JLabel("Telefone:");
		lblCpf_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf_1_1.setBounds(24, 188, 84, 17);
		frmPedido.getContentPane().add(lblCpf_1_1);
		
		JLabel lblCpf_1_1_1 = new JLabel("CEP:");
		lblCpf_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf_1_1_1.setBounds(24, 244, 84, 17);
		frmPedido.getContentPane().add(lblCpf_1_1_1);
		
		JLabel lblCpf_1_1_1_1 = new JLabel("Cidade:");
		lblCpf_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf_1_1_1_1.setBounds(24, 216, 84, 17);
		frmPedido.getContentPane().add(lblCpf_1_1_1_1);
		
		JLabel lblCpf_1_1_1_2 = new JLabel("Complemento:");
		lblCpf_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf_1_1_1_2.setBounds(24, 274, 105, 17);
		frmPedido.getContentPane().add(lblCpf_1_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 274, 181, 20);
		frmPedido.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 244, 181, 20);
		frmPedido.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(152, 216, 181, 20);
		frmPedido.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(152, 188, 181, 20);
		frmPedido.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(152, 155, 181, 20);
		frmPedido.getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(111, 313, 105, 23);
		frmPedido.getContentPane().add(btnNewButton);
	}
}
