package abstractMethod.service.bomb;

import abstractMethod.domain.gamecharacters.bomb.Bomb;

public class BombLevel1 implements Bomb{

	@Override
	public void bomb() {
		
		System.out.println("Bomb: power explosion 10");
		
	}

	
}
