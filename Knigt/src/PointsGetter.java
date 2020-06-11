
import java.util.ArrayList;


public class PointsGetter {
public static Point getPointUpLeftLong(Point PointTocheck) {
	return new Point(PointTocheck.getX()+2,PointTocheck.getY()+1);
}
public static Point getPointUpLeftShort(Point PointTocheck) {
	return new Point(PointTocheck.getX()+1,PointTocheck.getY()+2);
}
public static Point getPointUpRightLong(Point PointTocheck) {
	return new Point(PointTocheck.getX()-2,PointTocheck.getY()+1);
}
public static Point getPointUpRightShort(Point PointTocheck) {
	return new Point(PointTocheck.getX()-1,PointTocheck.getY()+2);
}
public static Point getPointDownLeftLong(Point PointTocheck) {
	return new Point(PointTocheck.getX()-2,PointTocheck.getY()-1);
}
public static Point getPointDownLeftShort(Point PointTocheck) {
	return new Point(PointTocheck.getX()-1,PointTocheck.getY()-2);
}
public static Point getPointDownRightLong(Point PointTocheck) {
	return new Point(PointTocheck.getX()+1,PointTocheck.getY()-2);
}
public static Point getPointDownRightShort(Point PointTocheck) {
	return new Point(PointTocheck.getX()+2,PointTocheck.getY()-1);
}
public static ArrayList<Point> get8points(ArrayList<Point> array) {
	ArrayList<Point> points=new ArrayList<>();
	ArrayList<Point> temp=new ArrayList<>();
	for (int i = 0; i < array.size(); i++) {
	points.add(getPointDownLeftLong(array.get(i)));
	points.add(getPointDownLeftShort(array.get(i)));
	points.add(getPointDownRightLong(array.get(i)));
	points.add(getPointDownRightShort(array.get(i)));
	points.add(getPointUpLeftLong(array.get(i)));
	points.add(getPointUpLeftShort(array.get(i)));
	points.add(getPointUpRightLong(array.get(i)));
	points.add(getPointUpRightShort(array.get(i)));
	System.out.println("Array is "+points.toString());
	
	}
	for (int i = 0; i < points.size(); i++) {
		if ((points.get(i).getX()<0) || (points.get(i).getY()<0))
		{
			System.out.println("Point removed: ("+ points.get(i).getX()+","+points.get(i).getY()+")");
			points.remove(i);
		}
		else
		{
			temp.add(points.get(i));
		}
		}
	System.out.println("new Array after removing is "+temp.toString());
	return temp;
}

}
