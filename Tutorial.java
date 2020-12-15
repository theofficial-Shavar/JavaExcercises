public class Grid {
   
    public static void main(String[] args) {
    //create a character array using the [createAarray function]
   char[][] tempArray = createArray(10);
   
    printArray(tempArray);

    }
      
        public static char[][] createArray(int dimension) {
        char[][] charArray = new char[dimension][dimension];
        for (int row = 0; row < charArray.length; row++) {
            for (int col = 0; col < charArray[row].length; col++) {
                charArray[row][col] = '*';
            }
        }
        return charArray;
        }
        
      

        public static void printArray(char[][] array){
            for (int i = 0; i < array.length; i++) {
                System.out.print("\n");
                for (int j = 0; j < array[i].length; j++) {
                    char oddOrEven = j % 2 == 0 ? 'E' : '*';
                    array[i][j] = oddOrEven;
                    System.out.print("\t"  + "| " +   array[i][j]);

                }
            }
        }
     
}
