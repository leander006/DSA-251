class Q3 {
    static void bubbleSort(int[] arr, int n) {

		// This is used to skip extra iterations in case of sorted array.
		boolean flag;

		for (int i = 0; i < n - 1; i++) {
			flag = false;

			for (int j = 0; j < n - i - 1; j++) { 

                // If the adjacent element is not sorted, swap the elements.
				if (arr[j] > arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
					flag = true;
				}
			}
            
			// If the array is already sorted, break from the current loop iteration.
			if (flag == false) {
				break;
			}
		}

		return;
	}
}