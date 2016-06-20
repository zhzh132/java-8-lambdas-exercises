package zz.java8.answers.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringExercises {

	public static int countLowercaseLetters(String str) {
		return (int)str.chars()
				.filter(Character::isLowerCase)
				.count();
				
	}
	
	public static Optional<String> mostLowercaseString(List<String> strings) {
		return strings.stream()
				.max(Comparator.comparing(StringExercises::countLowercaseLetters));
	}
}
