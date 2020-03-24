import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao frame = new Apresentacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Apresentacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteOValor = new JLabel("Digite o valor desejado:");
		lblDigiteOValor.setBounds(10, 22, 139, 14);
		contentPane.add(lblDigiteOValor);
		
		textField = new JTextField();
		textField.setBounds(156, 19, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valor = Integer.parseInt(textField.getText());
				InteiroPositivo ip = new InteiroPositivo();
				ip.setValor(valor);
				textArea.setText("Resultados para o valor "+ip.getValor()+"\n");
				textArea.append("Fatorial = "+ip.fatorial());
				
			}
		});
		btnOk.setBounds(286, 18, 89, 23);
		contentPane.add(btnOk);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 74, 400, 176);
		contentPane.add(scrollPane);
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
