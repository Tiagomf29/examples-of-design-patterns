package abstractMethod.factory;

import abstractMethod.domain.gamecharacters.bomb.Bomb;
import abstractMethod.domain.gamecharacters.fighter.Fighter;
import abstractMethod.domain.gamecharacters.moster.Monster;
import abstractMethod.domain.gamecharacters.rocket.Rocket;
import abstractMethod.domain.gamecharacters.ship.Ship;

public abstract class GameFactory {

	public abstract Monster createMonster();
	public abstract Ship createShip();
	public abstract Rocket createRocket();
	public abstract Bomb createBomb();
	public abstract Fighter createFigther();
	
}
