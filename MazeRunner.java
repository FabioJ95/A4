public class MazeRunner {
	Maze mazeToSolve;
	A4Stack<MazeLocation> path;
	FilePrinter fileWriter;
	
	public MazeRunner(Maze aMaze) {
		mazeToSolve = aMaze;
		path = new A4Stack<MazeLocation>();
		fileWriter = new FilePrinter();
	}
	
	/*
	 * Purpose: Determines whether there is a path from start to finish in this maze
	 * Parameters: MazeLocation start - starting coordinates of this maze
	 *			   MazeLocation finish - finish coordinates of this maze
	 * Returns: true if there is a path from start to finish
	 */
	public boolean solve(MazeLocation start, MazeLocation finish) {
		fileWriter.println("Searching maze from start: "+start+" to finish: "+finish);
		path.push(start);
		return findPath(start, finish);
	}
	
	/*
	 * Purpose: Recursively determines if there is a path from cur to finish
	 * Parameters: MazeLocation cur - current cordinates in this maze
	 *			   MazeLocation finish - goal coordinates of this maze
	 * Returns: true if there is a path from cur to finish
	 *
	 * NOTE: This method updates the Maze's mazeData array when locations
	 *       are visited to an 'o', and further updates locations to an 'x'
	 *       if it is determined they lead to dead ends. If the finish 
	 *       location is found, the Stack named path should contain all of 
	 *       loations visited from the start location to the finish. 
	 */
	private boolean findPath(MazeLocation cur, MazeLocation finish) {
		int row = cur.row;
		int col = cur.col;
		mazeToSolve.setChar(row, col, 'o');
		fileWriter.println("\n"+mazeToSolve.toString());
		
		return false; // so it compiles
	}
	

	/*
	 * Purpose: Creates a string of maze locations found in the stack 
	 * Parameters: None
	 * Returns: A String representation of maze locations
	 */
	public String getPathToSolution() {
		String details = "";
		while(!path.isEmpty()) {
			details = path.pop() + "\n" + details;
		}	
		return details;
	}
	
	/*
	 * Purpose: Print the results of the maze run. Outputs the locations 
	 *          visited on the path from start to finish if the maze is 
	 *          solvable, or that no path was found if it is not.
	 * Parameters: boolean - whether or not the maze was solved
	 * Returns void - nothing
	 */
	public void printResults(boolean solved) {
		if (solved) {
			fileWriter.println("\n*** Maze Solved ***");
			fileWriter.println(getPathToSolution());
		} else {
			fileWriter.println("\n--- No path to solution found ---");
		}
		fileWriter.close();
	}
}