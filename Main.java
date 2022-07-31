//                                   -------------------ENCAPSULATION IN JAVA ------------------------
//                                    do you know what is encapsulation its OOP concept 


//encapsulation is nothing its binds together code and data


class area{
    int length;
    int width;

area(int length , int width){
    this.length=length;
    this.width=width;
}

public void getArea(){
    int Area=length*width;
    System.out.println(Area);
}
}
class Main{
    public static void main(String[] args){
        area z = new area(20,10);
        z.getArea();
    }
}
