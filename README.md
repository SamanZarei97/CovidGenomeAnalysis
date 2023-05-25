# CovidGenomeAnalysis
CovidGenomeAnalysis is a Java program that analyzes a DNA sequence by showing the nucleotide pairs for each nucleotide and counting the number of Adenine (A) present in the sequence. In DNA, Adenine pairs with Thymine (T), and Cytosine (C) pairs with Guanine (G).
## Usage
1- Compile the CovidGenomeAnalysis.java file using the Java compiler.

    javac CovidGenomeAnalysis.java

2- Run the program using the Java Virtual Machine (JVM).

    java CovidGenomeAnalysis
3- Enter the DNA sequence when prompted.

4-The program will display the nucleotide pairs for each nucleotide in the sequence and count the number of Adenine (A) present.

## Input Requirements
The program expects a DNA sequence as input. The DNA sequence can contain the following characters:

- Adenine (A)
- Thymine (T)
- Cytosine (C)
- Guanine (G)
## Output
The program performs the following analysis on the DNA sequence:

- It counts the number of Adenine (A) nucleotides present in the sequence.

- It replaces each nucleotide with its corresponding pair as follows:

    - Adenine (A) is replaced with Thymine (T).

    - Thymine (T) is replaced with Adenine (A).
    - Cytosine (C) is replaced with Guanine (G).
    - Guanine (G) is replaced with Cytosine (C).

The program then displays the number of Adenine nucleotides and the resulting nucleotide pairs.

## Example
    Enter the DNA sequence: ATCGAGCT

    3 TAGCTCGA

In this example, the input DNA sequence is "ATCGAGCT." The program determines that there are 3 Adenine (A) nucleotides in the sequence. It then replaces each nucleotide with its pair, resulting in the nucleotide pairs "TAGCTCGA."

Note: This program assumes that the input DNA sequence contains valid nucleotide characters. It does not perform any validation on the input sequence.













