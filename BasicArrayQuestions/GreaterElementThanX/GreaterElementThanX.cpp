#include <iostream>
using namespace std;

// function returns count of elements > X
int countGreater(int arr[], int n, int x) {

    int count = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] > x) {
            count++;
        }
    }

    return count;
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

    int x;
    cout << "Enter X: ";
    cin >> x;

    int result = countGreater(arr, n, x);

    cout << "Count of elements greater than " << x << " = " << result << endl;

    return 0;
}