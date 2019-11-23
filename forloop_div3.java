import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        // need input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //output var
        int startNum;
        int averageNum;
        //counter
        int index;
        int total = 0;
        int times = 0;
        //compare var
        int leftNum;

        //setup a start number
        if (Math.abs(a) % 3 > 0) {

            if (a < 0) {

                startNum = -(Math.abs(a) - Math.abs(a) % 3);

            } else {

                startNum = a - a % 3;

            }
            
        } else {

            startNum = a;

        }

        //begin calculate
        for (index = startNum ;index <= b ;index += 3 ) {

            total += index;
            times++;

        }

        leftNum = total % times;
        averageNum = total / times;

        //output...
        if (leftNum != 0) {

            System.out.println(averageNum + 0.5);

        } else {

            System.out.println(averageNum);

        }
    }
}
