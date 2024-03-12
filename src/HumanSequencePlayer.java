import java.util.HashMap;

import javax.swing.JButton;

public class HumanSequencePlayer extends ASequencePlayer {
	
	private HashMap<Integer, JButton> handMap;
	
	public HumanSequencePlayer(int number) {
		
		super(number);
		
		handMap = new HashMap<Integer, JButton>();
		
	}
	
	HashMap<Integer, JButton> getHandMap() {
		return handMap;
	}
	/*
        habilita todos los botones de la mano del jugador. 
        Itera sobre las entradas del HashMap y habilita cada botón asociado a una carta.
        */
	void enableAllHandCards() {
		for (HashMap.Entry<Integer, JButton> mapElement : handMap.entrySet()) { 
			mapElement.getValue().setEnabled(true);
		}
	}

}
