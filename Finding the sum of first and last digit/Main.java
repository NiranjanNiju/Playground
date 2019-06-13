#include <stdio.h>
int main() {
	int n,temp,id,fd,sum;
  scanf("%d",&n);
  temp=n;
  id=n%10;
  while(n>=10)
  {
    n/=10;
  }
  fd=n;
  sum=fd+id;
  printf("%d",sum);
	return 0;
}