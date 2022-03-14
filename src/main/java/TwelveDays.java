class TwelveDays {
    static String songTemplate = "On the %s day of Christmas my true love gave to me: %s.";

    static String numbers[] = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

    static String songNumberLines[] = {"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};

    static String songLines[] = new String[12];

    //Initialize songLines
    static {
        String songLine = "";
        String temp = "and " + songNumberLines[0];

        for (int i = 0; i < 12; i++) {
            if (i == 0) {
                songLine = String.format(songTemplate, numbers[i], songNumberLines[i]);
            } else {
                temp = songNumberLines[i] + ", " + temp;
                songLine = String.format(songTemplate, numbers[i], temp);
            }
            songLines[i] = songLine + "\n";
        }
    }

    String verse(int verseNumber) {

        return songLines[verseNumber - 1];

    }

    String verses(int startVerse, int endVerse) {

        StringBuilder song = new StringBuilder();

        for (int i = startVerse - 1; i < endVerse - 1; i++) {
            song.append(songLines[i] + "\n");
        }

        song.append(songLines[endVerse - 1]);

        return song.toString();
    }

    String sing() {

        return verses(1, 12);

    }
}
