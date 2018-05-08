package eq;

public class DomesticDog extends Dog {
	private Person mPerson;

	public Person getPerson() {
		return mPerson;
	}

	public void setPerson(Person pPerson) {
		mPerson = pPerson;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mPerson == null) ? 0 : mPerson.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof DomesticDog))
			return false;
		DomesticDog other = (DomesticDog) obj;
		if (mPerson == null) {
			if (other.mPerson != null)
				return false;
		} else if (!mPerson.equals(other.mPerson))
			return false;
		return true;
	}


}
