package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (2 < month && month < 6) {
            System.out.println("Spring");
        }else if (5<month && month<9){
            System.out.println("Summer");
        }else if (8<month && month<12){
            System.out.println("Autumn");
        }else if (month==12 || month==1 || month==2){
            System.out.println("Winter");
        }else {
            System.out.println("wrong number!");
        }
    }
}
