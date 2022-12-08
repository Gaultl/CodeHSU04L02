public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 5
        for (int start = 1; start <= 5; start++){
            System.out.print(start + " ");
        }
        System.out.println();

        //a for loop that prints the integer powers of two up to 100
        //can you have an infinite for loop?
        for (int start = 1; start < 100; start *= 2){
            System.out.print(start + " ");
        }
        System.out.println();

        //write a for loop that counts by 4s from 5 up to 50
        for (int start = 5; start <= 50; start += 4){
            System.out.print(start + " ");
        }
        System.out.println();

        //write a for loop that sums the numbers from 1 to 10
        int total = 0;
        for (int i = 1; i <=10; i++){
            total += i;
        }
        System.out.print("The sum of numbers 1 through 10 is " + total);
        System.out.println();

        ////////////////////////////////////////////////////
        //for loops compared to while loops////////////////
        //////////////////////////////////////////////////

        for(int num = 1; num <= 5; num++){
            System.out.print(num + " ");
        }
        System.out.println("Finished!");

        int num = 1;
        while(num <= 5){
            System.out.print(num + " ");
            num++;
        }
        System.out.println("Finished!");

    }
}
