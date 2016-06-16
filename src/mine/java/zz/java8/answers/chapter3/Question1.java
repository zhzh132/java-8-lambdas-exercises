package zz.java8.answers.chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

public class Question1 {
	
	public static int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, (acc, n) -> acc + n);
	}
	
	public static List<String> getNamesAndOrigins(List<Artist> artists) {
		return artists.stream()
				.flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
				.collect(Collectors.toList());
	}
	
	public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
		return input.stream()
				.filter(album -> album.getTrackList().size() <= 3)
				.collect(Collectors.toList());
	}
}
