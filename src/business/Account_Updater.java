package business;

import java.util.Random;

public class Account_Updater {

	static Account_Updater au = new Account_Updater();

	public static void main(String[] args) {

		int[] accountIds = { 38974, 38975, 38976, 38977, 38978, 38979, 38980, 42142, 42143, 42144, 42145, 42146, 42147,
				42148, 42149, 42150, 42151, 42152, 42153, 42154, 42155, 42156, 42157, 42158, 42159, 42160, 42161, 42162,
				42163, 42164, 42165, 42166, 42167, 42168, 101138, 101139, 101140, 101141, 101142, 101143, 101144,
				101145, 101146, 101147, 101148, 101149, 101150 };
		for (int i=2725614;i<6504260;i++) {
			System.out.println("update transaction  set account_id = " + 
					+ Account_Updater.getRandom(accountIds) + "  where id = " + i+ ";");
		}

	}

	public static int getRandom(int[] accountIds) {
		int rnd = new Random().nextInt(accountIds.length);
		return accountIds[rnd];
	}

}