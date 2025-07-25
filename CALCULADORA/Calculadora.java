package Arquivoscalculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField txtEtapas;
	private JTextField txtResultado;
	Double numero1, numero2;
	String TipoOperacao = " nada";
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 458, 417);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText(txtResultado.getText() + "7");
			
			}
		});
		btnSete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSete.setBounds(25, 109, 72, 54);
		frmCalculadora.getContentPane().add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText(txtResultado.getText() + "8");
			
			
			}
		});
		btnOito.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOito.setBounds(107, 109, 72, 54);
		frmCalculadora.getContentPane().add(btnOito);
		
		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText(txtResultado.getText() + "9");
			
			
			}
		});
		btnNove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNove.setBounds(189, 109, 72, 54);
		frmCalculadora.getContentPane().add(btnNove);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				txtResultado.setText("");
				txtEtapas.setText("");
				TipoOperacao = "nada";
			
			
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(271, 109, 72, 54);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText("");
			
			
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCe.setBounds(353, 109, 72, 54);
		frmCalculadora.getContentPane().add(btnCe);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText(txtResultado.getText() + "4");
			
			
			}
		});
		btnQuatro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnQuatro.setBounds(25, 174, 72, 54);
		frmCalculadora.getContentPane().add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText(txtResultado.getText() + "5");
			
			
			}
		});
		btnCinco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCinco.setBounds(107, 174, 72, 54);
		frmCalculadora.getContentPane().add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText(txtResultado.getText() + "6");
			
			
			}
		});
		btnSeis.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSeis.setBounds(189, 174, 72, 54);
		frmCalculadora.getContentPane().add(btnSeis);
		
		JButton btnUm = new JButton("1");
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				txtResultado.setText(txtResultado.getText() + "1");
			
			
			}
		});
		btnUm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUm.setBounds(25, 239, 72, 54);
		frmCalculadora.getContentPane().add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				txtResultado.setText(txtResultado.getText() + "2");
			
			
			}
		});
		btnDois.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDois.setBounds(107, 239, 72, 54);
		frmCalculadora.getContentPane().add(btnDois);
		
		JButton btnTRes = new JButton("3");
		btnTRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtResultado.setText(txtResultado.getText() + "3");
			
			
			}
		});
		btnTRes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTRes.setBounds(189, 239, 72, 54);
		frmCalculadora.getContentPane().add(btnTRes);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			txtResultado.setText(txtResultado.getText() + "0");
			
			
			
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnZero.setBounds(25, 304, 72, 54);
		frmCalculadora.getContentPane().add(btnZero);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtResultado.setText(txtResultado.getText() + ".");
			
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPonto.setBounds(107, 304, 72, 54);
		frmCalculadora.getContentPane().add(btnPonto);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
			
				numero2 = Double.parseDouble(txtResultado.getText());
				
				
				txtResultado.setText("");
				
				
				if(TipoOperacao.equals("Adicao") ) {
					
					
					
					txtResultado.setText(String.valueOf(numero1 + numero2));
					
					
				}else if(TipoOperacao.equals("Subtracao") ) {
						
						
						
						txtResultado.setText(String.valueOf(numero1 - numero2));
						
						
					}else if(TipoOperacao.equals("Divisao") ) {
							
							
							
							txtResultado.setText(String.valueOf(numero1 / numero2));
							
							
						}else if(TipoOperacao.equals("Multiplicacao") ) {
								
								
								
								txtResultado.setText(String.valueOf(numero1 * numero2));
								
								
							}else {
								
								
								JOptionPane.showMessageDialog(null, "Por favor selecione uma operacao");
								
								
								
								
							}
							
						
					
				
			
			}
		});
		btnIgual.setBackground(new Color(255, 255, 0));
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIgual.setBounds(189, 304, 157, 54);
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			if(TipoOperacao.equals("nada")) {

				
				
				txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
				

			  }else {
				  
				  
				  
				  
				  
			  }
			
			txtEtapas.setText(txtEtapas.getText() + "+");
			
		
			numero1 = Double.parseDouble(txtResultado.getText());
			
			
			txtResultado.setText(" ");
			
			
			TipoOperacao = "Adicao";
			
			
			}
			
		}
			
				);
		
		
		
		btnAdicao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdicao.setBounds(271, 174, 72, 119);
		frmCalculadora.getContentPane().add(btnAdicao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(TipoOperacao.equals("nada")) {

					
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					

				  }else {
					  
	
					  
				  }
				
				txtEtapas.setText(txtEtapas.getText() + "-");
				
				numero1 = Double.parseDouble(txtResultado.getText());
				
				
				txtResultado.setText(" ");
				
				TipoOperacao = "Subtracao";
				
			
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubtracao.setBounds(353, 174, 72, 54);
		frmCalculadora.getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			
	if(TipoOperacao.equals("nada")) {

					
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					

				  }else {
					  
	
					  
				  }
				
				txtEtapas.setText(txtEtapas.getText() + "x");
				
				numero1 = Double.parseDouble(txtResultado.getText());
				
				
				txtResultado.setText("");
				
				TipoOperacao = "Multiplicacao";
				
			
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMultiplicacao.setBounds(353, 239, 72, 54);
		frmCalculadora.getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			
                   if(TipoOperacao.equals("nada")) {

					
					
					txtEtapas.setText(txtEtapas.getText() + txtResultado.getText());
					

				  }else {
					  
	
					  
				  }
				
				txtEtapas.setText(txtEtapas.getText() + "/");
				
				numero1 = Double.parseDouble(txtResultado.getText());
				
				
				txtResultado.setText("");
				
				TipoOperacao = "Divisao";
			
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivisao.setBounds(353, 304, 72, 54);
		frmCalculadora.getContentPane().add(btnDivisao);
		
		txtEtapas = new JTextField();
		txtEtapas.setEditable(false);
		txtEtapas.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtEtapas.setBounds(25, 11, 400, 38);
		frmCalculadora.getContentPane().add(txtEtapas);
		txtEtapas.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtResultado.setColumns(10);
		txtResultado.setBounds(25, 60, 400, 38);
		frmCalculadora.getContentPane().add(txtResultado);
	}
}
