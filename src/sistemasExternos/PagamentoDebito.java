package sistemasExternos;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class PagamentoDebito{
	boolean validado;
	private ArrayList<String> cpf = new ArrayList<String>();
	private ArrayList<String> titular = new ArrayList<String>();
	private ArrayList<String> banco = new ArrayList<String>();
	private ArrayList<String> agencia = new ArrayList<String>();
	private ArrayList<String> contacorrente = new ArrayList<String>();



	public PagamentoDebito() throws Exception{
		Scanner leitura = new Scanner(new FileReader("debito.txt"));

		while (leitura.hasNext()){
			String[]pag = new String[5];
			String aux = leitura.nextLine();
			pag = aux.split(";");
			cpf.add(pag[0]);
			titular.add(pag[1]);
			banco.add(pag[2]);
			agencia.add(pag[3]);
			contacorrente.add(pag[4]);
			
		}
		leitura.close();
	}

	
	public boolean busca(String c, String t, String b, String a, String cc) throws Exception {
		System.out.println(c);
				System.out.println(t);
						System.out.println(b);
								System.out.println(cc);

		int n = titular.size();
		int inicio=0, fim=n-1, meio, compara = 0;
		
		while (inicio<=fim){
			meio=(inicio+fim)/2;
			if (t.equals(titular.get(meio))){

				if (c.equals(cpf.get(meio)) && b.equals(banco.get(meio)) && a.equals(agencia.get(meio)) &&  cc.equals(contacorrente.get(meio))){
					JOptionPane.showMessageDialog(null, "Validado");
					validado = true;
					return validado;
				}
				

				
				}else
					compara = titular.get(meio).compareTo(t);
				if (compara<0) {
					inicio = meio+1;
				} else {
					fim = meio-1;
				
			}
		}
		JOptionPane.showMessageDialog(null,"Invalidado");
		validado = false;
		return validado; 
	}
}


