import mainPackage.Game;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class gameUnitTests {

    private Game game;

    @BeforeEach
    public void setUp(){
        game = new Game();
    }

    @Test
    public void canRollAllZeros(){
        for(int i =0; i<20; i++){
            game.roll(0);
        }
        int actual = game.getScore();
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    public void canRollAllOnes(){
        for(int i =0; i<20; i++){
            game.roll(1);
        }
        int actual = game.getScore();
        Assertions.assertThat(actual).isEqualTo(20);
    }

//    @Test
//    public void canRollASpareFollowedBy1(){
//        game.roll(5);
//        game.roll(5);
//        game.roll(1);
//        for(int i =0; i<17; i++){
//            game.roll(0);
//        }
//        int actual = game.getScore();
//        Assertions.assertThat(actual).isEqualTo(12);
//    }
//
//    @Test
//    public void canRollAStrikeFollowedBy1then1(){
//        game.roll(10);
//        game.roll(1);
//        game.roll(1);
//        for(int i =0; i<17; i++){
//            game.roll(0);
//        }
//        int actual = game.getScore();
//        Assertions.assertThat(actual).isEqualTo(14);
//    }
}
