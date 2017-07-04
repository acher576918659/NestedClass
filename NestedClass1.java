package tw.aaa.myproject.OOP.NestedClass;

class E{
	private String name="john";
	public void execNested(){
	int age=18;
	class F{
		public void buy(int money){
			System.out.println("i bought a doll cost " + money + "\n name:" + name + " age:" + age);
		}
	}F f1=new F();
	f1.buy(500);
}
}
public class NestedClass1 {

	public static void main(String[] args) {
		E e1=new E();
		e1.execNested();

	}

}
