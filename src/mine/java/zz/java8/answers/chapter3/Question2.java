package zz.java8.answers.chapter3;

import java.util.List;

import com.insightfullogic.java8.examples.chapter1.Artist;

public class Question2 {

	public static int countBandMembersInternal(List<Artist> artists) {
		return artists.stream()
				.map(artist -> artist.getMembers().count())
				.reduce(0L, Long::sum)
				.intValue();
				
	}
}
