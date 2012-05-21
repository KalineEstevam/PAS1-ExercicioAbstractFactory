
public class SistAnotacoesBRFactory extends AbstractFactory{
	
	/**
	** Kaline Estevam
	*/
	public AbstractTelefone criarAnotacaoTel(){
		return new TelefoneBR();
	}
	public AbstractEndereco criarAnotacaoEnd(){
		return new EnderecoBR();
	}

}
