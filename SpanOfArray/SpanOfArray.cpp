#include<iostream>
using namespace std;
int main(){
    int arr[]={5,3,4,11,9,2};

    int max=arr[0];
    int min=arr[0];
    int span=0;
    int n = sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    cout << "Max : " << max << endl;
    cout << "Min : " << min << endl;
    span = max - min;
    cout <<"Span of Array :" << span << endl;

    return 0;
}