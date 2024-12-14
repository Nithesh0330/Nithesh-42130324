package basics;
import java.util.Scanner;
public class Given_a_boolean_only_0_and_1_2D_matrix_of_m_x_n_dimensions_where_each_row_is_sorted__Find_the_O_based_index_of_the_first_row_that_has_the_maximum_number_of_1s {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input dimensions of the matrix
	        System.out.print("Enter the number of rows (m): ");
	        int m = scanner.nextInt();
	        System.out.print("Enter the number of columns (n): ");
	        int n = scanner.nextInt();

	        // Initialize the matrix
	        int[][] matrix = new int[m][n];

	        // Input the matrix elements
	        System.out.println("Enter the elements of the matrix (0s and 1s only):");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Variables to track the row with the maximum number of 1's
	        int maxRowIndex = -1;
	        int maxOnes = 0;

	        // Iterate through each row to count 1's
	        for (int i = 0; i < m; i++) {
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if (matrix[i][j] == 1) {
	                    count++;
	                }
	            }
	            // Update if the current row has more 1's
	            if (count > maxOnes) {
	                maxOnes = count;
	                maxRowIndex = i;
	            }
	        }

	        // Output the result
	        System.out.println("The 0-based index of the row with the maximum number of 1's is: " + maxRowIndex);

	        scanner.close();
	   }
}


