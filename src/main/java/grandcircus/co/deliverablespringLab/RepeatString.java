package grandcircus.co.deliverablespringLab;

public class RepeatString {
     
	String str;
	int count;
	
	public RepeatString(String str,int count) {
		super();
		this.count = count;
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "RepeatString [str=" + str + ", count=" + count + "]";
	}

	
	
   
}
