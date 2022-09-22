public class dowhileloops
{
    public static void main(String[] args){
    int a = 5; 
    int b = 2; 
    int c = 1; 
    int d = -8;
    int k = 7; 
    int i = 0; 
    do {
        System.out.println("i is " + i + "but is less than 15");
        i = i+1;
    } while (i < 15);
    do {
        System.out.println("k is " + k + "but is more than 5"); 
        k = k-1; 
    } while (k > 5);
    do {
        System.out.println("a is " + a + "but is less than 10, and b is " + b + " but is less than or equal to 20");
        a = a+1;
        b = b+2; 
    } while (a < 10 && b <= 20); 
    }
}



