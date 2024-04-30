package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate addYear(int addYear){
        return new ImmutableMyDate(addYear,month,day);
    }
    public ImmutableMyDate addMonth(int addMonth){
        return new ImmutableMyDate(year,addMonth,day);
    }
    public ImmutableMyDate addDay(int addDay){
        return new ImmutableMyDate(year,month,addDay);
    }


    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
