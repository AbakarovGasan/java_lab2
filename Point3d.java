import static java.lang.Math.*;
public class Point3d {
// ** координата X **/
private double x;
// ** координата Y **/
private double y;
// ** координата Z **/
private double z;
// ** Конструктор инициализации **/
public Point3d ( double x, double y, double z) {
this.x = x;
this.y = y;
this.z = z;
System.out.println(x + " " + y + " "+ z);
}
// ** Конструктор по умолчанию. **/
public Point3d () {
//Вызовите конструктор с двумя параметрами и определите источник.
this(0, 0, 0);
}
// ** Возвращение координаты X **/
public double getX () {
return x;
}
// ** Возвращение координаты Y **/
public double getY () {
return y;
}
// ** Возвращение координаты Z **/
public double getZ () {
return z;
}
// ** Установка значения координаты X. **/
public void setX ( double val) {
x = val;
}
// ** Установка значения координаты Y. **/
public void setY ( double val) {
y = val;
}
// ** Установка значения координаты Z. **/
public void setZ ( double val) {
z = val;
}
public boolean equals( Point3d j ){
return ( (x == j.x)&(y == j.y)&(z == j.z) );
}
public double distanceTo( Point3d j ){
return sqrt( pow(x-j.x, 2)+pow(y-j.y, 2)+pow(z-j.z, 2) ); 
}
}
