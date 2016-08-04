package sort;

import movies.MoviesMain;

public class Sort{
	public void sorter(){
		int temp;
		for (int outer = 1; outer < 10; outer++) {
			for (int inner = outer; inner > 0; inner--) {
				if (MoviesMain.movieEnd[inner] < MoviesMain.movieEnd[inner - 1]) {
					temp = MoviesMain.movieEnd[inner];
					MoviesMain.movieEnd[inner] = MoviesMain.movieEnd[inner - 1];
					MoviesMain.movieEnd[inner - 1] = temp;
					temp = MoviesMain.movieStart[inner];
					MoviesMain.movieStart[inner] = MoviesMain.movieStart[inner - 1];
					MoviesMain.movieStart[inner - 1] = temp;
				}
			}
		}
	}

}
