import java.awt.Rectangle;

public class Application {

	public static boolean doRectanglesOverlap(Rectangle r1, Rectangle r2) {
		if (r1.getMaxX() < r2.x || r2.getMaxX() < r1.x) {
			return false;
		}

		if (r1.getMinY() > r2.y || r2.getMinY() > r1.y) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c
		Rectangle r2 = new Rectangle(0, 1, 2, -3);
		
		boolean isOverlap = doRectanglesOverlap(r1,r2);
		
		if(isOverlap == true) {
			System.out.println("Overlaps!");
		}else {
			System.out.println("Doesn't Overlap!");
		}

	}

}
