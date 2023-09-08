package abstractMethod.service.fighter;

import abstractMethod.domain.gamecharacters.fighter.Fighter;

public class FigtherLevel1 implements Fighter{

	@Override
	public void strike() {
		
		System.out.println("Figther: hitting hard 1");
		
	}

}
