// Copyright 2011 Lucas Dickey. All rights reserved.
// Practice creating classes to set fields & methods to reflect that classes state & behavior.

class JasonBL {

    int caffeinated = 0;
    boolean annoyed = false;
    int giddiness = 0;

    void changeCaffeinated (int newValue) {
	caffeinated = newValue;
    }   

    void changeAnnoyed (boolean newValue) {
	annoyed = newValue;
    }   

    void changeGiddiness (int newValue) {
	giddiness = newValue;
    }   

    void lucasAsksQuestion (boolean newValue) {
	annoyed = newValue;
    }

    void printStates() {
	System.out.println("caffeinated: " +
	caffeinated + " annoyed: " + annoyed +
	" giddiness: " + giddiness);

    }	
}

class JasonBLDemo {
    public static void main(String[] args) {

	// Creating two different JasonBL objects
	JasonBL jasonMorning = new JasonBL();
	JasonBL jasonAfternoon = new JasonBL();

	// Invoking methods on JasonBL objects to modify behavior
	jasonMorning.changeCaffeinated(10);
	jasonMorning.changeAnnoyed(false);
	jasonMorning.changeGiddiness(0);
	jasonMorning.printStates();

	jasonAfternoon.changeCaffeinated(50);
	jasonAfternoon.lucasAsksQuestion(true);
	jasonAfternoon.changeGiddiness(5000);
	jasonAfternoon.printStates();
	
    }
}
