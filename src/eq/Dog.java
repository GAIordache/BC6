package eq;

public class Dog {
	private String mBreed;
	private int mDOBYear;
	private int mDOBMonth;
	private int mDOBDay;
	private String mColor;
	private double mWeight;

	public String getBreed() {
		return mBreed;
	}

	public void setBreed(String pBreed) {
		mBreed = pBreed;
	}

	public int getDOBYear() {
		return mDOBYear;
	}

	public void setDOBYear(int pDOBYear) {
		mDOBYear = pDOBYear;
	}

	public int getDOBMonth() {
		return mDOBMonth;
	}

	public void setDOBMonth(int pDOBMonth) {
		mDOBMonth = pDOBMonth;
	}

	public int getDOBDay() {
		return mDOBDay;
	}

	public void setDOBDay(int pDOBDay) {
		mDOBDay = pDOBDay;
	}

	public String getColor() {
		return mColor;
	}

	public void setColor(String pColor) {
		mColor = pColor;
	}

	public double getWeight() {
		return mWeight;
	}

	public void setWeight(double pWeight) {
		mWeight = pWeight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mBreed == null) ? 0 : mBreed.hashCode());
		result = prime * result + ((mColor == null) ? 0 : mColor.hashCode());
		result = prime * result + mDOBDay;
		result = prime * result + mDOBMonth;
		result = prime * result + mDOBYear;
		long temp;
		temp = Double.doubleToLongBits(mWeight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Dog))
			return false;
		Dog other = (Dog) obj;
		if (mBreed == null) {
			if (other.mBreed != null)
				return false;
		} else if (!mBreed.equals(other.mBreed))
			return false;
		if (mColor == null) {
			if (other.mColor != null)
				return false;
		} else if (!mColor.equals(other.mColor))
			return false;
		if (mDOBDay != other.mDOBDay)
			return false;
		if (mDOBMonth != other.mDOBMonth)
			return false;
		if (mDOBYear != other.mDOBYear)
			return false;
		if (Double.doubleToLongBits(mWeight) != Double.doubleToLongBits(other.mWeight))
			return false;
		return true;
	}

	// INCERCATI SA SCRIETI MANUAL METODA equals - override
	
	
}
