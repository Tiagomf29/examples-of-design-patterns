package abstractMethod.service.monster;

import abstractMethod.domain.gamecharacters.moster.Monster;

public class MonsterLevel1 implements Monster{

	@Override
	public void attack() {
		
		System.out.println("Monster: only scares opponent");
		
	}

	

	
}
