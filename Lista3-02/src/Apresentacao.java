import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfTitulo;
	private JTextField tfAutor;
	private JTextField tfParecerista;
	private JTextField tfData;
	private Obra obraAtual;

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
		
		JLabel lblTtuloDaObra = new JLabel("T\u00EDtulo da obra:");
		lblTtuloDaObra.setBounds(10, 11, 93, 14);
		frame.getContentPane().add(lblTtuloDaObra);
		
		tfTitulo = new JTextField();
		tfTitulo.setBounds(113, 8, 216, 20);
		frame.getContentPane().add(tfTitulo);
		tfTitulo.setColumns(10);
		
		JLabel lblNomeDoAutor = new JLabel("Nome do autor:");
		lblNomeDoAutor.setBounds(10, 36, 93, 14);
		frame.getContentPane().add(lblNomeDoAutor);
		
		tfAutor = new JTextField();
		tfAutor.setBounds(113, 33, 216, 20);
		frame.getContentPane().add(tfAutor);
		tfAutor.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				obraAtual = new Obra();
				obraAtual.setTitulo(tfTitulo.getText());
				obraAtual.setAutor(tfAutor.getText());
			}
		});
		btnCadastrar.setBounds(335, 32, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JLabel lblNomeDoParecerista = new JLabel("Nome do parecerista:");
		lblNomeDoParecerista.setBounds(10, 95, 141, 14);
		frame.getContentPane().add(lblNomeDoParecerista);
		
		tfParecerista = new JTextField();
		tfParecerista.setBounds(153, 92, 155, 20);
		frame.getContentPane().add(tfParecerista);
		tfParecerista.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(lblData);
		
		tfData = new JTextField();
		tfData.setBounds(97, 120, 86, 20);
		frame.getContentPane().add(tfData);
		tfData.setColumns(10);
		
		JLabel lblContedo = new JLabel("Conte\u00FAdo:");
		lblContedo.setBounds(10, 155, 75, 14);
		frame.getContentPane().add(lblContedo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 151, 234, 99);
		frame.getContentPane().add(scrollPane);
		
		JTextArea taConteudo = new JTextArea();
		scrollPane.setViewportView(taConteudo);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parecer parec = new Parecer(tfParecerista.getText(),
											LocalDate.now(),
											taConteudo.getText());
				obraAtual.addParecer(parec);
			}
		});
		btnInserir.setBounds(335, 155, 89, 23);
		frame.getContentPane().add(btnInserir);
	}
}
