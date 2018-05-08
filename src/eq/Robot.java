package eq;

public class Robot {
	private String mId;
	private String mAlias;

	public Robot(String pId, String pAlias) {
		super();
		mId = pId;
		mAlias = pAlias;
	}

	public String getId() {
		return mId;
	}

	public void setId(String pId) {
		mId = pId;
	}

	public String getAlias() {
		return mAlias;
	}

	public void setAlias(String pAlias) {
		mAlias = pAlias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mId == null) ? 0 : mId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		if (mId == null) {
			if (other.mId != null)
				return false;
		} else if (!mId.equals(other.mId))
			return false;
		return true;
	}
	
	// TODO Override equals
	

}
