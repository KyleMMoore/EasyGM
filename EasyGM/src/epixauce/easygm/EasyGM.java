/* Created by Kyle Moore (Epixauce)
 * Created for free and personal use when testing individual plugins without needing
 * something heavy like essentials for /gm
*/
package epixauce.easygm;

import org.bukkit.plugin.java.JavaPlugin;

public class EasyGM extends JavaPlugin{
	public void onEnable(){
		this.getCommand("gm").setExecutor(new GamemodeCommand());
	}
	public void onDisable(){
		
	}
}
