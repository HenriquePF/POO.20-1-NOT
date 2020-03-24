import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfEstado;
	private JTextField tfCPF;
	private JTextField tfRenda;
	private Contribuinte[] vetor = new Contribuinte[20];
	private int indice = 0;
	private JLabel lblValorAConsultar;
	private JTextField tfValorConsulta;
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeDoContribuinte = new JLabel("Nome do contribuinte:");
		lblNomeDoContribuinte.setBounds(10, 23, 115, 14);
		frame.getContentPane().add(lblNomeDoContribuinte);
		
		tfNome = new JTextField();
		tfNome.setBounds(122, 20, 222, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 56, 46, 14);
		frame.getContentPane().add(lblEstado);
		
		tfEstado = new JTextField();
		tfEstado.setBounds(53, 53, 58, 20);
		frame.getContentPane().add(tfEstado);
		tfEstado.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 84, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(39, 81, 140, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblRendaAnualR = new JLabel("Renda anual: R$");
		lblRendaAnualR.setBounds(10, 119, 101, 14);
		frame.getContentPane().add(lblRendaAnualR);
		
		tfRenda = new JTextField();
		tfRenda.setBounds(102, 116, 130, 20);
		frame.getContentPane().add(tfRenda);
		tfRenda.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contribuinte c;
				c = new Contribuinte(tfNome.getText(),
												tfEstado.getText(),
												tfCPF.getText(),
							Float.parseFloat(tfRenda.getText()));
				/*
				 * ou crio o objeto pelo construtor com parâmetros
				 * ou crio o objeto pelo construtor padrão e uso os métodos set
				c = new Contribuinte();
				c.setNome(tfNome.getText());
				c.setCpf(tfCPF.getText());
				c.setUf(tfEstado.getText());
				c.setRendaAnual(Float.parseFloat(tfRenda.getText()));
				*/
				vetor[indice] = c;
				indice++;
				float imposto = c.getImpostoAPagar();
				JOptionPane.showMessageDialog(frame, 
									"Imposto a pagar:"+imposto);
			}
		});
		btnCadastrar.setBounds(307, 115, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		lblValorAConsultar = new JLabel("Valor a consultar:");
		lblValorAConsultar.setBounds(10, 181, 115, 14);
		frame.getContentPane().add(lblValorAConsultar);
		
		tfValorConsulta = new JTextField();
		tfValorConsulta.setBounds(102, 178, 130, 20);
		frame.getContentPane().add(tfValorConsulta);
		tfValorConsulta.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float valor = Float.parseFloat(tfValorConsulta.getText());
				String resultado = "Contribuintes imposto acima de R$"+valor;
				for (int i=0; i < indice; i++) {
					if (vetor[i].getImpostoAPagar()>valor) {
						resultado += "\n"+vetor[i].getNome()+" - "+vetor[i].getImpostoAPagar();
					}
				}
				JOptionPane.showMessageDialog(frame, resultado);
			}
		});
		btnConsultar.setBounds(242, 177, 89, 23);
		frame.getContentPane().add(btnConsultar);
	}
}
