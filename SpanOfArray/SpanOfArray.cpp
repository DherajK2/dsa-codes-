#include <iostream>
#include <limits>
using namespace std;

// function returns span
int findSpan(int arr[], int n) {

    int max = numeric_limits<int>::min();
    int min = numeric_limits<int>::max();

    for (int i = 0; i < n; i++) {
        if (arr[i] > max) max = arr[i];
        if (arr[i] < min) min = arr[i];
    }

    return max - min;
}

int main() {

    int n;
    cout << "Enter size of array: ";
    cin >> n;

    int arr[n];

    cout << "Enter elements:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int span = findSpan(arr, n);

    cout << "Span of Array: " << span << endl;

    return 0;
}