
public class Main {

	/**
	** Kaline Estevam
	*/
	public static void main(String[] args) {
	
	
		AbstractFactory fabrica = new SistAnotacoesBRFactory();
		AbstractFactory fabrica2 = new SistAnotacoesEUAFactory();
		
		AbstractTelefone tel = fabrica.criarAnotacaoTel();
		AbstractEndereco end = fabrica.criarAnotacaoEnd();
		
		
		/**
		** Jéssyca Ferreira
		*/
		tel.gravar("88221425");
		tel.gravar("88221420");
		tel.gravar("88221421");
		
		tel.exibir("88221425");
		
		end.gravarRua("Silvino Nobrega");
		end.gravarRua("Tenente José de França");
		
		end.gravarCidade("João Pessoa");
		end.gravarCidade("Rio Tinto");
		
		end.gravarCepZipCode("582070000");
		end.checarCEPZipCode("582070000");
		end.exibirCepZipCode("582070000");
		
		AbstractTelefone tel2 = fabrica2.criarAnotacaoTel();
		AbstractEndereco end2 = fabrica2.criarAnotacaoEnd();
		
		tel2.gravar("99300553");
		tel2.gravar("99300554");
		
		tel2.exibir("99300553");
		
		end2.gravarCepZipCode("123456789");
		end2.checarCEPZipCode("12345-6789");
		end2.exibirCepZipCode("123456789");
	
	}

}
