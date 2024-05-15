Getting Started
Prerequisites
To run this application, you need to have Java installed on your machine.

Installation
Clone this repository to your local machine:

git clone https://github.com/your-username/high-score.git

Navigate to the project directory:
cd high-score


USAGE

Compile the Java files:
javac com/amukelani/chauke/high/score/*.java
Run the Main class with the filename of the CSV data as a command-line argument:
java com.amukelani.chauke.high.score.Main path/to/your/TestData.csv



Replace path/to/your/TestData.csv with the actual path to your CSV file containing test scores.


How It Works
Data Reading: The application reads data from a CSV file specified by the user as a command-line argument.

Data Transformation: It transforms the raw string data into a list of TestScore objects.

Ranking: It ranks the test scores to identify the top scorers.

Output: Finally, it displays the top scorers along with their scores.
