import java.util.Scanner;

public class AdventOfCode22_D1_1 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String input;
        int prevMax=0;
        int currmax=0;
        while(scan.hasNextLine()){
            input = scan.nextLine();
            if(input.matches("/")){
                scan.close();
                break;
            }else{
                if(input!=""){
                    currmax = currmax + Integer.parseInt(input);
                }
                else{
                    if(currmax>prevMax) {
                        prevMax = currmax;
                    }
                    currmax = 0;
                }
            }
        }
        System.out.println(prevMax);
    }
}
