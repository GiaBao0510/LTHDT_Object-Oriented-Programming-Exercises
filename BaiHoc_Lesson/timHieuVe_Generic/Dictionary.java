package BaiHoc_Lesson.timHieuVe_Generic;

public class Dictionary<Key,Value> {
	private Word<Key,Value>[] word;
	//Ham xay dung
	public Dictionary() {	//Mang rong
		word = null;
	}
	public Dictionary(Word<Key,Value>[] Word) {
		this.word = Word;
	}
	public Dictionary(Dictionary<Key,Value> X) {
		for(int i=0;i<=X.word.length;i++) {
			this.word[i] = X.word[i];
		}
	}
	//Get va Set
	public Word<Key,Value>[] getWord(){
		return word;
	}
	public void setWord(Word<Key,Value> word[]) {
		this.word = word;
	}
	//Tim gia tri dua tren khoa
	public Value findWord(Key keySearch) {
		int r = word.length-1,
			l=0;	
		while(r>l) {
			int m = (r+l/2);
			if(word[l].isKeyEquals(keySearch) == true) {
				return word[l].getValue();
			}
			if(word[r].isKeyEquals(keySearch) == true) {
				return word[r].getValue();
			}
			if(word[m].isKeyEquals(keySearch) == true) {
				return word[m].getValue(); 
			}
			l++;
			r--;
		}
		return null;//Neu tim khong thay
	}
	
}
