/*
When input is: 4
* 
* * 
* * 
* * * 
* * * 
* * * 
* * * * 
* * * * 
* * * * 
* * * *

Using Single Loop

*/

#include <iostream>

using namespace std;

int main()
{
    int n = 4;

    int j = 0;

    int lCount = 0;

    for( int i = 0 ; i <= j ; i++ )
    {
        if( i < j )
        {
            cout<<"* ";
        }
        else if ( i == j )
        {
            cout<<"*"<<endl;
            lCount++;

            if( lCount <= j &&  j < n )
            {
                i = -1;
            }
            else if( j < n )
            {
                i = -1;
                j++;
                lCount = 0;
            }
            if( j == n)
                break;
        }
    }
    return 0;
}
