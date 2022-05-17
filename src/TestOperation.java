class Compte {
	private int solde=500;
	
	public int getSolde() {
		return solde;
	}
	public void retirer(int montant) {
		solde=solde-montant;
	}
}
class Operation implements Runnable{
	private Compte compte = new Compte();
	
	public void run() {
		for(int x=0; x<3; x++) {
			effectuerRetrait(100);
			if(compte.getSolde()<0) {
				System.out.println("decouvert! solde:"+compte.getSolde());
			}
		}
	}
	private void effectuerRetrait(int montant) {
		String nom = Thread.currentThread().getName();
		if(compte.getSolde()>=montant) {
			System.out.println("Solde suffisant"+nom+ "va retirer");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
			}
			compte.retirer(montant);
			System.out.println(nom +"retrait fait!"+" nouveau solde:"+compte.getSolde());
		}
		else {System.out.println(nom+":Solde insufissant");
	}
}}
public class TestOperation {
		public static void main(String[] args) {
			Operation tache = new Operation();
			Thread t1 = new Thread(tache,"Moha");
			Thread t2 = new Thread(tache,"fatima");
			t1.start();
			t2.start();
	}}