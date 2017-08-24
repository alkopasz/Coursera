
public class SimpleLocation
{
  private double latitude;
  private double longitude;
  
  public SimpleLocation(double lat, double lon)
  {
    this.latitude = lat;
    this.longitude = lon;
  }
  public double distance (SimpleLocation other)
  {
	  return getDist(this.latitude,this.longitude,other.latitude,other.longitude);
  }
  
  private double getDist(double lat1,double lon1,double lat2,double lon2 )
  {
	  return Math.sqrt(Math.pow((lat2-lat1),2)+Math.pow((lon2-lon1),2));
  }
  // more code here (defines the method distance, etc.)
  // ...
  
  public static void main(String[] args)
  {
    SimpleLocation ucsd = new SimpleLocation(32.9, -117.2);
    SimpleLocation lima = new SimpleLocation(-12.0, -77.0);
   // lima.latitude = -12.04;
    System.out.println(ucsd.distance(lima));
  }
}