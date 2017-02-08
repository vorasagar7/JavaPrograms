/* Implement of R Select

RSelect(int a[], int length, ith order statistic) */

if( a[] ==1)
	return a[0];
else
	Randomly select a pivot P from the array
	partition around P
	j=p
	if(j==i)
	{
		return j;
	}
	if( j < i)
	{
		RSelect(a[], n-j,i-j)
		
	}
	if(j > i)
	{
		Rselect (a[], j-1, i)
	}