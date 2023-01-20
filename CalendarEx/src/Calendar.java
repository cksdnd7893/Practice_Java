public class Calendar {
    private int year = 0;
    private int month = 0;
    private int day = 0;
    private final String[] day_list = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    private final int[] month_day = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Calendar(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    private boolean discri_leap(int check) {
        if (check % 400 == 0) {
            return true;
        } else if (check % 100 == 0) {
            return false;
        } else {
            return check % 4 == 0;
        }
    }

    private int count_day() {
        int count = 0;

        int i;
        for(i = 1; i < this.year; ++i) {
            if (this.discri_leap(i)) {
                count += 366;
            } else {
                count += 365;
            }
        }

        for(i = 0; i < this.month; ++i) {
            count += this.month_day[i];
            if (i == 3 && this.discri_leap(this.year)) {
                ++count;
            }
        }

        count += this.day;
        return count;
    }

    public String d_o_week() {
        int tmp = this.count_day();
        return this.day_list[tmp % 7];
    }
}