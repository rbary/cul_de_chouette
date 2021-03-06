package game.network.messages;

import game.network.NetPlayer;

import java.io.Serializable;

/**
 * Kick player message
 * @author clement
 *
 */
public class KickPlayerMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	NetPlayer creator;
	NetPlayer player;
	public KickPlayerMessage(NetPlayer c, NetPlayer p) {
		this.creator = c;
		this.player = p;
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
