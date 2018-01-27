
public class BeerSong {
	 public static void main(String[] args) {
		 BeerSong.Ninety_Nine_Bottles_of_Beer();
	 }
	 static void Ninety_Nine_Bottles_of_Beer() {
		 int beerNum = 99;
	     String x = "bottles";

	        while (beerNum > 0) {

	            System.out.println(beerNum + " " + x + " of beer on the wall, " + beerNum + " " + x + " of beer");
	            beerNum = beerNum - 1;

	            if (beerNum == 1) {
	                x = "bottle"; //removes "s"
	            }

	            if (beerNum > 0) {
	                System.out.println("Take one down, pass it around " + beerNum + " " + x + " of beer on the wall");
	            }
	        }

	        if (beerNum == 0) {
	            System.out.println("Take one down, pass it around, no more bottles of beer on the wall");
	        }
	    
	 }
}

