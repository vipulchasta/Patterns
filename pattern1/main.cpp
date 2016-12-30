/*
E D C B A B C D E
  D C B A B C D
    C B A B C
      B A B
        A
*/


#include <iostream>

using namespace std;

int main()
{
    char c;
    cout << "Enter a Character(In Upper Case Only): ";
    cin >> c;

    if( c >= 'A' && c <= 'Z' )
        for( int i = (int)c ; i >= (int)'A' ; i-- )
        {
            for ( int j = c ; j > i ; j-- )
                cout << " " << " ";
            for ( int j = i ; j >= (int)'A' ; j-- )
                cout << (char)j << " ";
            for ( int j = (int)'B' ; j <= i ; j++ )
                cout << (char)j << " ";
            cout << endl;
        }
    else
        cout << "Wrong Input...Please try again.";
    return 0;
}
