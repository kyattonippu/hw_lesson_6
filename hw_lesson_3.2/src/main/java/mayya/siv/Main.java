package mayya.siv;

public class Main {

    public static void main(String[] args) {
        Serial.sayClassName();
        System.out.println(Serial.commonName);

        Serial loki = new Serial("Loki", 2021, 6, 6);
        loki.genre = new Serial.Genre("Fantasy");
        loki.genre.sayGenreOfSerial();
        loki.sayNameOfSerial();
        loki.sayYearOfRelease();
        loki.seriesLeftToWatch();

        Serial helstrom = new Serial("Helstrom", 2020, 10, 8);
        helstrom.genre = new Serial.Genre("Drama");
        helstrom.genre.sayGenreOfSerial();
        helstrom.sayNameOfSerial();
        helstrom.sayYearOfRelease();
        helstrom.seriesLeftToWatch();

        Anime.sayClassName();
        System.out.println(Anime.commonName);
        Anime berserk = new Anime("Berserk", 1997, 25, 13);
        berserk.sayNameOfAnime();
        berserk.genre = new Anime.Genre("Fantasy");
        berserk.genre.sayGenreOfAnime();
        berserk.sayYearOfOriginalRun();
        berserk.episodesLeftToWatch();

        Anime barakamon = new Anime("Barakamon", 2014, 12, 12);
        barakamon.sayNameOfAnime();
        barakamon.genre = new Anime.Genre("Comedy");
        barakamon.genre.sayGenreOfAnime();
        barakamon.sayYearOfOriginalRun();
        barakamon.episodesLeftToWatch();
    }
}
