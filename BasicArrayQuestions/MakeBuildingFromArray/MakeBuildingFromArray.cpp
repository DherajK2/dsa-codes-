#include<iostream>
using namespace std;

void makeBuilds(int arr[],int size){
    int max = 0;
    for(int i=0;i<size;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    //Outer For Loop for moving to next line one by one
    for(int floor=max;floor>0;floor--){
        //This for loop is for printing 
        for(int i=0;i<size;i++){
            if(arr[i]>=floor){
                cout << "* ";
            }
            else{
                cout << "  ";
            }

        }
        cout << endl;
    }
}
int main(){
    int n;
        cout << "Enter size of array: ";
        cin >> n;

        int arr[n];

        cout << "Enter elements:" << endl;
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        makeBuilds(arr,n);
        return 0;
}

    