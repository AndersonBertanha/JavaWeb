package Modelo;

public class respostaModelo {
	private String Mensagem;
	
	public respostaModelo() {}
	
	public respostaModelo(String mensagem) {
		this.Mensagem = mensagem;
		
		
		
	}

	public String getMensagem() {
		return Mensagem;
	}

	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}

}
