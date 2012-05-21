import java.util.*;

	/**
	** Kaline Estevam
	*/
public class EnderecoBR extends AbstractEndereco{
	
	private List <String> cidades;
	private List <String> ceps;
	private List <String> ruas;

	public EnderecoBR(){
		
		this.ruas = new ArrayList<String>();
		this.ceps = new ArrayList<String>();
		this.cidades = new ArrayList<String>();
	}
	
	
	public void gravarRua(String rua){
		ruas.add(rua);
	}
	
	public void gravarCidade(String cidade){
		cidades.add(cidade);
	}
	
	public void gravarCepZipCode(String cep){
		ceps.add(cep);
	}
	
	public void exibirCepZipCode(String numero){
		
		String res = null;
		for(int n = 0; n< ceps.size(); n++){
			if(ceps.get(n)== numero){
				res = ceps.get(n);
			}
		}
		System.out.println(res.substring(0, 5)+"-"+res.substring(6));
		
	}
	
	public void checarCEPZipCode(String num){
	
		if(num.length() != 9){
			System.out.println("invalido");
			return;
		}
		if(!(num.contains("-"))){
			System.out.println("invalido");
			return;
		}
		String parte1 = num.substring(0, 5);
		String digito = num.substring(5, 6);
		String parte2 = num.substring(6, 9);
		
		if((parte1.isEmpty() == false) && (digito.isEmpty() == false) && (parte2.isEmpty() == false) ){
			System.out.println("valido");
		}
		
	}

}
