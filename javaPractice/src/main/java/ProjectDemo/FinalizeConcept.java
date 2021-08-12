package ProjectDemo;
public class FinalizeConcept {
	
public void finalize()
{
	System.out.println("finalize Mehod");	
}
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		f1 =null;
		
		System.gc();
	}

}
//finalize() method is used just before object is destroyed and can be called just prior to object creation.