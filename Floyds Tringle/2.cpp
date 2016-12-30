/*
  *Floyds Tringle
  
  When input is 5
  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15
  
  Using Single Loop
*/

#include <iostream>

using namespace std;

int main()
{
    int n;
    cout << "Enter n: ";
    cin >> n;

    int countNum = 1;
    int j = 0;
    for( int i = 0 ; i < n ; i++ )
    {
        cout << countNum << " " ;
        countNum++;

        if( i==j )
        {
            cout << endl;
            if ( i == n-1 )
                break;
            j++;
            i = -1;
        }
    }
    return 0;
}
