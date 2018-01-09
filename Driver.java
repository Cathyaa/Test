import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String args[]){
        Scanner kbReader = new Scanner(System.in);
        
        Map world = new Map();
        world.create();
        System.out.println("Hero begins his journey in the Southwest corner of Yore.");
        
        boolean play = true;
        while(play){
            System.out.println("Enter direction(w,a,s,d):");
            String d = kbReader.next();
            if(d.equals("w")||d.equals("a")||d.equals("s")||d.equals("d")){
                world.move(d);
                if(world.checkEnd()){
                    break;
                };
            }else{
                System.out.println("Enter a valid response.");
            }
        }
    }
}