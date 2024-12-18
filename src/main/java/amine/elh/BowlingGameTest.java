package amine.elh;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;


public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void setUp() {
        game = new BowlingGame();
    }

// Gone With Refactoring
//    @Test
//    public void canMakeGame(){
//        new BowlingGame();
//    }

//    @Test
//    public void canRollBall(){
//        BowlingGame game=new BowlingGame();
//        game.roll(0);
//    }

    @Test
    public void canScoreGutterGame(){
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(),is(0));
    }

    @Test
    public void canScoreGameOfOnes(){
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score(),is(20));
    }

    @Test
    public void canScoreSpareFollowedByThree(){

        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(),is(16));
    }


    @Test
    public void canScoreStrikeFollowedByThreeThenThree(){

        game.roll(10 ,3,3, 0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(),is(22));
    }

    @Test
    public void canScorePrefectGame(){
        game.roll(10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,10,10,10);
        assertThat(game.score(),is(300));
    }



    //////////////////////////////////////////////


}
