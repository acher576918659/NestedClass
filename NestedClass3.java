package tw.aaa.myproject.OOP.NestedClass;

abstract class Dinosaur {
	public abstract void attack();

	public abstract void jump();

	public abstract void search();
}

public class NestedClass3 {

	public static void main(String[] args) {
		// new Dinosaur(){
		// @Override
		// public void attack() {
		// System.out.println("speedup and attack something.");
		// }
		// @Override
		// public void jump() {
		// System.out.println("jumps 5 feet.");
		// }
		// @Override
		// public void search() {
		// System.out.println("search for hunt animal.");
		// }
		// } .attack();
		Dinosaur d1 = new Dinosaur() {
			@Override
			public void attack() {
				System.out.println("speedup and attack something.");
			}

			@Override
			public void jump() {
				System.out.println("jumps 5 feet.");
			}

			@Override
			public void search() {
				System.out.println("search for hunt animal.");
			}
		};
		d1.attack();
		d1.search();
		d1.jump();

	}

}
