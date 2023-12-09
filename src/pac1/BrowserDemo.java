package pac1;

public class BrowserDemo {
	public static void main(String[] args) {
		Browser browser = new ChromeBrowser();
		
		browser.openBrowser();
		browser.click();
		browser.enterText();
		// we cannot create object for abstract entity
		// Partial abstract
		
		// interface - full abstraction
		
		// Runtime Polymorphism
		// 99% framework
	}
}

interface Browser{
	public  void openBrowser();
	public  void enterText();
	public  void click();
}



class ChromeBrowser implements Browser{
	public void openBrowser() {
		System.out.println("Chrome -> openBrowser");
	}

	public void enterText() {
		System.out.println("Chrome -> enterText");
	}

	public void click(){
		System.out.println("Chrome -> click");
	}
	
}


class FirefoxBrowser implements Browser{
	public void openBrowser() {
		System.out.println("Firefox -> openBrowser");
	}

	public void enterText() {
		System.out.println("Firefox -> enterText");
	}

	public void click(){
		System.out.println("Firefox -> click");
	}
}

class EdgeBrowser implements Browser{
	public void openBrowser() {
		System.out.println("Edge -> openBrowser");
	}

	public void enterText() {
		System.out.println("Edge -> enterText");
	}

	public void click(){
		System.out.println("Edge -> click");
	}
}

// chrome 
// firefox
// edge
