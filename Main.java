import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Vic's period app");
        System.out.println("Pls enter your name:");
        String name = scanner.nextLine();
        System.out.println(" Welcome " + name  +   " Please enter the details of your last menstrual cycle");
        System.out.println("Enter the first day of the last menstrual cycle in (dd-mm-yyyy) format :");
        String lastMenstrualCycle = scanner.nextLine();

        System.out.println("Enter monthly cycle in days:");
        int monthlyCycle = scanner.nextInt();

        System.out.println("Enter how long your period last:");
        int period = scanner.nextInt();

        System.out.println("Thank you for entering your details ");

            String[] dateParts = lastMenstrualCycle.split("-");
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);

            int nextPeriodStartMonth = month;
            int nextPeriodStartDay =  day + monthlyCycle;
            int nextPeriodStartYear = year;

            if (nextPeriodStartDay > 31) {
                nextPeriodStartMonth++;
                nextPeriodStartDay -= 31;

                if (nextPeriodStartMonth > 12) {
                    nextPeriodStartMonth = 1;
                    nextPeriodStartYear++;
                }


            System.out.println("Your next period is :" +nextPeriodStartDay + "-" +nextPeriodStartMonth + "-" +nextPeriodStartYear);
        }
            int ovulationMonth = nextPeriodStartMonth;
            int ovulationDay = nextPeriodStartDay - 14;
            int ovulationYear = nextPeriodStartYear;

                if(ovulationDay >=  31){
                    ovulationMonth++ ;
                    ovulationDay -= 31;
                }
                if(ovulationMonth >= 12){
                    ovulationMonth = 1;
                    ovulationYear++;
                }
                System.out.println("Ovulation date is: " + ovulationDay + "-" +ovulationMonth + "-" + ovulationYear);
                System.out.println("N.B : This works only if your period is regular");
                int safePeriodStartDay = day + 1;
                int safePeriodStartMonth = month ;
                int safePeriodStartYear = year;
                if (day > 31 ){
                    safePeriodStartMonth++;
                    safePeriodStartDay -= 31;
                }
                if (safePeriodStartMonth > 12){
                    safePeriodStartMonth = 1;
                    safePeriodStartYear++;
                }


               int safePeriodEndsDay = day + (monthlyCycle - 18);
               int safePeriodEndsMonth = month;
               int safePeriodEndsYear = year;
                if (safePeriodEndsDay > 31 ){
                    safePeriodEndsMonth++;
                    safePeriodEndsDay -= 31;
                }
                if(safePeriodEndsMonth > 12){
                    safePeriodEndsMonth = 1;
                    safePeriodEndsYear++;
                }



                System.out.println("Safe period start date is: " +safePeriodStartDay + "-" +safePeriodStartMonth + "-" +safePeriodStartYear + " and ends " +safePeriodEndsDay + "-" + safePeriodEndsMonth + "-" + safePeriodEndsYear);
                System.out.println("Your safe period is not always safe, always make use of protection");
    }

}