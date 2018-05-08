package eq;

public class Person {
	private String mCNP;
	private String mNume;
	private int mAge;

	public Person(String pCNP, String pNume, int pAge) {
		super();
		mCNP = pCNP;
		mNume = pNume;
		mAge = pAge;
	}

	public String getCNP() {
		return mCNP;
	}

	public void setCNP(String pCNP) {
		mCNP = pCNP;
	}

	public String getNume() {
		return mNume;
	}

	public void setNume(String pNume) {
		mNume = pNume;
	}

	public int getAge() {
		return mAge;
	}

	public void setAge(int pAge) {
		mAge = pAge;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// java.lang.Class
		if (this.getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (this.mCNP == null) {
			if (other.mCNP != null)
				return false;
		} else if (!mCNP.equals(other.mCNP))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person  is mCNP=" + mCNP + ", mNume=" + mNume + ", mAge=" + mAge + "";
	}
	
	

}
