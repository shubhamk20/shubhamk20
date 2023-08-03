package array;

import java.util.HashSet;
import java.util.Set;

// LeetCode 36
// https://leetcode.com/problems/valid-sudoku/description/

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                         ,{'6','.','.','1','9','5','.','.','.'}
                         ,{'.','9','8','.','.','.','.','6','.'}
                         ,{'8','.','.','.','6','.','.','.','3'}
                         ,{'2','.','.','8','.','3','.','.','1'}
                         ,{'7','.','.','.','2','.','.','.','6'}
                         ,{'.','6','.','.','.','.','2','8','.'}
                         ,{'.','.','.','4','1','9','.','.','5'}
                         ,{'.','.','.','.','8','.','.','7','9'}};

        // for(int i=0; i<board.length; i++){
        //     for(int j=0; j<board[0].length; j++){
        //         System.out.print(board[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        System.out.println(isValidSudoku(board));
    }

    static boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            Set<Character> rowSet= new HashSet<Character>();
            Set<Character> colSet= new HashSet<Character>();
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(rowSet.contains(board[i][j])){
                        return false;
                    }else{
                        rowSet.add(board[i][j]);
                    }
                }
                if(board[j][i] != '.'){
                    if(colSet.contains(board[j][i])){
                        return false;
                    }else{
                        colSet.add(board[j][i]);
                    }
                }
            }
        }
        for(int i=0; i<9; i=i+3){
            for(int j=0; j<9; j=j+3){
                Set<Character> boardSet= new HashSet<Character>();
                for(int k=i; k<i+3; k++){
                    for(int l=j; l<j+3; l++){
                        if(board[k][l] != '.'){
                            if(boardSet.contains(board[k][l])){
                                return false;
                            }else{
                                boardSet.add(board[k][l]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
