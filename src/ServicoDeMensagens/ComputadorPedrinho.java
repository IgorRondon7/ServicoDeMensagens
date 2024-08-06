package ServicoDeMensagens.src.ServicoDeMensagens;

import ServicoDeMensagens.apps.FacebookMessenger;
import ServicoDeMensagens.apps.MsnMessenger;
import ServicoDeMensagens.apps.ServicoMensagemInstantanea;
import ServicoDeMensagens.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MsnMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
