
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class activity
{ 
	
	public static void print(int s[], int f[], int n) 
	{ 
	
	int i=0;
	

	
	
	for (int j = 1; j < n; j++) 
	{ 
		
		if (s[j] >= f[i]) 
		{ 
			System.out.print(j+" "); 
			i = j; 
		} 
	} 
	} 
	
	
	public static void main(String[] args) 
	{ 
	int s[] = {1, 3, 0, 5, 9, 5}; 
	int f[] = {3, 3, 5, 7, 8, 9}; 
	int n = s.length; 
		
	print(s, f, n); 
	} 
	
} 
