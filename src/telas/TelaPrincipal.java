package telas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame  {

	private Container contentPane;
	private JMenu cliente;
	private JMenuBar menuBar;
	private JPanel panel;
	private JMenuItem mntmCadastrar;

	private JMenu mnEmprestimo;
	private JMenuItem mntmGerenciarEmprestimo;
	private JMenuItem mntmDevolver;
	private JMenu mnVeiculo;
	private JMenuItem mntmRelatorio;
	private JMenuItem mntmGerenciarVeiculo;
	private JMenu mnRelatorio;
	private JMenuItem mntmGerarRelatrioDirio;
	private JMenuItem mntmGerarRelatrioGeral;
	private ResourceBundle bn;

	public TelaPrincipal(final ResourceBundle bn) {
		
		this.bn = bn;
		setBounds(30, 30, 1300, 700);
		contentPane = getContentPane();
      		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		cliente = new JMenu(bn.getString("TelaPrincipal.cliente.text")); 
		cliente.setMnemonic('C');
		menuBar.add(cliente);
		
		mntmCadastrar = new JMenuItem(bn.getString("TelaPrincipal.mntmCadastrar.text")); 
		cliente.add(mntmCadastrar);
		mntmCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TelaManterCliente tela = new TelaManterCliente(bn);
				tela.setVisible(true);
			}




		});
		
		

		mnEmprestimo = new JMenu(bn.getString("TelaPrincipal.mnEmprestimo.text")); 
		menuBar.add(mnEmprestimo);

		
		
		mntmGerenciarEmprestimo = new JMenuItem(bn.getString("TelaPrincipal.mntmGerenciar_1.text")); 
		mnEmprestimo.add(mntmGerenciarEmprestimo);
		mntmGerenciarEmprestimo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TelaConsultarModelo tela;
				try {
					tela = new TelaConsultarModelo(bn);
					tela.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}




		});
		
		mntmDevolver = new JMenuItem(bn.getString("TelaPrincipal.mntmDevolver.text")); 
		mnEmprestimo.add(mntmDevolver);
		mntmDevolver.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TelaDevolverAutomovel tela = new TelaDevolverAutomovel(bn);
				tela.setVisible(true);
			}




		});
		
		
		mnVeiculo = new JMenu(bn.getString("TelaPrincipal.mnVeiculo.text")); 
		menuBar.add(mnVeiculo);
		
		mntmGerenciarVeiculo = new JMenuItem(bn.getString("TelaPrincipal.mntmGerenciar_2.text")); 
		mnVeiculo.add(mntmGerenciarVeiculo);
		mntmGerenciarVeiculo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TelaManterAutomovel tela = null;
				
					try {
						tela = new TelaManterAutomovel(bn);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
				tela.setVisible(true);
			}




		});
		
		
		mntmRelatorio = new JMenuItem("Modelo"); 
		mnVeiculo.add(mntmRelatorio);
		mntmRelatorio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				TelaManterModelo tela = null;
				
				tela = new TelaManterModelo(bn);
			
			
			tela.setVisible(true);

			}




		});
		
		mnRelatorio = new JMenu(bn.getString("TelaPrincipal.mnRelatorio.text")); 
		menuBar.add(mnRelatorio);
		
		mntmGerarRelatrioDirio = new JMenuItem(bn.getString("TelaPrincipal.mntmGerarRelatrioDirio.text")); 
		mnRelatorio.add(mntmGerarRelatrioDirio);
		mntmGerarRelatrioDirio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}




		});
		
		mntmGerarRelatrioGeral = new JMenuItem(bn.getString("TelaPrincipal.mntmGerarRelatrioGeral.text")); 
		mnRelatorio.add(mntmGerarRelatrioGeral);
		mntmGerarRelatrioGeral.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

			}




		});
		
		setVisible(true);
		
	}
}
