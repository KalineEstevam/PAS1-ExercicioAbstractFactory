import java.util.*;


public class TelefoneEUA extends AbstractTelefone{
	
	/**
	** Jéssyca Ferreira
	*/
	List <String> telefonesEUA;
	
	public TelefoneEUA(){
		this.telefonesEUA = new ArrayList<String>();
	}
	
	public void gravar(String num){
			telefonesEUA.add(num);
	}

	/**
	** Kaline Estevam
	*/
	public void exibir(String num){
		
		String res = null;
		for(int i = 0; i < telefonesEUA.size(); i++){
			if( telefonesEUA.get(i).equals(num)){
				res = telefonesEUA.get(i);
			}
			
		}
		System.out.println("(1)"+res.substring(0, 4)+"-"+res.substring(4, 8));
	}
}
