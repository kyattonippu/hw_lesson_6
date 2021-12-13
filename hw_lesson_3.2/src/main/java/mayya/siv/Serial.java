package mayya.siv;

public class Serial {
    public static String commonName = "Сериал";
    private String nameOfSerial;
    private int yearOfRelease;
    private int totalCountOfSeries;
    private int countOfSeriesSeen;
    Genre genre;

    public Serial(String nameOfSerial, int yearOfRelease, int totalCountOfSeries, int countOfSeriesSeen) {
        this.nameOfSerial = nameOfSerial;
        this.yearOfRelease = yearOfRelease;
        this.totalCountOfSeries = totalCountOfSeries;
        this.countOfSeriesSeen = countOfSeriesSeen;
    }

    public String getNameOfSerial() {
        return nameOfSerial;
    }

    public void setNameOfSerial(String nameOfSerial) {
        this.nameOfSerial = nameOfSerial;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getTotalCountOfSeries() {
        return totalCountOfSeries;
    }

    public void setTotalCountOfSeries(int totalCountOfSeries) {
        if (totalCountOfSeries > 0) {
            this.totalCountOfSeries = totalCountOfSeries;
        } else {
            System.out.println("В сериале должно быть больше чем 0 серий");
        }
    }

    public int getCountOfSeriesSeen() {
        return countOfSeriesSeen;
    }

    public void setCountOfSeriesSeen(int countOfSeriesSeen) {
        if (countOfSeriesSeen >= 0 && countOfSeriesSeen <= totalCountOfSeries) {
            this.countOfSeriesSeen = countOfSeriesSeen;
        } else {
            System.out.println("Общее количество просмотренных серий должно быть больше ноля " +
                    "и меньше или равно количеству всех серий сериала");
        }
    }

    public void sayNameOfSerial() {
        System.out.println("Название сериала: " + nameOfSerial);
    }

    public void sayYearOfRelease() {
        System.out.println("Год выпуска: " + yearOfRelease);
    }

    public static void sayClassName() {
        System.out.println(Serial.class.getName());
    }

    public void seriesLeftToWatch() {
        int countOfSeriesRemaining = totalCountOfSeries - countOfSeriesSeen;
        if (countOfSeriesRemaining == 0) {
            System.out.println("Ура, сериал " + nameOfSerial + " просмотрен");
        } else {
            System.out.println("Осталось просмотреть " + countOfSeriesRemaining + " серии сериала " + nameOfSerial);
        }
    }

    static class Genre {
        String name;

        public Genre(String name) {
            this.name = name;
        }

        public void sayGenreOfSerial() {
            System.out.println("Жанр сериала: " + name);
        }
    }
}
