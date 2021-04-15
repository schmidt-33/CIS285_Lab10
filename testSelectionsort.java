public void testMixed() {
	int[] arr = new int[5];
	arr[0] = -8;
	arr[1] = 9;
	arr[2] = -7;
	arr[3] = 10;
	arr[4] = -2;

	int[] Sortedarr = new int[5];
	Sortedarr[0] = -8;
	Sortedarr[1] = -7;
	Sortedarr[2] = -2;
	Sortedarr[3] = 9;
	Sortedarr[4] = 10;

	SelectionSort sort = new SelectionSort();
	arr = sort.basicSelectionSort(arr);

	for(int i = 0; i < arr.length; i++) {
		assertTrue(arr[i] == Sortedarr[i]);
	}
}

public void testDuplicate() {
	int[] arr = new int[5];
	arr[0] = 2;
	arr[1] = 6;
	arr[2] = 7;
	arr[3] = -10;
	arr[4] = 2;

	int[] Sortedarr = new int[5];
	Sortedarr[0] = -10;
	Sortedarr[1] = 2;
	Sortedarr[2] = 2;
	Sortedarr[3] = 6;
	Sortedarr[4] = 7;

	SelectionSort sort = new SelectionSort();
	arr = sort.basicSelectionSort(arr);

	for(int i = 0; i < arr.length; i++) {
		assertTrue(arr[i] == Sortedarr[i]);
	}
}
