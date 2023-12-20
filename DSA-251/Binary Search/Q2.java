class Q2 {
     public static int search(int arr[], int target, int s, int e) {
            if (s > e) {
                  return -1;
            }
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                  return mid;
            }

            // On line 1
            if (arr[s] <= arr[mid]) {
                  // On left side
                  if (arr[s] <= target && target <= arr[mid]) {
                        return search(arr, target, s, mid - 1);
                  }

                  // On right side
                  else {
                        return search(arr, target, mid + 1, e);
                  }
            }

            // On line 2
            else {
                  // On right side
                  if (arr[mid] <= target && target <= arr[e]) {
                        return search(arr, target, mid + 1, e);
                  }

                  // On left side
                  else {
                        return search(arr, target, s, mid - 1);
                  }
            }
      }
    public static int search(int arr[], int key) {
        // Write your code here.
        return search(arr,key,0, arr.length-1);
    }
}