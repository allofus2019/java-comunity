package workshop3;

import java.util.function.Supplier;

class TvScreen implements Screen{

	@Override
	public void showScreen() {
		System.out.println("Tv screen");
	}
}

class PhoneScreen{
	public static void showMyScreen(){
		System.out.println("My screen is phony");
	}
}

interface Suma{
	public int suma();
}

public class Lambda {

	public static void main(String[] args) {
		Screen tvScreen = new TvScreen();
		tvScreen.showScreen();

		Screen screen = new Screen() {

			@Override
			public void showScreen() {
				System.out.println("Screen");
			}
		};
		screen.showScreen();

		Screen tv = PhoneScreen::showMyScreen;
		tv.showScreen();

		Screen anotherScreen = () -> System.out.println("Showing another screen");
		anotherScreen.showScreen();

		Supplier<Integer> suma = (() -> {return 10 + 20;});
		System.out.println(suma.get());
	}
}
