
public class HashTable {
	private Spots [] table;

	HashTable(int size) {
		//table = new HashVal[size];
		table = new Spots[size]; //Array of linkedlists
		for (Spots spot: table){
			spot = null;
		}
	}

	public int getVal(int key){
		int hash = (key % 11);

		HashNode keyVal;
		while (table[hash] != null){
			keyVal = table[hash].getHashNode();
			
			if (keyVal.getKey() != key){
				keyVal = keyVal.nextLink;
			}
			else {
				return table[hash].getHashNode().getKey();
			}
		}
		return -1;
   }

   public void collitionAdd(int value){
      int hash = (value % 11);
      if (table[hash] != null){
    	 HashNode current = table[hash].getHashNode();
    	 while (current.nextLink != null) {
    		 current = current.nextLink;
    	 }
    	 current.nextLink = new HashNode(hash, value);
      }
      else {
    	  table[hash] = new Spots();
    	  table[hash].addNode(hash, value);
      }
   }
   
   public String toString(){
	   String out = "";
	   //int i=0;
	   //for (Spots spot: table){
	   for (int i=0; i<table.length; i++){
			out += "["+i+"]\t" + table[i] + "\n";
			//i++;
		}
	   return out;
   }
   
   public static void main(String [] args){
	   //30, 20, 56, 75, 31, 19 
	   HashTable test = new HashTable(15);
	   int [] nodes = {30, 20, 6, 75, 31, 19};
	   for (int i=0; i < nodes.length; i++){
		   test.collitionAdd(nodes[i]);
	   }
	   System.out.println(test);
   }
}
