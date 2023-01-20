public class Calendar {
    private int year = 0;
    private int month = 0;
    private int day = 0;
    private final String[] day_list = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    private final int[] month_day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public Calendar(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }
    private boolean discri_leap(int check) {
        if(check % 400 == 0)
            return true;
        else if(check % 100 == 0)
            return false;
        else if(check % 4 == 0)
            return true;
        else
            return false;
    }
    private int count_day() {
        int count = 0;

        for(int i = 1; i < year; i++) {
            if (discri_leap(i))
                count += 366;
            else
                count += 365;
        }

        for(int i = 0 ; i < month; i++) {
            count += month_day[i];
            if(i == 3) {
                if (discri_leap(year))
                    count++;
            }
        }

        count += day;

        return count;
    }
    public String d_o_week() {
        int tmp = count_day();

        return day_list[tmp % 7];
    }
}
