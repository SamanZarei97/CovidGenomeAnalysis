/**
 * This program shows nucleotide pair for of each nucleotides in the DNA
 * sequence and also counting the number of Adenine in the inserted sequence.
 * Adenine & Thymine are pair together, Cytosine & Guanine are pair together.
 */

import java.util.Scanner;

/**
 * This calss shows nucleotide pair for
 * each nucleotides in DNA sequence and count the number of Adenine.
 * Adenine(A), Thymine(T), Cytosine(C), Guanine(G)
 */
public class CovidGenomeAnalysis{

  private final static char ADENINE = 'A';
  private final static char THYMINE = 'T';
  private final static char CYTOSINE = 'C';
  private final static char GUANINE = 'G';

  /**
   * This method gets the DNA sequence, count the number of Adenine,
   * replacing nucleotide with its pair and shows the result.
   * @param args the command line arguments
   */
  public static void main(String[] args){

    Scanner gg = new Scanner(System.in);
    // Determing the nucleotide in DNA sequence by inserting it.
    String dnaSequence = gg.nextLine();
    // Showing the nucleotide pair of nucleotides in sequence.
    String Pair = "";
    // number of Adenine in the sequence;
    int numOfAdenin = 0;

    // Going through the DNA sequence.
    for(int i = 0; i < dnaSequence.length(); i++){
      // if we have Adenine, increment its number and replace it with Thymine.
      if(dnaSequence.charAt(i) == ADENINE){
        Pair = Pair + THYMINE;
        numOfAdenin++;
      }
      // If we have Thymine, replace it with Adenin.
      else if(dnaSequence.charAt(i) == THYMINE){
        Pair = Pair + ADENINE;
      }
      // If we have Cytosine, replace it with Guanine.
      else if(dnaSequence.charAt(i) == CYTOSINE){
        Pair = Pair + GUANINE;
      }
      // If we have Guanine, replace it with Cytosine.
      else if(dnaSequence.charAt(i) == GUANINE){
        Pair = Pair + CYTOSINE;
      }
    }
    // print the number of Adenin and nucleotide pair for each nucleotides.
    System.out.println(numOfAdenin + " " + Pair);
  }
}
