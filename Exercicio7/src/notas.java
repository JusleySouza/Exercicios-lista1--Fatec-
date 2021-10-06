//Escreva um programa que leia 2 notas de um aluno, ele deverá calcular a média
//ponderada utilizando a seguinte fórmula: Media = (N1*2 + N2*3)/2+3. A partir 
//da média, informar sua situação de acordo com o seguinte critério:
//Se média >= 6 – Aluno aprovado
//Se média < 6 - Aluno reprovado

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class notas extends JFrame {

	private JPanel contentPane;
	private JTextField cmpNota1;
	private JTextField cmpNota2;
	private JTextField cmpMedia;
	private JTextField cmpSituacao;
	
	public double nota1, nota2, media;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notas frame = new notas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public notas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmpNota1 = new JTextField();
		cmpNota1.setBounds(40, 66, 86, 20);
		contentPane.add(cmpNota1);
		cmpNota1.setColumns(10);
		
		cmpNota2 = new JTextField();
		cmpNota2.setBounds(40, 168, 86, 20);
		contentPane.add(cmpNota2);
		cmpNota2.setColumns(10);
		
		cmpMedia = new JTextField();
		cmpMedia.setEditable(false);
		cmpMedia.setBounds(40, 279, 86, 20);
		contentPane.add(cmpMedia);
		cmpMedia.setColumns(10);
		
		cmpSituacao = new JTextField();
		cmpSituacao.setEditable(false);
		cmpSituacao.setBounds(283, 66, 86, 20);
		contentPane.add(cmpSituacao);
		cmpSituacao.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(291, 323, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nota1 = Double.parseDouble(cmpNota1.getText());
				nota2 = Double.parseDouble(cmpNota2.getText());
				media = (nota1 * 2 + nota2 * 3) / (2 + 3);
				
				cmpMedia.setText("" + media);
				
				if (media >=6)
				{
					cmpSituacao.setText("Aprovado!!!");
				}
				else
				{
					cmpSituacao.setText("Reprovado!!!");
				}
			}
		});
		btnCalcular.setBounds(40, 323, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmpMedia.setText("");
				cmpNota1.setText("");
				cmpNota2.setText("");
				cmpSituacao.setText("");
			}
		});
		btnLimpar.setBounds(166, 323, 89, 23);
		contentPane.add(btnLimpar);
		
		JLabel lblNewLabel = new JLabel("Informe a Nota 1: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(40, 28, 117, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informe a Nota 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(40, 126, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00E9dia do Semestre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(40, 242, 138, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Situa\u00E7\u00E3o do Aluno:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(280, 28, 144, 14);
		contentPane.add(lblNewLabel_3);
	}
}
