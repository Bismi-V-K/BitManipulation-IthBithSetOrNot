
public class IthBitSetOrNot {

	public static void main(String[] args) {
		System.out.println(meth(101100,5));
	}
	public static boolean meth(int n,int i) {
		int mask=(1<<i);
		if((mask&n)!=0) {
			return true;
		}else {
			return false;
		}
	}
}
