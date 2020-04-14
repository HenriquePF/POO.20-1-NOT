import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frmLista;
	private JTextField tfNome;
	private JTextField tfEstado;
	private JTextField tfCPF;
	private JTextField tfRenda;
	private HashMap<String, Contribuinte> contribuintes = new HashMap();
	private int indice = 0;
	private JLabel lblValorAConsultar;
	private JTextField tfValorConsulta;
	private JButton btnConsultar;
	private JTextField textField;
	private JButton btnDaReceita;
	private JButton btnDaReceita_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frmLista.setVisible(true);
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
		frmLista = new JFrame();
		frmLista.setTitle("Lista 3 - Exerc 1");
		frmLista.setBounds(100, 100, 450, 372);
		frmLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLista.getContentPane().setLayout(null);

		JLabel lblNomeDoContribuinte = new JLabel("Nome do contribuinte:");
		lblNomeDoContribuinte.setBounds(10, 23, 115, 14);
		frmLista.getContentPane().add(lblNomeDoContribuinte);

		tfNome = new JTextField();
		tfNome.setBounds(122, 20, 222, 20);
		frmLista.getContentPane().add(tfNome);
		tfNome.setColumns(10);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 56, 46, 14);
		frmLista.getContentPane().add(lblEstado);

		tfEstado = new JTextField();
		tfEstado.setBounds(53, 53, 58, 20);
		frmLista.getContentPane().add(tfEstado);
		tfEstado.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 84, 46, 14);
		frmLista.getContentPane().add(lblCpf);

		tfCPF = new JTextField();
		tfCPF.setBounds(39, 81, 140, 20);
		frmLista.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);

		JLabel lblRendaAnualR = new JLabel("Renda anual: R$");
		lblRendaAnualR.setBounds(10, 119, 101, 14);
		frmLista.getContentPane().add(lblRendaAnualR);

		tfRenda = new JTextField();
		tfRenda.setBounds(102, 116, 130, 20);
		frmLista.getContentPane().add(tfRenda);
		tfRenda.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contribuinte c;
				if (contribuintes.containsKey(tfCPF.getText())) {
					JOptionPane.showMessageDialog(frmLista, "CPF já em uso. Digite outro.");
					tfCPF.requestFocus(); // para parar o cursor no campo do CPF
				} else {

					c = new Contribuinte(tfNome.getText(), tfEstado.getText(), tfCPF.getText(),
							Float.parseFloat(tfRenda.getText()));
					/*
					 * ou crio o objeto pelo construtor com parâmetros ou crio o objeto pelo
					 * construtor padrão e uso os métodos set c = new Contribuinte();
					 * c.setNome(tfNome.getText()); c.setCpf(tfCPF.getText());
					 * c.setUf(tfEstado.getText());
					 * c.setRendaAnual(Float.parseFloat(tfRenda.getText()));
					 */
					contribuintes.put(c.getCpf(), c);
					float imposto = c.getImpostoAPagar();
					JOptionPane.showMessageDialog(frmLista, "Imposto a pagar:" + imposto);
				}
			}
		});
		btnCadastrar.setBounds(307, 115, 89, 23);
		frmLista.getContentPane().add(btnCadastrar);

		lblValorAConsultar = new JLabel("Valor a consultar:");
		lblValorAConsultar.setBounds(10, 181, 115, 14);
		frmLista.getContentPane().add(lblValorAConsultar);

		tfValorConsulta = new JTextField();
		tfValorConsulta.setBounds(102, 178, 130, 20);
		frmLista.getContentPane().add(tfValorConsulta);
		tfValorConsulta.setColumns(10);

		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float valor = Float.parseFloat(tfValorConsulta.getText());
				String resultado = "Contribuintes imposto acima de R$" + valor;

				// um HashMap não pode ser percorrido sequencialmente.
				// Para isso, é necessário criar uma coleção a partir do HashMap, por meio do
				// método values()
				Collection<Contribuinte> contribTemp = contribuintes.values();
				for (Contribuinte c : contribTemp) {
					if (c.getImpostoAPagar() > valor) {
						resultado += "\n" + c.getNome() + " - " + c.getImpostoAPagar();
					}
				}
				JOptionPane.showMessageDialog(frmLista, resultado);
			}
		});
		btnConsultar.setBounds(242, 177, 89, 23);
		frmLista.getContentPane().add(btnConsultar);

		JLabel lblCpfAPesquisar = new JLabel("CPF a pesquisar:");
		lblCpfAPesquisar.setBounds(10, 222, 101, 14);
		frmLista.getContentPane().add(lblCpfAPesquisar);

		textField = new JTextField();
		textField.setBounds(112, 219, 120, 20);
		frmLista.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnConsultarCpf = new JButton("Consultar CPF");
		btnConsultarCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contribuinte pesquisado = contribuintes.get(textField.getText());

				if (pesquisado == null) {
					JOptionPane.showMessageDialog(frmLista, "CPF não encontrado");
				} else {
					JOptionPane.showMessageDialog(frmLista,
							"Nome: " + pesquisado.getNome() + "\nImposto a pagar:" + pesquisado.getImpostoAPagar());
				}
			}
		});
		btnConsultarCpf.setBounds(252, 218, 108, 23);
		frmLista.getContentPane().add(btnConsultarCpf);

		btnDaReceita = new JButton("% da receita por estado");
		btnDaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float totRS, totPR, totSC, totGeral;
				totRS = totPR = totSC = totGeral = 0;
				Collection<Contribuinte> contribTemp = contribuintes.values();
				for (Contribuinte c : contribTemp) {
					if (c.getUf().equals("SC")) {
						totSC += c.getImpostoAPagar();
					} else {
						if (c.getUf().equals("RS")) {
							totRS += c.getImpostoAPagar();
						} else {
							if (c.getUf().equals("PR")) {
								totPR += c.getImpostoAPagar();
							}
						}
					}
					totGeral += c.getImpostoAPagar();
				}
				String resultado = "Participação % por estado\n";
				resultado += "\nSC = "+totSC+" = "+(totSC/totGeral*100)+"%";
				resultado += "\nPR = "+totPR+" = "+(totPR/totGeral*100)+"%";
				resultado += "\nRS = "+totRS+" = "+(totRS/totGeral*100)+"%";
				resultado += "\nGeral = "+totGeral;
				JOptionPane.showMessageDialog(frmLista,resultado);
			}
		});
		btnDaReceita.setBounds(240, 268, 156, 23);
		frmLista.getContentPane().add(btnDaReceita);
		
		btnDaReceita_1 = new JButton("% da receita - Hash");
		btnDaReceita_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HashMap<String,Float> totais = new HashMap();
				String sigla;
				float total,totGeral=0;
				Collection<Contribuinte> contribTemp = contribuintes.values();
				for (Contribuinte c : contribTemp) {
					sigla = c.getUf();
					if (totais.containsKey(sigla)) {
						total = totais.get(sigla);
					} 
					else {
						total = 0;
					}
					total += c.getImpostoAPagar();
					totais.put(sigla, total);
					totGeral += c.getImpostoAPagar();
				}
				String resultado = "Participação % por estado\n\n";
				Set<String> siglas = totais.keySet();
				for (String s:siglas) {
					total = totais.get(s);
					resultado += s+" = "+total+" = "+(total/totGeral*100)+"%\n";
				}
				resultado += "Geral = "+totGeral;
				JOptionPane.showMessageDialog(frmLista,resultado);
			}
		});
		btnDaReceita_1.setBounds(10, 268, 146, 23);
		frmLista.getContentPane().add(btnDaReceita_1);
	}
}
