

public class compteur extends Thread{
	private String nom;
	private int n;
	public static int pos = 0;
	
	public compteur(String nom, int n) {
		this.nom= nom;
		this.n=n;
	}
	public void run() {
		
			for (int i=0; i<=n; i++) {
				try {
				System.out.println(nom +" : "+ i);
				int pause = (int) (Math.random() *5001);
				sleep(pause);
				if(i == n) {
					System.out.println("***" +nom+ "a fini de compter jusqu a "+ n);
				}
				}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}


public static void main(String args[]) {
	compteur c1=new compteur("TOTO",2);
	compteur c2=new compteur("SOSO",5);
	compteur c3=new compteur("MOMO",10);
	c1.start();
	c2.start();
	c3.start();
	System.out.println("##Fin du main");
}
}