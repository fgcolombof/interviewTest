# interviewTest
Practical exercise solved for Cloudpay job interview

Software Requeriments:
- Java 8 and above
- Maven 3.6.3.

Here are the instructions for execution:
- Download the repository.
- Navigate to the "/interviewTest" folder using the command line. If you are using an IDE, you should import this project into your preferred IDE, and the following steps will be performed according to the IDE's capabilities.
- Execute the command "mvn install" in the command line. This will download the necessary dependencies and generate the required classes.
- After that, run the command "mvn test" to execute the tests, and you will be able to see different cases and their results.

Algorithm explanation:

The logic behind the algorithm is to process the input string character by character.
Whenever a different character is encountered, it is appended to the output string, 
and the algorithm proceeds to count consecutive occurrences of that character.
If subsequent characters match the previous one, their count is determined and added 
to the output string along with the character itself. This process continues, 
allowing the algorithm to compress the output string, reducing its length relative
to the input string.

Some other considerations:

This algorithm will lose efficiency when the input strings have few repetitions and 
when the repetitions occur in groups of a maximum of 2 positions. It will achieve 
its highest efficiency when there are occurrences of groups with three or more 
identical characters.
