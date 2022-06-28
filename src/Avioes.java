
public class Avioes {

	
	
	
	public static void main(String[] args) {
		
		
		
		Aeronave vrum = new Aeronave(422, 0, 900, 15.5);
		
		
		Aeronave cachorro = new Aeronave(452, 890.7, 500, 5.0);
		
		
		Aeronave furn = new Aeronave(499, 950.7, 300, 18.5);
		
		
		
		
		
		
		
		if (vrum.maisTempoAr() > cachorro.maisTempoAr() && vrum.maisTempoAr()> furn.maisTempoAr()) {
			System.out.println("vrum fica mais tempo no ar "   + vrum.maisTempoAr());
		}
		
		
		else if (cachorro.maisTempoAr() > vrum.maisTempoAr() && cachorro.maisTempoAr()> furn.maisTempoAr()) {
			System.out.println("cachorro fica mais tempo no ar " + cachorro.maisTempoAr());
		}
		
		else {
			System.out.println("furn fica mais tempo no ar " + furn.maisTempoAr());
		}
		
	}
}
