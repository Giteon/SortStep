import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    for(int outer = 0; outer < list.length-1;outer++)
    {
      for (int inner = 0; inner < list.length-1;inner++)
      {
        if (list[inner] > list[inner + 1])
        {
          int temp = list[inner];

          list[inner] = list[inner + 1];

          list[inner + 1] = temp;
        }
      }
    }
  }

  public void selectionSort(int[] list)
  {
    int flag, temp;

  for (int outer = 0; outer < list.length - 1; outer++)

  {

    flag = outer;  

    for (int inner = outer + 1; inner < list.length;inner++)

    {

      if (list[inner] < list[flag])

      {

        flag = inner;

      }

    }

    //swap list[outer] & list[flag]

    temp = list[outer];

    list[outer] = list[flag];

    list[flag] = temp;

  }
  }

  public void insertionSort(int[] list)
  {
    for (int outer = 1; outer < list.length; outer++)

  {

    int position = outer;

    int key = list[position];

    // Shift larger values to the right

    while (position > 0 && list[position - 1] > key)

    {

      list[position] = list[position - 1];

      position--;

    }

    list[position] = key;

  }
  }

 private void merge(int[] a, int first, int mid, int last)
  {
    int [] pos = new int[a.length];
    int frontPos = first; 
    int backPos = mid +1;
    
    for(int i = first; i <= last; i++)
    {
      if (frontPos > mid)
      {
        pos[i] = a[backPos];

        backPos++;
      }
      else if (backPos > last)
      {
        pos[i] = a[frontPos];
        frontPos++;
      }
      else if (a[frontPos] < a[backPos])
      {
        pos[i] = a[frontPos];
        frontPos++;
      }
      else if (a[frontPos] > a[backPos])
      {
        pos[i] = a[backPos]; 
        backPos++; 
      }
    }
    for(int j = first; j <=last; j++)
    {
        a[j] = pos[j];
    }
  }

  public void mergeSort(int[] a, int first, int last)
  {   
     int mid = (first + last)/2;

     if(first < last)
     {
      mergeSort(a, first, mid);
      mergeSort(a, mid+1, last);
     }


    merge(a, first, mid, last) ; //merge them together!
  }
}

