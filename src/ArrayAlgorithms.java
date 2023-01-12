import java.util.Locale;

public class ArrayAlgorithms
{
    // ADD THE FOLLOWING THREE METHODS TO THE OTHER TEN IN THIS CLASS!

    /** Returns the length of the longest String(s) in an array of Strings.
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  length of the longest String in the array
     */
    public static int longestString(String[] stringList) {
        int lengthOfLongest = 0;
        for (String word : stringList) {
            if (word.length() > lengthOfLongest) {
                lengthOfLongest = word.length();
            }
        }
        return lengthOfLongest;
    }

    /** Changes all words in an array of words to uppercase.
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void makeUppercase(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    /** Returns true if ANY of the ints in numList are positive, otherwise,
     *  returns false.
     *
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints; does not get modified
     *  @return  true if any element of numList is positive, false otherwise
     */
    public static boolean containsPositive(int[] numList)
    {
       for (int num :  numList) {
           if (num > 0) {
               return true;
           }
       }
        return false;
    }

    /** Returns true if ANY of the Strings in stringList contain searchStr,
     *  otherwise, returns false. Your method should NOT be case sensitive, e.g.
     *  searching for "ma" should be found in the String "Maddox" and searching
     *  for "MA" should be found in String "mad"
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @param searchStr  the String to search each element of stringList
     *  @return  true if any element of stringList contains searchStr, otherwise
     *           returns false
     */
    public static boolean containsString(String[] stringList, String searchStr)
    {
        for (String str : stringList) {
            if (str.toUpperCase().contains(searchStr.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    /** Returns a NEW array of Strings that contains all words from the original
     *  array of strings in lowercase.
     *
     *  Does NOT mutate (modify) original wordList
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, not modified by method
     *  @return  new array of Strings in all lowercase
     */

    public static String[] makeLowercase(String[] wordList)
    {
        String [] lowerCaseWordList = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++) {
            lowerCaseWordList[i] = wordList[i].toLowerCase();
        }
        return lowerCaseWordList;
    }

    /** Returns a NEW array of ints that contains the higher value of each pair
     *  of elements at the same index in two other equally-sized arrays of ints
     *  For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8},
     *  this method returns the array {2, 7, 6, 1, 8}, where each value is the
     *  higher of the two at that respective index in the two original arrays
     *
     *  Does NOT mutate (modify) EITHER array
     *  PRECONDITION: intArr1.length == intArr2.length
     *
     *  @param intArr1  first array of ints
     *  @param intArr2  second array of ints, having the same length as intArr1
     *  @return  new array of ints representing the higher values
     */

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2)
    {
        int[] max = new int[intArr1.length];
        for (int i = 0; i < max.length; i++) {
            if (intArr1[i] >= intArr2[2]) {
                max[i] = intArr1[i];
            } else {
                max[i] = intArr2[i];
            }
        }
        return max;
    }

    /** Returns the number of Strings in stringList that have an exclamation point
     *  ("!") at the end.
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  number of Strings in stringList that end in "!"
     */
    public static int howManyExclamations(String[] stringList)
    {
        int counter = 0;
        for (String str : stringList) {
            if (str.charAt(str.length()-1) == '!') {
                counter++;
            }
        }
        return counter;
    }

    /** Returns the number of elements in the numList array that have the same
     *  value as the element immediately adjacent to the right in the array.
     *  (BE CAREFUL not to go out of bounds!)
     *  For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *  this method would return 5, since there are five numbers in the array that
     *  are equal to the number immediately to the right (shown below in blue):
     *                    {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  number of elements in numList that are equal to the element
     *           adjacent to the right of the element in the array
     */
    public static int countConsecutiveDoubles(int[] numList)
    {
        int counter = 0;
        for (int i = 0; i < numList.length - 1; i++) {
            if (numList[i] == numList[i + 1]) {
                counter++;
            }
        }
        return counter;
    }

    /** Returns a NEW array that contains all elements of the original numList,
     *  shifted to the left by one index; the first element of the array should
     *  wrap around and appear at the end.
     *  For example, given the array {5, 1, 3, 4, 7}, this method returns the
     *  array {1, 3, 4, 7, 5}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  array with elements in numList shifted by one index left
     */
    public static int[] shiftLeft(int[] numList)
    {
        int [] lftArray = new int[numList.length];
        for (int i = 0; i < lftArray.length - 1; i++) {
            lftArray [i] = numList[i + 1];
        }
        lftArray[lftArray.length - 1] = numList[0];
        return lftArray;
    }

    public static void shiftLeftModify(int[] numList)
    {
        int firstNumber = numList[0];
        for (int i = 0; i < numList.length - 1; i++) {
            numList [i] = numList[i + 1];
        }
        numList[numList.length - 1] = firstNumber;
    }

    // ADD THE FOLLOWING METHODS TO THE OTHERS IN THIS CLASS!

    /** Shifts all elements in numList to the LEFT shiftNum places;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The first shiftNum elements of the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6} and shiftNum = 2, this method MODIFIES
     *  the array to {3, 4, 7, 6, 5, 1} (all elements shifted left
     *  two with the first two elements wrapping around to the back)
     *  And given the array {5, 1, 3, 4, 7, 6} and shiftNum = 4,
     *  this method modifies the array to {7, 6, 5, 1, 3, 4}
     *
     *  Assume shiftNum <= numList.length (precondition)
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *  PRECONDITION: shiftNum <= numList.length
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void shiftNumLeftModify(int[] numList, int shiftNum)
    {
        for (int loop = 0; loop < shiftNum; loop++) {
            shiftLeftModify(numList);
        }
    }

    public static void shiftNumLeftModify2(int[] numList, int shiftNum){
        String arrayAsString = "";
        for (int number : numList) {
            arrayAsString += number + " ";
        }
        int space = arrayAsString.indexOf(" ");
        for (int i = 0; i < shiftNum; i++) {
            arrayAsString = arrayAsString.substring(space + 1) + arrayAsString.substring(0, space + 1);
            space = arrayAsString.indexOf(" ");
        }
        for (int i = 0; i < numList.length ; i++) {
            numList[i] = Integer.parseInt(arrayAsString.substring(0, space));
            arrayAsString = arrayAsString.substring(space + 1);
            space = arrayAsString.indexOf(" ");
        }
    }

    /** Shifts all elements in numList to the RIGHT shiftNum places;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The last shiftNum elements of the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6} and shiftNum = 2, this method MODIFIES
     *  the array to {7, 6, 5, 1, 3, 4} (all elements shifted right
     *  two with the last two elements wrapping around to the front)
     *  And given the array {5, 1, 3, 4, 7, 6} and shiftNum = 4,
     *  this method modifies the array to {3, 4, 7, 6, 5, 1}
     *
     *  Assume shiftNum <= numList.length (precondition)
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *  PRECONDITION: shiftNum <= numList.length
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void shiftNumRightModify(int[] numList, int shiftNum)
    {
        for (int loop = 0; loop < numList.length % shiftNum; loop++) {
            int firstNumber = numList[0];
            for (int i = 0; i < numList.length - 1; i++) {
                numList [i] = numList[i + 1];
            }
            numList[numList.length - 1] = firstNumber;
        }
    }
}