import java.util.*;


public class TelefoneBR extends AbstractTelefone{

	/**
	** Jéssyca Ferreira
	*/
	List <String> telefonesBR;
	
	public TelefoneBR(){
		this.telefonesBR = new ArrayList<String>();
	}
	
	public void gravar(String num){
			telefonesBR.add(num);
	}

	/**
	** Kaline Estevam
	*/
	public void exibir(String num){
		
		String res = null;
		for(int i = 0; i < telefonesBR.size(); i++){
			if( telefonesBR.get(i).equals(num)){
				res = telefonesBR.get(i);
			}
			
		}
		System.out.println("(55)"+res.substring(0, 4)+"-"+res.substring(4, 8));
	}
	
}
