package abstractMethod.factory;

import abstractMethod.domain.gamecharacters.bomb.Bomb;
import abstractMethod.domain.gamecharacters.fighter.Fighter;
import abstractMethod.domain.gamecharacters.moster.Monster;
import abstractMethod.domain.gamecharacters.rocket.Rocket;
import abstractMethod.domain.gamecharacters.ship.Ship;
import abstractMethod.service.bomb.BombLevel1;
import abstractMethod.service.fighter.FigtherLevel1;
import abstractMethod.service.monster.MonsterLevel1;
import abstractMethod.service.rocket.RocketLevel1;

public class GameLevel1Factory extends GameFactory{

	@Override
	public Monster createMonster() {

		return new MonsterLevel1();
	}

	@Override
	public Ship createShip() {
		
		throw new UnsupportedOperationException("does not support ship at level 1");
	}

	@Override
	public Rocket createRocket() {
	
		return new RocketLevel1();
	}

	@Override
	public Bomb createBomb() {
		
		return new BombLevel1();
	}

	@Override
	public Fighter createFigther() {
		
		return new FigtherLevel1();
	}

	
}
