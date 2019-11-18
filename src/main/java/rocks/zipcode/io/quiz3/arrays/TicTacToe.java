package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this.board = new String[3][3];

    }

    public String[] getRow(Integer value) {
        String[] row = new String[3];
        for (int i = 0; i < 3; i++) {
            row[i] = board[value][i];


        }
        return row;

    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];


        }
        return column;

    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        for (int i = 0; i <= 1; i++) {
            if (board[rowIndex][i] != board[rowIndex][i + 1]) {
                return false;
            }
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        for (int i = 0; i <= 1; i++) {
            if (board[i][columnIndex] != board[i + 1][columnIndex]) {
                return false;
            }
        }
        return true;
    }


    public String getWinner() {
        String winner="";
        for (int i = 0; i < 3; i++) {

            if (isRowHomogenous(i)) {
                winner = (getRow(i)[i]);
            } else if (isColumnHomogeneous(i)) {
                winner = (getColumn(i)[i]);
            }else if (checkDiag()) {
                winner = board[1][1];
            }
        }
        return winner;
    }
    public Boolean checkDiag(){

        if (board[0][0] == board[1][1]&&board[1][1]==board[2][2] || board[0][2] == board[1][1] && board[1][1]== board[2][0]){
            return true;
        }
        return false;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
