class Puppy {
   
   int puppyAge;

   public Puppy(String name){
      // This constructor has one parameter, name.
      System.out.println("Passed Name is: " + name ); 
   }

   /* debugged tutorial. tutorial didn't set the type for this method, nor did it define a return value even 
      though the type wasn't defined as void. */

   public int setAge( int age ){
       puppyAge = age;
	return puppyAge;
   }

   public int getAge( ){
       System.out.println("Puppy's age is: " + puppyAge ); 
       return puppyAge;
   }

   public static void main(String []args){
      /* Object creation */
      Puppy myPuppy = new Puppy( "PJ" );

      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age */
      myPuppy.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge ); 
   }
}
