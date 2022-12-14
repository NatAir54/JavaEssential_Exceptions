package task_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Worker [] staff = new Worker[5];
        String fieldFullName = "";
        String fieldPosition = "";
        String fieldHireYear = "";

        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter full name of worker:");
            fieldFullName = in.nextLine();
            System.out.println("Enter the position:");
            fieldPosition = in.nextLine();
            System.out.println("Enter the hire year:");
            fieldHireYear = in.nextLine();

            isThisYearValid(fieldHireYear, "yyyy");

            staff[i] = new Worker(fieldFullName, fieldPosition, fieldHireYear);
        }

        // sorting the array by fullName
        Arrays.sort(staff, new Comparator<Worker>() {
            @Override
            public int compare(Worker workerFirst, Worker workerSecond) {
                return workerFirst.getFullName().compareTo(workerSecond.getFullName());
            }
        });
        System.out.println(Arrays.deepToString(staff));

        // looking for the experienced employee
        LocalDate date = LocalDate.now();
        int currentYear = date.getYear();
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the required work experience in years:");
        int workExperience = Integer.parseInt(in.nextLine());

        int count = 0;
        for(Worker w : staff) {
            if ( currentYear - Integer.parseInt(w.getHireYear()) > workExperience ) {
                System.out.println(w.getFullName());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no employee with the required work experience.");
        }

    }

    //method checking year validation
    public static boolean isThisYearValid(String yearToValidate, String yearFormat) {
        if (yearToValidate == null){
            return false;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(yearFormat);
        simpleDateFormat.setLenient(false);

        try {
            Date date = simpleDateFormat.parse(yearToValidate);
        }
        catch (ParseException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

}
