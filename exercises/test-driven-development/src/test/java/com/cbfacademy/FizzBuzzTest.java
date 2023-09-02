package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.junit.jupiter.params.provider.Arguments.arguments;


@DisplayName(value = "Fizz Buzz ")
public class FizzBuzzTest {
    

        @Test
        @DisplayName("returns this unit's exercises name")
        public void returnExerciseName() {
            final FizzBuzz exercise = new FizzBuzz();

            final String name = exercise.getName();

            assertThat(name, is("Fizz Buzz"));
        }


        @ParameterizedTest
        @MethodSource("fizzBuzzExerciseProvider")
        @DisplayName("Fizz Buzz")
        public void fizzBuzz(List<Integer> numbers, List<String> expected) {
            final FizzBuzz exercise = new FizzBuzz();

            final List<String> result = exercise.fizzBuzz(numbers);

            assertThat(result.size(), is(expected.size()));
            assertThat(result, is(expected));
        }
        static Stream<Arguments> fizzBuzzExerciseProvider() {
            return Stream.of(
                    arguments(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15), List.of("1", "2",
                            "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")),
                    arguments(List.of(0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15),
                            List.of("Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", 
                                    "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry")),
                    arguments(List.of(-1 ,-17, 0, 3, 5, 15, 18, 20, 30), List.of("Invalid Entry", "Invalid Entry", "Invalid Entry",
                            "Fizz", "Buzz", "FizzBuzz", "Invalid Entry", "Invalid Entry", "Invalid Entry")),
                    arguments(List.of(213, 54, 91, 187, 2001, 2023), List.of("Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry", "Invalid Entry"))
            );
        }
        static Stream<Arguments> secondExerciseProvider() {
            return Stream.of(
                    arguments(1, "1"),
                    arguments(2, "2"),
                    arguments(3, "Fizz"),
                    arguments(4, "4"),
                    arguments(5, "Buzz"),
                    arguments(6, "Fizz"),
                    arguments(7, "7"),
                    arguments(8, "8"),
                    arguments(9, "Fizz"),
                    arguments(10, "Buzz"),
                    arguments(11, "11"),
                    arguments(12, "Fizz"),
                    arguments(13, "13"),
                    arguments(14, "14"),
                    arguments(15, "FizzBuzz"),
                    arguments(16, "16"),
                    arguments(17, "17")
            );
        }
}
