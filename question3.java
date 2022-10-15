interface car
{
 String getnowheels();
 String getcolour();
 String getbrand();
}
abstract class carAbeforebrand implements car{
 public String getnowheels()
 {
   return "four";
 }
 public String getcolour()
 {
  return "red";
 }
}
class carAafterbrand extends carAbeforebrand{
  public String getbrand()
 {
  return "skoda";
 }  
}
class carB implements car{
   public String getnowheels()
 {
   return "four";
 }
 public String getcolour()
 {
  return "blue";
 }
 public String getbrand()
 {
  return "toyota";
 } 
}
public class question3{
  public static void main(String[]args){
   carAafterbrand obj1 = new carAafterbrand();
   System.out.println(obj1.getnowheels());
   System.out.println( obj1.getcolour());
   System.out.println(obj1.getcolour());
  
   
 }
}
