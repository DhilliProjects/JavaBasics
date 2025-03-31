package basic;

public class Geeks {
    public static int count = 0; // Static variable

    public Geeks() {
        count++;
        count++;

    }

    public static void main(String[] args) {
    	Geeks c1 = new Geeks();
    	Geeks c2 = new Geeks();

    	//Geeks.count=6;
        System.out.println(Geeks.count); // Output: 2

    }
}