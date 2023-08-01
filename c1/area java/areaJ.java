import java.util.Scanner ;

public class Program{

    public static int addition(int width,int length ){
       
        int area = width * length ;
       
        return area;
    }

    public static void main(String[] args) {
        
       
        Scanner s = new Scanner (System.in);
       
        System.out.println("Enter the length : ");
        int length = s.nextInt();
       
        System.out.println("Enter the width  : ");
        int width = s.nextInt();
       
        int answer = addition(width,length);
       
        System.out.println("Enter the length : "+ answer  );
    }
}