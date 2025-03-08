package exercices.exercice3;

public class AnalysePhrase {

	public static int nombredemots(String phrase) {
		String[]mots = phrase.split("\\s+");
		return mots.length;
}
   public static String remplacerVoyelle(String phrase, char symbol) {
	   for(int i=0 ; i<phrase.length() ; i++) {
		   if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'y' ||
		            symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U' || symbol == 'Y') {
			phrase = phrase.replace(phrase.charAt(i), symbol);
		   }
	   }
	   return phrase;
	   }
   
   public static String inverserPhrase(String phrase) {
	   String[]mots = phrase.split("\\s+");
	   StringBuilder result = new StringBuilder();
       for(int i=phrase.length() ; i>0 ; i--) {
    	   result.append(mots[i]);
       }
       return result.toString();
   }
   }



