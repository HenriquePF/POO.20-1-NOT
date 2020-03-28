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
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Apresentacao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private InteiroPositivo anterior;

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
		setTitle("Lista 2 - Exerc\u00EDcio 2");
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
				textArea.setText("Resultados para o valor " + ip.getValor() + "\n");
				textArea.append("\nFatorial = " + ip.fatorial());
				if (anterior != null) {
					textArea.append("\nMultiplicado por " + anterior.getValor() + " = " + ip.multiplica(anterior));
				}
				textArea.append("\n" + ip.divisoresInteiros());
				int[] vetor = ip.fibonacci();
				String s = "[";
				for (int i=0; i < vetor.length; i++) {
					s = s+vetor[i]+", ";
				}
				s = s + "]";
				textArea.append("\nFibonacci S= " + s);
				textArea.append("\nFibonacci A= " + Arrays.toString(vetor));
				textArea.append("\nValor I= " + ip.getValorI());
				textArea.append("\nValor I= " + ip.getValorP());
				anterior = ip;
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
