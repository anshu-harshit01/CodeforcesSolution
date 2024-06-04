public class RabinKarpAlgo{
	private static double PRIME = 101;
	public static void main(String[] args) {
		String pattern = "anshu";
		String text = "rahulaAshusaurabh";
		karpRabin(text, pattern);
	}
	public static double calculateHash(String str)
	{
		double hash = 0;
		for(int i=0; i<str.length(); i++)
		{
			hash = hash + str.charAt(i)*Math.pow(PRIME, i);
		}
		return hash;
	}
	public static double updateHash(double prevHash, char oldChar, char newChar, int patternLength)
	{
		double newHash = (prevHash - oldChar)/PRIME;
		newHash += newChar*Math.pow(PRIME, patternLength-1);
		return newHash;
	}
	public static void karpRabin(String text, String pattern)
	{
		int patternLen = pattern.length();
		int textLen = text.length();
		boolean patternFound = false;

		double textHash = calculateHash(text.substring(0, patternLen));
		double patternHash = calculateHash(pattern);

		for(int i=0; i<=textLen-patternLen; i++)
		{
			if(textHash == patternHash)
			{
				if(text.substring(i, i+patternLen).equals(pattern)){
					System.out.println("Pattern found at Index : "+i);
					patternFound = true;
				}
			}
			if(i<textLen-patternLen)
			{
				textHash = updateHash(textHash, text.charAt(i), text.charAt(i+patternLen), patternLen);
			}
		}
		if(!patternFound){
			System.out.println("pattern doesn't found");
		}
	}
}