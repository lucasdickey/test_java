// Copyright 2011 Lucas Dickey. All rights reserved.
// Practice creating classes to set fields & methods to reflect that classes state & behavior.

class JasonWO {

    int stuffedUp = 10;
    boolean engaged = true;
    int giggling = 10;

    void increaseAllergens (int increment) {
	stuffedUp = stuffedUp + increment;
    }   

    void decreaseAllergens (int decrement) {
	stuffedUp = stuffedUp - decrement;
    }  

    void changeEngaged (boolean newValue) {
	engaged = newValue;
    }   

    boolean lucasAsksQuestion () { 
	engaged = false;
	return engaged;
    }

    boolean hasPhoneInHand() {
	engaged = false;
	return engaged;
    }

    void talkingMore (int increment) {
	giggling = giggling + increment;
    }

    void talkingLess (int decrement) {
	giggling = giggling - decrement;
    }

    void printStates() {
	System.out.println("Stuffed Up Level: " +
	stuffedUp + "    Engaged with Convo: " + engaged +
	"   Amount of Giggling: " + giggling);
    }	

    public static void main(String[] args) {

	// Creating two different JasonWO objects
	JasonWO jason1 = new JasonWO();
	JasonWO jason2 = new JasonWO();

	// Invoking methods on JasonWO objects to modify behavior
	jason1.increaseAllergens(20);
	jason1.lucasAsksQuestion();
	jason1.talkingMore(10);
	jason1.printStates();

	jason2.decreaseAllergens(10);
	jason2.hasPhoneInHand();
	jason2.talkingLess(5);
	jason2.printStates();
	
    }
}
