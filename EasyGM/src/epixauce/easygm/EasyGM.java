package epixauce.easygm;

import org.bukkit.plugin.java.JavaPlugin;

public class EasyGM extends JavaPlugin{
	public void onEnable(){
		this.getCommand("gm").setExecutor(new GamemodeCommand());
	}
	public void onDisable(){
		
	}
}
