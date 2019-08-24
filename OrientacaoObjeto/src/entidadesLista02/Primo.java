package entidadesLista02;

public class Primo {
	private int numero;
	public Primo(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public boolean ehPrimo(){
		
		boolean primo = true;
		 int i,qm=0;
	        for(i=1; i<=numero; i++)
	        {
	           if(numero%i==0)
	           {
	               qm++;
	           }
	        }
	        if(qm==2)
	        {
	            primo = true;
	        } else{
	        	primo = false;
	        }
	        return primo;
	}
}
