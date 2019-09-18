//Java class ForLoops.java

/**
 * Skeleton code for the for loops practice day.
 * 
 * @author Roy Chancellor
 * @version 2/26/2019
 */
public class Forloops
{
    public static void main( String args[] ) {
        //variable declarations
        int i, cube;
        
        System.out.println(); //blank line for separation in termial
        System.out.println("i\tcube i"); //table header
        
        for(i=1; i<=10; i=i+1){
            cube=i*i*i;
            System.out.println(i+ "\t" + "\t" + cube);
        }
        
        System.out.println();
        
        for(i=99; i>=1; i=i-2) {
           
            cube=i*i*i;
            System.out.println(i+ "\t" + "\t" + cube);
            
        } //end for
      
        
        String myStr = "The quick brown fox jumped over the lazy dog";
        
        System.out.println();
        
        int n = myStr.length();
        myStr.charAt(0);
        
        for( int t = 0; t< n; t++){
            
            System.out.println(myStr.charAt(t));
        }
       
       
        //for loop to perform the task
        
    } //end main
}//end ForLoops class