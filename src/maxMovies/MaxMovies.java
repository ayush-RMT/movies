package maxMovies;

import movies.MoviesMain;

public class MaxMovies {
	public void maxMovie(){
		System.out.println(MoviesMain.movieStart[0]);
		int temp=MoviesMain.movieEnd[0];
		int count=1;
		for (int outer = 1; outer < 10; outer++) {
			
			if (MoviesMain.movieEnd[outer] > temp) {
				if (MoviesMain.movieStart[outer] >= temp) {
					System.out.println(MoviesMain.movieStart[outer]);
					temp=MoviesMain.movieEnd[outer];
					count++;
				}
			}
		}
		System.out.println("The maximum number of shows possible is "+count);
	}

}
