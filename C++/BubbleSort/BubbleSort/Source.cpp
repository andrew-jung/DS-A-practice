#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;
void bubbleSort(int arr[], int s);

int main() {
	bool loopAgain = true;
	while (loopAgain) {
		// Create random size array, filled with random elements: .
		srand((unsigned int)time(NULL));

		int size = rand() % 20 + 10;
		cout << "Size of array: " << size << endl;
		int *arr = new int[size];

		// Insert random integers in new array random sized
		for (int i = 0; i < size; i++) {
			arr[i] = rand() % 100 + 1;
		}

		// Print array (pre):
		cout << "--- Printing array unsorted ---" << endl;
		for (int i = 0; i < size; i++) {
			cout << arr[i] << endl;
		}

		// Print array (sorted):
		bubbleSort(arr, size);
		cout << "--- Printing array after bubble sort ---" << endl;
		for (int i = 0; i < size; i++) {
			cout << arr[i] << endl;
		}

		delete[] arr; // Delete array memory

		cout << "Run again?: [y/n]" << endl;
		char a;
		cin >> a;
		loopAgain = a == 'y';
	}
	cout << "End" << endl;
	cin.get();
	return 0;
}

void bubbleSort(int arr[], int s) {
	int i, temp; // Temporary variables
	bool swapped = true;

	cout << "Size of array: " << s << endl; 	// Length of array, error handling

	while (swapped) {
		swapped = false;
		for (i = 1; i <= s - 1; i++) {
			if (arr[i - 1] > arr[i]) { // Check greater element
				temp = arr[i - 1]; // Hold temp value of original
				arr[i - 1] = arr[i]; // Swapping elements
				arr[i] = temp;
				swapped = true;
			}
		}
		s--;
	}
	return;
}