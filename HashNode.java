
public class HashNode {
	private int key;
	private int value;
	public HashNode nextLink;
	
	HashNode(int key, int value){
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String toString() {
		return "Key: " + key + ", Value: " + value;
	}
}
