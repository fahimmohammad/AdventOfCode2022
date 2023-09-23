import java.util.Scanner;

public class AdventOfCode22_D1_2 {
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            String input;
            int prevMax1=0;
            int prevMax2 = 0;
            int prevMax3 = 0;
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
                        if(currmax>prevMax1) {
                            prevMax3 = prevMax2;
                            prevMax2 = prevMax1;
                            prevMax1 = currmax;
                        }else if(currmax>prevMax2){
                            prevMax3 = prevMax2;
                            prevMax2 = currmax;
                        }else if(currmax>prevMax3){
                            prevMax3 = currmax;
                        }
                        currmax = 0;
                    }
                }
            }
            System.out.println(prevMax1+prevMax2+prevMax3);
            System.out.println(prevMax2);
            System.out.println(prevMax3);
        }
    }
