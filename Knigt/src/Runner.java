import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	static Point startPoint=new Point(0,0);
	static Point endPoint=new Point(1,1);
	static ArrayList<Point> bigArray=new ArrayList<>();
	static ArrayList<Point> smallArray=new ArrayList<>();
	static int boardLenght=9;
	ArrayList<Point> firstArray=new ArrayList<>();
	ArrayList<Point> nextArray=new ArrayList<>();
	static int minNumOfMoves;
	static int NumOfMoves= 0;
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Board size...");
		boardLenght=sc.nextInt();
		System.out.println("Please Enter X for Start Point...");
		startPoint.setX(sc.nextInt());
		System.out.println("number is "+startPoint.getX()+" Please Enter Y for Start Point...");
		startPoint.setY(sc.nextInt());
		System.out.println("Please Enter X for End Point...");
		endPoint.setX(sc.nextInt());
		System.out.println("number is "+endPoint.getX()+" Please Enter Y for End Point...");
		endPoint.setY(sc.nextInt());
			smallArray.add(startPoint);
			int i=0;
			for (int j = 0; j <boardLenght*boardLenght; j++) {
			
			System.out.println("Started");
			if (getAllNextpoints(smallArray).contains(endPoint)||smallArray.contains(endPoint)) {				
				minNumOfMoves=i;
				break;
			}
			else {
				i++;
				smallArray=getAllNextpoints(smallArray);
				if (getAllNextpoints(smallArray).contains(endPoint)) {				
					minNumOfMoves=i;
					break;
				}
			}
			}
			System.out.println("min num of moves is "+ minNumOfMoves);
	} catch (Exception e) {
		e.printStackTrace();
	}	
}



static ArrayList<Point> getAllNextpoints(ArrayList<Point> array){
	ArrayList<Point> tmp=new ArrayList<Point>();
	tmp.addAll(PointsGetter.get8points(array));
	return tmp;
}

 static Boolean isPointInArray(Point pointToSearch,ArrayList<Point> points) {
	for (int i = 0; i < points.size(); i++) {
		if (points.get(i).getX()==pointToSearch.getX()&&points.get(i).getY()==pointToSearch.getY()) {
		return true;
		}
		else {
	
	return false;
	}
	}
	return true;
 }
}
