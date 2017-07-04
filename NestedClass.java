package tw.aaa.myproject.OOP.NestedClass;

class A{
	class B{
		public void travel(){
			System.out.println("Travel to some places");
		}
	}
	public void nested(){
		B b1=new B();
		b1.travel();
	}
}
class C{
	private static String gamename="xxx";
	static class D{
		public void play(){
			System.out.println("play game:"+gamename);
		}
	}
}

public class NestedClass {

	public static void main(String[] args) {
	A a1=new A();
	a1.nested();
	
	A.B b2= a1.new B();
	b2.travel();
C.D d1=new C.D();
d1.play();
	}

}
