#include <stdio.h>

int main(int argc, char const *argv[])
{
	// define coins and money here
	int coin[] = {1,2,5,7};
	int money = 67;
	int size = sizeof(coin)/sizeof(int);

	int coinUsed[money+1];
	int addedCoin[money+1];

	// start recording used coins and number
	coinUsed[0] = 0;
	for (int i = 1; i <= money; i++) {
		// i must be the max(or bigger than) num of coins used
		int mincoin = i;
		for (int j = 0; j < size; j++) {
			// find the minium number of coins when money equals i
			if (coin[j] > i) {
				continue;
			} else {
				if (coinUsed[i - coin[j]] + 1 < mincoin) {
					mincoin = coinUsed[i - coin[j]] + 1;
					addedCoin[i] = coin[j];
				}	
			}
		}
		coinUsed[i] = mincoin;
	}



	printf("Coins used %d charge for %d\n", coinUsed[money], money);
	printf("Used coins:");
	while(money > 0) {
		printf("%d, ", addedCoin[money]);
		money -= addedCoin[money];
	}
	printf("\n");

	return 0;
}