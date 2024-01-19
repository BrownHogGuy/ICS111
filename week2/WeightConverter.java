public class WeightConverter {
	public static double KILO_TO_POUND = 2.2;
	public static void main(String[] args) {
		double wtPounds = 22;
		double wtKilos = 0.0;
		//CONSTANT NEED TO BE IN UPPERCASE
		wtKilos = wtPounds / KILO_TO_POUND;	// turn a constant to a varibale if used many time.
		System.out.println(wtPounds + " pounds is " + wtKilos + " kilos");
	}
}

