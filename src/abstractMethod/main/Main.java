package abstractMethod.main;

import abstractMethod.domain.gamecharacters.bomb.Bomb;
import abstractMethod.domain.gamecharacters.fighter.Fighter;
import abstractMethod.domain.gamecharacters.moster.Monster;
import abstractMethod.domain.gamecharacters.rocket.Rocket;
import abstractMethod.domain.gamecharacters.ship.Ship;
import abstractMethod.factory.GameFactory;
import abstractMethod.factory.GameLevel1Factory;
import abstractMethod.factory.GameLevel2Factory;

public class Main {

	
	public static void main(String[] args) throws Exception {
		
		GameFactory gameFactory = new GameLevel1Factory();
		Monster monster = gameFactory.createMonster();
		Bomb bomb = gameFactory.createBomb();
		Rocket rocket = gameFactory.createRocket();
		Fighter fighter = gameFactory.createFigther();
		
		monster.attack();
		bomb.bomb();
		rocket.toThrow();
		fighter.strike();
		
		System.out.println("-----------------");
		
		GameFactory gameFactory2 = new GameLevel2Factory();
		Monster monster2 = gameFactory2.createMonster();
		Bomb bomb2 = gameFactory2.createBomb();
		Rocket rocket2 = gameFactory2.createRocket();
		Ship ship2 = gameFactory2.createShip();
		Fighter fighter2 = gameFactory2.createFigther();
		
		monster2.attack();
		bomb2.bomb();
		rocket2.toThrow();
		ship2.shoot();	
		fighter2.strike();
		
	}
	
}
