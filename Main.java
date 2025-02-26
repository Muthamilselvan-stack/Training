class Area{
    double area;
    public void area(float r){
        
        area=3.14*r*r;
        System.out.println("the area of circle :" + area);
    }
     public void area(int r){
        
        area=r*r;
        System.out.println("the area of square :" + area);
    }
     public void area(int x,int y){
        
        area=x*y;
        System.out.println("the area of rectangle :" + area);
    }
}
class Main {
    public static void main(String args[])
{
    
    Area s=new Area();
    s.area(7f);
    s.area(5);
    s.area(3,10);
}}