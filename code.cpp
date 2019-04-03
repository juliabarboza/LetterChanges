#include <iostream>
#include <string>
using namespace std;

string LetterChanges(string str) { 

  for(int i=0;i<str.length();i++)
  {
    	if( (str[i]>='A' && str[i]<='Z') || (str[i]>='a' && str[i]<='z') )
        {
    			str[i]=str[i]+1;
       			if( str[i]=='a' || str[i]=='e' || 
                    str[i]=='i' || str[i]=='o' || str[i]=='u')
          			str[i]=str[i]-32;
        }
          
  }
  return str; 
            
}

int main() { 
  
  // keep this function call here
  cout << LetterChanges(gets(stdin));
  return 0;
    
}
