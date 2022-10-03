package ch.bbw.sru.cluedo;

import ch.bbw.sru.cluedo.logic.GameLogic;
import ch.bbw.sru.cluedo.model.Crime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameLogicTests {

    private GameLogic gameLogic;

    private Crime suggestion;

    private Crime secret;

    private int numberOfSuggestion;

    private int maxNumberOfSuggestion;

    @BeforeEach
        private void setupBeforeEachTest() {
            gameLogic = new GameLogic();
            suggestion = new Crime();
            secret = new Crime();
    }

    @Test
    void ActorSuggestionNotEqualToSecret() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestion = 8;

        //setup secret
        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);

        //setup suggestion
        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        assertTrue(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestion));
    }

    @Test
    void ActorWeaponSceneNotEqualThenReturnFalseAndHistory0() {}

    ////////////////////////////////////////////////////////////////////////////////////

    @Test
    void ActorEqualWeaponSceneNotEqualThenReturnFalseAndHistory1() {}

    @Test
    void WeaponEqualActorSceneNotEqualThenReturnFalseAndHistory1() {}

    @Test
    void SceneEqualWeaponSceneNotEqualThenReturnFalseAndHistory1() {}

    ////////////////////////////////////////////////////////////////////////////////////

    @Test
    void ActorWeaponEqualSceneNotEqualThenReturnFalseAndHistory2() {}
    @Test
    void ActorSceneEqualWeaponNotEqualThenReturnFalseAndHistory2() {}
    @Test
    void WeaponSceneEqualActorNotEqualThenReturnFalseAndHistory2() {}

    ///////////////////////////////////////////////////////////////////////////////////

    @Test
    void ActorWeaponSceneEqualThenReturnTrueAndHistoryWin() {}

    ///////////////////////////////////////////////////////////////////////////////////

    @Test
    void MaxNumberOfSuggestionReachedAndNotWinThenReturnFalseAndHistoryNoneLeft() {}
}
