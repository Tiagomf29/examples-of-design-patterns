package abstractMethod.service.ship;

import abstractMethod.domain.gamecharacters.ship.Ship;

public class ShipLevel2 implements Ship{

	@Override
	public void shoot() {
		
		System.out.println("Ship: 5 shot at a time");
		
	}



	
}
