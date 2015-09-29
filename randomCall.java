import java.util.*;
public class randomCall{
    public static void main(String args[]){
        String names[] ={ "Thad", "Daniel", "Bruce","Zach","Ben","Jace","Carl","D    eclan","Collin","Ryan","Jared","Ashelee"};
        System.out.println("Today's call sequence is as follows:");
        for(int i =0;i<20;i++){
            int index =(int) (Math.random()*10000)%names.length;
            System.out.println(names[index]);
            try{
                System.in.read(); 
            }catch(Exception e){
                // do nothing
            }

        }

    }

}
