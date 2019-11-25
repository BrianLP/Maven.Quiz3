package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;
    RockPaperScissorHandSign sign;

    public RockPaperScissorHandSign getWinner() {
        RockPaperScissorHandSign winner = null;
        if (this == ROCK) {
            winner = PAPER;
        }
        if (this == PAPER) {
            winner = SCISSOR;
        }
        if (this == SCISSOR) {
            winner = ROCK;
        }
        return winner;
    }

    public RockPaperScissorHandSign getLoser() {
        RockPaperScissorHandSign loser = null;
        if (this == ROCK) {
            loser = SCISSOR;
        }
        if (this == PAPER) {
            loser = ROCK;
        }
        if (this == SCISSOR) {
            loser = PAPER;
        }
        return loser;
    }
}
