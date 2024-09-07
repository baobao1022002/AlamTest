public class Test {

    //1. Write code to print out the numbers 1 to 10.
    public static String printNumb1(){
        String result="";
        for (int i = 1; i <= 10; i++) {
            result+=i+"\n";
        }
            return result;
    }

    // 2. Print out the numbers 1 to 10, but print ‘a’ instead if the number is divisible by 2.
    public static String printNumb2(){
        String result="";
        for (int i = 1; i <= 10; i++) {
            if(i%2==0){
                result+="a\n";
            }else{
                result+=i+"\n";
            }
        }
        return result;
    }

    //3. Print out the numbers 1 to 10, but print ‘a’ instead if the number is divisible by 2, and print ‘b’ if
    //the number is divisible by 3.
    public static String printNumb3(){
        String result="";
        for (int i = 1; i <= 10; i++) {
            if(i%3==0){
                result+="b\n";
            }else if(i%2==0){
                result+="a\n";
            }else{
                result+=i+"\n";
            }
        }
        return result;
    }

    //4. Print out the numbers 1 to 10, but print ‘a’ instead if the number is divisible by 2, print ‘b’ if the
    //number is divisible by 3, and print ‘ab’ if the number is divisible by both 2 and 3.
    public static String printNumb4(){
        String result="";
        for (int i = 1; i <= 10; i++) {
            if(i%3==0&&i%2==0){
                result+="ab\n";
            }else if(i%3==0){
                result+="b\n";
            }else if(i%2==0){
                result+="a\n";
            }
            else{
                result+=i+"\n";
            }
        }
        return result;
    }

    //5. Write a function which takes the input of a time in 24-hour format, and converts it to 12-hour
    //format. Note: do not use a datetime library.
    public static String convertTo12HourFormat(String time24) {
        String[] timeParts = time24.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        String minutes = timeParts[1];

        String period = (hours < 12) ? "AM" : "PM";

        hours = (hours % 12 == 0) ? 12 : hours % 12;

        return hours + ":" + minutes + period;
    }
    public static void main(String[] args) {
        System.out.println("sentence 1");
        System.out.println(printNumb1());
        System.out.println("sentence 2");
        System.out.println(printNumb2());
        System.out.println("sentence 3");
        System.out.println(printNumb3());
        System.out.println("sentence 4");
        System.out.println(printNumb4());
        System.out.println("sentence 5");
        System.out.println(convertTo12HourFormat("09:53"));
        System.out.println(convertTo12HourFormat("17:29"));
    }

}
