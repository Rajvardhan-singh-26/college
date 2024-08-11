#include<stdio.h>

void merge(int A,int B,int m,int n)

{
    int i=1 ;
    int j=1;
    int k=1; 
    int C;
   
    while(i<=m && j<=n)
    {
        C[k++]=A[i++];
    }
    else{
        C[k++]=A[i++];
    
    }
}
for(  ;i<=n;i++)
{
    C[k++]=A[i];
}
for(  ;j<=n;j++)
{
    C[k++]=B[j];
}

void mergesort(int l,int h){
    if(l<h)
    {
        mid(l+h)/2;
        meregsort(l,mid);
        mergesort(mid+1,h);
        merge(l,mid,h);
    }
}
void printArray(int arr[], int size) {
  for (int i = 0; i < size; i++)
    printf("%d ", arr[i]);
  printf("\n");
}



int main() 
  int arr[] = {6, 5, 12, 10, 9, 1};
  int size = sizeof(arr) / sizeof(arr[0]);

  mergeSort(arr, 0, size - 1);