package Exception_handlaing;

public class throws_ {

	public static void main(String[] args) {
		POP p=new POP();
		try {
			p.add(10, 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}
class POP{
	public void add(int i,int j) throws deomEX, Exception{
		if (i<100 || i<150) {
			throw new Exception("smaller then 100 or 150");
			
		}else if (i>10||i>20) {
			throw new deomEX("gretter then 10 or 20");
			
		}
	}
}

class deomEX extends Exception{
	public deomEX(String s) {
		super(s);
	}
}
