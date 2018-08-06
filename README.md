# MyIntToString

Write a class using the provided template and implement the following function:

public String MyIntToString(int value, int numbase);

<h3>where:</h3>

	value 	: is a 32-bit signed integer
	numbase : is any value between 2 and 16.

<h3>Requirements:</h3>

You are to demonstrate the algorithm to convert an integer to a string.

1) return an empty string if value is negative.
2) return an empty string if the conversion fails.
3) return the proper string of the value using characer '0' to '9' and 'A' to 'F'
  
For example:
  
	MyIntToString(254, 16) return "FE"
	MyIntToString(254,  8) return "376"
	MyIntToString(254,  2) return "11111110"


<h3>Rules:</h3>

1) You <b>SHALL NOT</b> import any Java libraries for the implementation.
2) You are allowed to using the string class related functions, like: insert(),appened, trim()and etc for the implementation
3) You SHALL NOT invoke static functions from <i>java.lang.Integer</i> class to perform the conversion.
4) Your code style is graded, hence it is encouraged to structure the code professionally and equipped with relevant comments.
5) Usage of helper functions are encouraged.
6) Integer.toString() is <b>NOT ALLOWED</b>
