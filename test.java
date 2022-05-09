public class Test {
	private String field;
	private int number;

	public Test(String field, int number){
		this.field = field;
		this.number = number;
	}

	public int testMethod(int x){
		System.out.println("テスト用のメソッドです");
		return x;
	}
}
