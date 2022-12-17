package BaiHoc_Lesson;

import java.util.ArrayDeque;
import java.util.Deque;

public class CoBan_Dequeue {

	public static void main(String[] args) {
		Deque<String> dsAnime = new ArrayDeque<String>();
		dsAnime.offer("One Piece");
		dsAnime.offer("Bleach");
		dsAnime.offer("Black Clover");
		dsAnime.offer("One Punch man");
		dsAnime.offer("My hero Academia");
		dsAnime.offerFirst("Dragon ball z");
		dsAnime.offerLast("Bleach 2");
		String tenAnime;
		while(true) {
			tenAnime = dsAnime.poll();
			if(tenAnime == null) {
				break;
			}
			System.out.println(tenAnime);
		}
	}

}
