package mayya.siv;

public class Anime {

    public static String commonName = "Аниме";
    private String nameOfAnime;
    private int originalRun;
    private int totalCountOfEpisodes;
    private int countOfEpisodesSeen;
    Anime.Genre genre;

    public Anime(String nameOfAnime, int originalRun, int totalCountOfEpisodes, int countOfEpisodesSeen) {
        this.nameOfAnime = nameOfAnime;
        this.originalRun = originalRun;
        this.totalCountOfEpisodes = totalCountOfEpisodes;
        this.countOfEpisodesSeen = countOfEpisodesSeen;
    }

    public String getNameOfAnime() {
        return nameOfAnime;
    }

    public void setNameOfAnime(String nameOfAnime) {
        this.nameOfAnime = nameOfAnime;
    }

    public int getOriginalRun() {
        return originalRun;
    }

    public void setOriginalRun(int originalRun) {
        this.originalRun = originalRun;
    }

    public int getTotalCountOfEpisodes() {
        return totalCountOfEpisodes;
    }

    public void setTotalCountOfEpisodes(int totalCountOfEpisodes) {
        if (totalCountOfEpisodes > 0) {
            this.totalCountOfEpisodes = totalCountOfEpisodes;
        } else {
            System.out.println("В аниме должно быть больше чем 0 серий");
        }
    }

    public int getCountOfEpisodesSeen() {
        return countOfEpisodesSeen;
    }

    public void setCountOfEpisodesSeen(int countOfEpisodesSeen) {
        if (countOfEpisodesSeen >= 0 && countOfEpisodesSeen <= totalCountOfEpisodes) {
            this.countOfEpisodesSeen = countOfEpisodesSeen;
        } else {
            System.out.println("Общее количество просмотренных эпизодов должно быть больше ноля " +
                    "и меньше или равно количеству всех эпиходов аниме");
        }
    }

    public void sayNameOfAnime() {
        System.out.println("Название аниме: " + nameOfAnime);
    }

    public void sayYearOfOriginalRun() {
        System.out.println("Год выхода: " + originalRun);
    }

    public static void sayClassName() {
        System.out.println(Anime.class.getName());
    }

    public void episodesLeftToWatch() {
        int countOfEpisodesRemaining = totalCountOfEpisodes - countOfEpisodesSeen;
        if (countOfEpisodesRemaining == 0) {
            System.out.println("Ура, аниме " + nameOfAnime + " просмотрено");
        } else {
            System.out.println("Осталось просмотреть " + countOfEpisodesRemaining + " серий аниме " + nameOfAnime);
        }
    }

    static class Genre {
        String name;

        public Genre(String name) {
            this.name = name;
        }

        public void sayGenreOfAnime() {
            System.out.println("Жанр аниме: " + name);
        }
    }
}
