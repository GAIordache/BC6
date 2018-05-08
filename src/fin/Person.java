package fin;

//final NO OTHER CLASS MAY EXTEND PERSON
public class Person {
	
	// Immutable state 
	private final String mCNP;
	private final String mNume;
	private final Address mAddress;
	private final int mVarsta;

	public Person(String pCNP, String pNume,int pVarsta, Address pAddress) {
		super();
		mCNP = pCNP;
		mNume = pNume;
		mAddress = pAddress;
		mVarsta = pVarsta;
		// mNume = "xxx" ; NU MERGE
		//mAddress = null;
	}

	public String getCNP() {
		return mCNP;
	}

	public String getNume() {
		return mNume;
	}

	public Address getAddress() {
		return mAddress;
	}

	public final int getVarsta() {
		return mVarsta;
	}
	
	

}
