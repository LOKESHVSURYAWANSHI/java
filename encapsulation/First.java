package encapsulation;

public class First {

	public static void main(String[] args) {
//		Student abhay=new Student();
//		abhay.setnumber("1234567890");
//		System.out.println(abhay.getnumber());
		UIDAI addhar=new UIDAI();
		addhar.setaddhar_no("1"
				+ ""
				+ "01010101010");
		System.out.println(addhar.getaddhar_no());

	}

}
//class Student{
//	private String number ;
//	
//
//	public String getnumber() {
//		return this.number;
//	}
//
//	public void setnumber(String number) {
//		if(number.length()==10) {
//			this.number = number;
//			
//		}else {
//			this.number="invalid Number";
//		}
//		
//	}
//	
//}
class UIDAI{
	private String addhar_no;
	
	public void setaddhar_no(String addhar_no) {
		if(addhar_no.length()==12 && addhar_no.startsWith("10") ) {
			this.addhar_no=addhar_no;
			
		}else {
			this.addhar_no="invalid";
			
		}
		
	}
	public String getaddhar_no(){
		return this.addhar_no;
		
	}
	
}
