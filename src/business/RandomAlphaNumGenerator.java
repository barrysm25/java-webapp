package business;

import java.util.Random;

public class RandomAlphaNumGenerator {
	protected String getSaltString() {
		String SALTCHARS = "+/ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 17) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		System.out.println("RRR-" + saltStr);
		return saltStr;

	}

	public static void main(String[] args) {
		int[] accountIds = { 11727, 19846, 20651, 20719, 20808, 20811, 20894, 20917, 21286, 21301, 21381, 21393, 21771,
				21861, 22732, 22814, 22844, 22926, 22946, 23097, 38391, 38409, 38445, 38452, 38593, 38603, 38621, 38720,
				38961, 39675, 39911, 40534 };
		RandomAlphaNumGenerator rn = new RandomAlphaNumGenerator();
		for(int i=0;i <=31;i++){
		rn.getSaltString();
		}
		//for (int k:accountIds){
		//System.out.println(k);
		//}
	}
}
