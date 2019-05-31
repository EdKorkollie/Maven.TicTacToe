package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] myMatrix;

    public Board(Character[][] matrix) {
        this.myMatrix = matrix;
    }

    public Boolean isInFavorOfX() {
        String letter = "";

        if((getrowsWinner()=="X" ) || getColWinner() == "X" || getdiagonal() == "X")
        {
            return  true;
        }
        else if (getrowsWinner() == "0" || getColWinner() == "0" || getdiagonal() == "0")
        {
            return false;
        }

        return false;

    }

    public Boolean isInFavorOfO() {

        if((getrowsWinner()=="X" )|| getColWinner() == "X" || getdiagonal() == "X")
        {
            return  false;
        }
        else if (getrowsWinner() == "O" || getColWinner() == "O" || getdiagonal() == "O")
        {
            return true;
        }



        return false;
    }

    public Boolean isTie() {
        if(getrowsWinner() =="X"  || getColWinner() == "X" || getdiagonal() == "X")
        {
            return  false;
        }
        else if (getrowsWinner() == "O" || getColWinner() == "O" || getdiagonal() == "O")
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    public String getWinner() {

        if((getrowsWinner()=="X" ) || getColWinner() == "X" || getdiagonal() == "X")
        {
            return  "X";
        }
        else if (getrowsWinner() == "O" || getColWinner() == "O" || getdiagonal() == "O")
        {
            return "O";
        }
        else
        {
            return "";
        }


    }


    public String getColWinner()
    {
        int col=3;
        String letter ="";
        for(int i = 0; i< col; i++)

        {
            if(myMatrix[0][0].equals(myMatrix[1][0]) && myMatrix[0][0].equals(myMatrix[2][0]))
            {
               letter = "X";
            }
            else if((myMatrix[0][1].equals(myMatrix[1][1]) && myMatrix[0][1].equals(myMatrix[2][1])))
            {
                letter = "O";
            }
            else if((myMatrix[0][2].equals(myMatrix[1][2]) && myMatrix[0][2].equals(myMatrix[2][2])))
            {
                 letter = "X";
            }
            else
            {
                return letter;
            }

        }

        return letter;
    }
    public String getrowsWinner()
    {
        int row = 3;
        String letter = "";
        for (int i = 0; i < row; i++)
        {
            if(myMatrix[0][0].equals(myMatrix[0][1]) && myMatrix[0][0].equals(myMatrix[0][2]))
            {
                letter = "O";
            }
            else if(myMatrix[1][0].equals(myMatrix[1][1]) && myMatrix[1][0].equals(myMatrix[1][2]))
            {
                letter = "X";
            }
            else if(myMatrix[2][0].equals(myMatrix[2][1]) &&myMatrix[2][0].equals(myMatrix[2][2]))
            {
                letter = "O";
            }
            else
            {
                letter = "";
            }
        }
        return letter;
    }
    public String getdiagonal ()
    {
        String letter = "";
        if(myMatrix[0][0].equals(myMatrix[1][1]) && myMatrix[0][0].equals(myMatrix[2][2]))
        {
            letter = "O";
        }
        else if(myMatrix[0][2].equals(myMatrix[1][1]) && myMatrix[0][2].equals(myMatrix[2][0]))
        {
            letter = "X";
        }
        else
        {
            letter = "";
        }
        return  letter;
    }



}


/**
 * public String getWinnerFromArray(Character[] array) {
 *
 *         if(array[0].equals(array[1]) && array[0].equals(array[2]))
 *         {
 *             return array[0].toString();
 *         }
 *         else
 *         {
 *             return null;
 *         }
 *     }
 *
 *     public String getWinnerFromRow(Character[][] array) {
 *          String winner;
 *         for(int i =0; i < 3; i++)
 *         {
 *             winner = getWinnerFromArray(array[i]);
 *
 *             if (winner != null)
 *             {
 *                 return ;
 *             }
 *
 *         }
 *       //return false;
 *
 *     }
 */