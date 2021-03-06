package game.network.messages;

import game.network.NetPlayer;

import java.io.Serializable;

/**
 * Leave game message
 * @author clement
 *
 */
public class LeaveGameMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private NetPlayer creator;
	private NetPlayer player;
	
	public LeaveGameMessage(NetPlayer c, NetPlayer p) {
		creator = c;
		player = p;
	}

	public NetPlayer getCreator() {
		return creator;
	}

	public void setCreator(NetPlayer creator) {
		this.creator = creator;
	}

	public NetPlayer getPlayer() {
		return player;
	}

	public void setPlayer(NetPlayer player) {
		this.player = player;
	}

}
