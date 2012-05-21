import java.util.ArrayList;
import java.util.List;

	/**
	** Kaline Estevam
	*/
public class EnderecoEUA extends AbstractEndereco {
	
	private List <String> cidades;
	private List <String> zipCodes;
	private List <String> ruas;

	public EnderecoEUA(){
		
		this.ruas = new ArrayList<String>();
		this.zipCodes = new ArrayList<String>();
		this.cidades = new ArrayList<String>();
	}
	
	
	public void gravarRua(String rua){
		ruas.add(rua);
	}
	
	public void gravarCidade(String cidade){
		cidades.add(cidade);
	}
	
	public void gravarCepZipCode(String zipCode){
		zipCodes.add(zipCode);
	}
	
	public void exibirCepZipCode(String numero){
		String res = null;
		for(int n = 0; n < zipCodes.size(); n++){
			if(zipCodes.get(n)== numero){
				res = zipCodes.get(n);
			}
		}
		System.out.println(res.substring(0, 5)+"-"+res.substring(5));
	
	}
	

	public void checarCEPZipCode(String num){
	
		if(num.length() != 10){
			System.out.println("invalido");
			return;
		}
		if(!(num.contains("-"))){
			System.out.println("invalido");
			return;
		}
		String parte1 = num.substring(0, 5);
		String digito = num.substring(5, 6);
		String parte2 = num.substring(6, 10);
		
		if((parte1.isEmpty() == false) && (digito.isEmpty() == false) && (parte2.isEmpty() == false) ){
			System.out.println("valido");
		}
		
	}
	
	
	
}
