import java.util.LinkedList;

class Graph{
	int v;
	LinkedList<Integer> listArray[];

	Graph(int v){
		this.v = v;
		listArray = new LinkedList[v];

		for(int i=0;i<v;i++){
			listArray[i] = new LinkedList<>();
		}
	}
}

class AdjacencyList{
	static Graph ge;
	public static void addEdge(int src, int dest){
		ge.listArray[src].add(dest);
		ge.listArray[dest].add(src);
	}

	public static void printGraph(){
		for(int i = 0; i< ge.v; i++){
			System.out.println("AdjacencyList of vertex" + i);
			System.out.println(""+ge.listArray[i]);
		}	
	}

	public static void main(String args[]){
		ge = new Graph(5);
		addEdge(0, 1); 
        addEdge(0, 4); 
        addEdge(1, 2); 
        addEdge(1, 3); 
        addEdge(1, 4); 
        addEdge(2, 3); 
        addEdge(3, 4);

        printGraph();
	}

}