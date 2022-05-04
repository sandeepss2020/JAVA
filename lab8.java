package hotel_manage;

interface Backend {

	  // abstract class
	  public void connectServer();
	}

	class Frontend {

	  public void responsive(String str) {
	    System.out.println(str + " can also be used as frontend.");
	  }
	}

	// Language extends Frontend class
	// Language implements Backend interface
	class lab8 extends Frontend implements Backend {

	  String language = "Java";

	  // implement method of interface
	  public void connectServer() {
	    System.out.println(language + " can be used as backend language.");
	  }

	  public static void main(String[] args) {

	    // create object of Language class
	    lab8 java = new lab8();

	    java.connectServer();

	    // call the inherited method of Frontend class
	    java.responsive(java.language);
	  }

	}
