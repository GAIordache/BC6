package fin;

public class Student extends Person {

	public Student(String pCNP, String pNume,int pVarsta, Address pAddress) {
		super(pCNP, pNume,pVarsta, pAddress);
	}

	@Override
	public String getNume() {
		return "Student " + super.getNume();
	}
	
	// NU MERGE DIN CAUZA DE FINAL PE METODA
	//@Override
	//public int getVarsta() {
	//	return super.getVarsta()/2;
	//}
	

}
