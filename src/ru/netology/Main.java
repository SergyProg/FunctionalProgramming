package ru.netology;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Function<String, Stream<String>> valueConverter = x -> {
            return Arrays.stream(x.split(" "));
        };

        String phrase;

        while (true) {
            System.out.println("Введите фразу (для выхода \"q\"): ");
            phrase = scanner.nextLine();
            if(phrase.equals("q") || phrase.equals("Q")) break;
            System.out.println("Упорядоченный набор слов фразы: ");
            valueConverter.apply(phrase)
                    .distinct()
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}
