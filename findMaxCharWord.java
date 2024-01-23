package dailyChallenge_jan22;

public class findMaxCharWord {
	
	static String psLongestWord = "";
	static int  pnLongestchar = 0;

	public static void main(String[] args) {
		String psText = "luffy is still joyboy";
		String[] pcaWords = psText.split(" ");
		
		int nWordCount = 0;
		
		for(int i = 0;i< pcaWords.length; i++) {
			
			nWordCount = GetWordCount(pcaWords[i]);
			
			if (nWordCount > pnLongestchar) {
				pnLongestchar = nWordCount;
				psLongestWord = pcaWords[i];
			}
		}
		
		System.out.println("longest word is "+psLongestWord);
		System.out.println("no of characters in the longest word is "+pnLongestchar);
		
		
	}

	public static int GetWordCount(String wsWord) {
		
		char[] wnWordArray;
		int wnCount;
		
		
		wnWordArray = wsWord.toCharArray();
		wnCount = wnWordArray.length;
		// System.out.println("count: "+ wnCount);
		
		return wnCount;
	}

}
