/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raggedarrays;

/**
 *
 * @author hunnytaggy
 */
public class RaggedArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [][] animals = {{'M','O','N','K','E','Y'},
                             {'C','A','T'},
                             {'B','I','R','D'}
                            };
        
        for(int row=0; row < animals.length; row++){
            for(int col = 0; col < animals[row].length;col++){
                System.out.print(animals[row][col]);
            }
            System.out.println();
        }
    }
    
}
