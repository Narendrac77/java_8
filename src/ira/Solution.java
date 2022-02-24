package src.ira;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Solution {

    static List<Moisturizer> moisturizerList = Arrays.asList(
            new Moisturizer(212, "Neutriderm Moisturising Lostion", 850, "Neutriderm"),
            new Moisturizer(112, "mamaearth", 415, "mamaearth oil free cream"),
            new Moisturizer(506, "mamaearth", 324, "mama earth super strawberry lotion")
    );

    public static void main(String[] args) {

        Moisturizer moisturizerByBrandName = getHighestPricedMoisturizerByBrandName(moisturizerList, "Neutriderm");
        Moisturizer secondLowestPricedMoisturizer = getSecondLowestPricedMoisturizer(moisturizerList);

        System.out.println(moisturizerByBrandName);
        System.out.println(secondLowestPricedMoisturizer);
    }

    static Moisturizer getHighestPricedMoisturizerByBrandName(List<Moisturizer> moisturizerList, String input) {
        Optional<Moisturizer> max = moisturizerList.stream()
                .filter(m -> m.getName().equalsIgnoreCase(input))
                .max(Comparator.comparing(Moisturizer::getPrice));

        return max.isPresent() ? max.get() : null;
    }

    static Moisturizer getSecondLowestPricedMoisturizer(List<Moisturizer> moisturizerList) {
        Optional<Moisturizer> max = moisturizerList.stream()
                .filter(x -> (x.getPrice() % 2 == 0 && x.getPrice() > 350))
                .sorted(Comparator.comparing(Moisturizer::getPrice)).limit(2).skip(1).findFirst();
        return max.isPresent() ? max.get() : null;
    }
}
