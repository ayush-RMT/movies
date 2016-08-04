package movies;

import sort.Sort;
import maxMovies.MaxMovies;

public class MoviesMain {
	public static int[] movieStart = { 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
	public static int[] movieEnd = { 11, 10, 13, 12, 16, 15, 16, 17, 19, 18 };
	public static void main(String args[]) {
		
		/*int temp;
		for (int outer = 1; outer < 10; outer++) {
			for (int inner = outer; inner > 0; inner--) {
				if (movieEnd[inner] < movieEnd[inner - 1]) {
					temp = movieEnd[inner];
					movieEnd[inner] = movieEnd[inner - 1];
					movieEnd[inner - 1] = temp;
					temp = movieStart[inner];
					movieStart[inner] = movieStart[inner - 1];
					movieStart[inner - 1] = temp;
				}
			}
		}*/
		Sort sort=new Sort();
		sort.sorter();
		
		
		MaxMovies maxMovies=new MaxMovies();
		maxMovies.maxMovie();
		/*System.out.println(movieStart[0]);
		int temp=movieEnd[0];
		int count=1;
		for (int outer = 1; outer < 10; outer++) {
			
			if (movieEnd[outer] > temp) {
				if (movieStart[outer] >= temp) {
					System.out.println(movieStart[outer]);
					temp=movieEnd[outer];
					count++;
				}
			}
		}
		System.out.println("The maximum number of shows possible is "+count);*/

	}
}
