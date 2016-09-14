package Lab10;

public class Movie {

		private String name;
		private String category;
		
		public Movie(String name, String category){
			this.name = name;
			this.category = category;
			
		}

		@Override
		public String toString() {
			return "\n" + name +" [Category:" + category + "]" ;
		}
		
		
		}
		

		

	





//movie class (array of 10 movies) 
		// every movie has a name and a category. - both are strings. there are getters and setteres in both of them.
		// the trick in this lab is taking a list of 10 and making a list of about 3 for them.
		// two class. a movie app class and a movie app.