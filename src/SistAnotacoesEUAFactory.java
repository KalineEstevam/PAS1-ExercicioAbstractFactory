
public class SistAnotacoesEUAFactory extends AbstractFactory{
	
	/**
	** Kaline Estevam
	*/
	public AbstractTelefone criarAnotacaoTel(){
		return new TelefoneEUA();
	}
	public AbstractEndereco criarAnotacaoEnd(){
		return new EnderecoEUA();
	}

}
