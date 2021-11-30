package graph_ds;

public class App {

	public static void main(String[] args) {
		Graph myGraph = new Graph(5);
		myGraph.addEdge(0, 1);
		myGraph.addEdge(0, 2);
		myGraph.addEdge(0, 3);
		myGraph.addEdge(1, 2);
		myGraph.addEdge(1, 4);
		myGraph.addEdge(2, 3);
		myGraph.addEdge(3, 1);
		myGraph.addEdge(4, 0);
		myGraph.addEdge(4, 3);

		
		Object[] values = myGraph.adj(4);  //give me the data that adjacent/neighbor to this vertex contains 4
		
		for(Object val : values) {
			System.out.println(val);
		}
		
		
		BetterGraph myGraph2 = new BetterGraph(5, "directed");
		myGraph2.addVertex("State");
		myGraph2.addVertex("Avenel");
		myGraph2.addVertex("Elm");
		myGraph2.addVertex("Pocono");
		myGraph2.addVertex("William");
		
		
		myGraph2.addEdge("State", "Avenel");
		myGraph2.addEdge("State", "Elm");
		myGraph2.addEdge("Elm", "Avenel");
		myGraph2.addEdge("Elm", "William");
		myGraph2.addEdge("William", "State");
		myGraph2.addEdge("William", "Pocono");
		myGraph2.addEdge("Avenel", "Pocono");
		myGraph2.addEdge("Pocono", "Elm");
		
		myGraph2.print();
		
		
		
		
		

	}

}
