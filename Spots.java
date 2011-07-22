public class Spots {
	
	private HashNode next;

    Spots() {
    	next = null;
    }

    public boolean isEmpty() {
    	return next == null;
    }

    public void addNode(int key, int value) {
        HashNode link = new HashNode(key, value);
        //link.nextLink = next;
        if (next != null){
        	next.nextLink = link;
        	link.nextLink = null;
        }
        else {
        	next = link;
        }
    }

    public HashNode delete() {
        HashNode temp = next;
        next = next.nextLink;
        return temp;
    }
	
    public HashNode getHashNode(){
    	return next;
    }
    
    public String toString(){
    	String out = "";
    	HashNode current = next;
    	while(current != null) {
    		out += current.toString() + "\t";
    		current = current.nextLink;
    	} 
    	return out;
    }
    
    public static void main(String [] args){
    	//	   int [] nodes = {30, 20, 6, 75, 31, 19};
    	System.out.println("WTF!");
    	Spots test = new Spots();
    	test.addNode(5, 30);
    	test.addNode(20%11, 20);
    	System.out.println(test);
    }
	
}
