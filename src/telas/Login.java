package telas;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Login{

	private ArrayList<String> usuario = new ArrayList<String>();
	private ArrayList<String> senha = new ArrayList<String>();
	private ArrayList<String> permissao = new ArrayList<String>();



	public Login() throws Exception{
		Scanner leitura = new Scanner(new FileReader("SistemaDeAcesso.txt"));

		while (leitura.hasNext()){
			String[] login = new String[3];
			String aux = leitura.nextLine();
			login = aux.split(";");
			usuario.add(login[0]);
			senha.add(login[1]);
			permissao.add(login[2]);
		}
		leitura.close();
	}

	public String decifraSenha (String entrada) throws Exception{

		CryptoDummy cdummy = new CryptoDummy();
		String textoArquivoCifr = entrada;
		byte[] bMsgDecifrada;

		cdummy.geraDecifra(textoArquivoCifr.getBytes("ISO-8859-1"), new File ("chave.dummy"));			
		bMsgDecifrada = cdummy.getTextoDecifrado(); 			
		String sMsgDecifrada = (new String (bMsgDecifrada, "ISO-8859-1"));
		return sMsgDecifrada;

	}
	public boolean busca(String login, String senha) throws Exception {


		int n = usuario.size();
		int inicio=0, fim=n-1, meio, compara = 0;
		String senhaDecifrada;
		while (inicio<=fim){
			meio=(inicio+fim)/2;
			if (login.equals(usuario.get(meio))){
				senhaDecifrada = decifraSenha(this.senha.get(meio));
				if(senha.equals(senhaDecifrada)){
					return true;
				}
				}else
					compara = usuario.get(meio).compareTo(login);
				if (compara<0) {
					inicio = meio+1;
				} else {
					fim = meio-1;
				
			}
		}
		return false;
	}
}