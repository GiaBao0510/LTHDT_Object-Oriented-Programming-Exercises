package BaiHoc_Lesson.timHieuVe_Generic;

public class Word<K,V> {
	private K key;
	private V value;
	//Phuong thuc xay dung
	public Word() {
		key = null;
		value = null;
	}
	public Word(K key , V value) {
		this.key = key;
		this.value = value;
	}
	public Word(Word<K,V> X) {
		this.key = X.key;
		this.value = X.value;
	}
	//Ham in
	public void xuat() {
		System.out.println(key+" : "+value);
	}
	public String toString() {
		return "\n"+key+" : "+value;
	}
	//Get & Set
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	//So sanh key nay voi key khac
	public boolean isKeyEquals(K AnotherKey) {
		return (this.key.equals(AnotherKey));
	}
}
