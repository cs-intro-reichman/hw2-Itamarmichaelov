// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String chears = args[0];       
        int reapet = Integer.parseInt(args[1]);
        int iteration = chears.length();
        // System.out.println(chears.charAt(0));
        for(int i= 0; i < iteration ; i++)
        {
        switch  (chears.charAt(i)) {
                case 'A':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                case 'E':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                case 'F':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                case 'H':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                case 'I':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                case 'L':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                         break;
                case 'M':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                case 'N':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;        
                case 'O':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;

                case 'R':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                case 'S':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                case 'X':
                        System.out.println("Give me an "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
                        break;
                default:
                        System.out.println("Give me a  "+chears.charAt(i)+":" +" "+chears.charAt(i)+"!");
        }
        }
        System.out.println("What does that spell?");
        for(int i =0 ; i<reapet;i++){
                System.out.println(chears+"!!!");
        }          

        }        
        

        
}
