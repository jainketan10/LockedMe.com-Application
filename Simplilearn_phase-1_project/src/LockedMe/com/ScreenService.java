package LockedMe.com;
public class ScreenService {
		public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
	    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
	    public static Screen CurrentScreen = WelcomeScreen;
	    //Getter & Setters
	    public static Screen getCurrentScreen() {
	        return CurrentScreen;
	    }
	    public static void setCurrentScreen(Screen currentScreen) {
	        CurrentScreen = currentScreen;
	    }   
	}