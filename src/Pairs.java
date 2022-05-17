
public class Pairs extends Threads {
	private boolean paire;
	
	public Paire(boolean paire) {
		this.paire=paire;
		
	}
	public void run() {
		for(int i=0; i<=100;i++) {
			try {
				if(paire==true) {
					if(i%2==0) System.out.println(i);}
				if(paire==false) {
					if(i%2!=0) System.out.println(i);}
				sleep((int)(Math.random()*201));
				}
			catch (InterruptedException e) {
				e.printStackTrace()
			}
		}
		System.out.println("Tous les nombres de 0 a 100 affiches");
	}
}
