package ctors;

public class InitBlockClass {
	private int mIntField = 22;
	private String mId = "Pufi";
	private boolean[] mFlags;
	
	// anonymous block
	{
		mIntField = 66;
	}
	{
		mFlags = new boolean[10];
		for(int i=0;i < mFlags.length;i++) {
			mFlags[i] = true;
		}

	}
	
	
	
	public InitBlockClass() {
		// super();
		// mIntField = 33;
		// mIntField = 66;
		// mId = "Pufi"
	}
}
