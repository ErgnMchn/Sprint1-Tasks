Elementary Tasks
General requirements
1. When passing invalid parameters for execution, the application should not crash.
2. Running without parameters displays instructions for using the program.
3. Parameters are passed in the order given in the job description.
Tasks
1. Chess board
Draw a chessboard with the given dimensions of height and width, according to the principle:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
The program is launched by calling the main class with parameters.
2. Envelope Analysis
There are two envelopes with sides (a,b) and (c,d) to determine if one envelope can be put inside the 
other. The program must handle the input of floating point numbers. The program asks the user for envelope 
sizes one parameter at a time. After each calculation, the program asks the user if he wants to continue. If the 
user answers “y” or “yes” (case insensitive), the program continues from the beginning, otherwise it terminates 
the execution.
3. Sorting triangles
Develop a console program that prints triangles in descending order of their area. After adding each new 
triangle, the program asks if the user wants to add another one. If the user answers “y” or “yes” (case 
insensitive), the program will ask you to enter data for another triangle, otherwise it will output the result to 
the console.
• Calculation of the area of a triangle should be made according to Heron's formula.
• Each triangle is defined by the name and lengths of its sides.
Input format (separator - comma):
<name>, <side length>, <side length>, <side length>
• The application must handle floating point input.
• Input must be case insensitive, spaces, tabs.
• The data output should be the following example:
============= Triangles list: ================
1. [Triangle first]: 17.23cm
2. [Triangle 22]: 13cm
3.[Triangle 1]: 1.5cm
4. File parser
You need to write a program that will have two modes:
1. Count the number of occurrences of a string in a text file.
2. Replace a line with another one in the specified file
The program must accept input arguments at startup:
1. <path to file> <string to count>
2. <path to file> <string to search for> <string to replace>
2
5. Number in words
It is necessary to convert an integer to a capital version: 12 - twelve. The program is launched by calling 
the main class with parameters.