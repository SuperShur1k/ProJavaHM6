package org.example.lesson6.ls6hm.task1;

import java.util.ArrayList;
import java.util.List;

//Есть список countries {"Andorra", "Belize", "Cayman", "France", "Argentina", "Cuba", "Sweden", "austria"} и список
//
//words {"Andorra", "Canada", "First", "candy", "austria", "Argentina", "wood", "parrot", "cat", "Alan", "Cuba", "Finland", "Axelrod" , "Avangard", "Cuba"}
//Оставить в countries только те страны, которые присутствуют также и в списке words  Java

public class Arr {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(
                List.of(
                        "Andorra", "Belize",
                        "Cayman", "France",
                        "Argentina", "Cuba",
                        "Sweden", "austria"
                )
        );

        List<String> words = new ArrayList<>(
                List.of(
                        "Andorra", "Canada",
                        "First", "candy",
                        "austria", "Argentina",
                        "wood", "parrot",
                        "cat", "Alan",
                        "Cuba", "Finland",
                        "Axelrod" , "Avangard", "Cuba"
                )
        );

        countries.retainAll(words);
        System.out.println(countries);

    }
}
