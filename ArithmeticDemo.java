class ArithmeticDemo {

    public static void main (String[] args){
         
        // result is now 3
        System.out.println("int result = 1 +2;");
	int result = 1 + 2;
        System.out.println(result);

        // result is now 2
        System.out.println("result = result - 1;");
	result = result - 1;
        System.out.println(result);

        // result is now 4
        System.out.println("result = result *2;");
	result = result * 2;
        System.out.println(result);

        // result is now 2
        System.out.println("result = result / 2;");
	result = result / 2;
        System.out.println(result);

        // result is now 10
	System.out.println("result = result + 8;");
        result = result + 8;
        // result is now 3
	System.out.println("result = result % 7;");
        result = result % 7;
        System.out.println(result);
    }
}
