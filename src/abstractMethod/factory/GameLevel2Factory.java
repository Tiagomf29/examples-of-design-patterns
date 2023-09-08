package abstractMethod.factory;

import abstractMethod.domain.gamecharacters.bomb.Bomb;
import abstractMethod.domain.gamecharacters.fighter.Fighter;
import abstractMethod.domain.gamecharacters.moster.Monster;
import abstractMethod.domain.gamecharacters.rocket.Rocket;
import abstractMethod.domain.gamecharacters.ship.Ship;
import abstractMethod.service.bomb.BombLevel2;
import abstractMethod.service.fighter.FigtherLevel2;
import abstractMethod.service.monster.MonsterLevel2;
import abstractMethod.service.rocket.RocketLevel2;
import abstractMethod.service.ship.ShipLevel2;

public class GameLevel2Factory extends GameFactory{

	@Override
	public Monster createMonster() {
		
		return new MonsterLevel2();
	}

	@Override
	public Ship createShip() {
	
		return new ShipLevel2();
	}

	@Override
	public Rocket createRocket() {
	
		return new RocketLevel2();
	}

	@Override
	public Bomb createBomb() {
	
		return new BombLevel2();
	}

	@Override
	public Fighter createFigther() {
		
		return new FigtherLevel2();
	}

	

}
