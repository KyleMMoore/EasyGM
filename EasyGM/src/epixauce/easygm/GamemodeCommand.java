package epixauce.easygm;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String arg,
			String[] sRay) {
		if(sender instanceof Player){
			Player p = (Player) sender;
			if(sRay.length==0 || sRay.length>1){
				return false;
			}
			int mode;
			try{
				mode = Integer.parseInt(sRay[0]);
			}catch(NumberFormatException e){
				return false;
			}
			
				switch(mode){
				case 0: p.setGameMode(GameMode.SURVIVAL); p.sendMessage(ChatColor.GRAY+"Gamemode set to Survival.");
				break;
				case 1: p.setGameMode(GameMode.CREATIVE); p.sendMessage(ChatColor.GRAY+"Gamemode set to Creative.");
				break;
				case 2: p.setGameMode(GameMode.ADVENTURE); p.sendMessage(ChatColor.GRAY+"Gamemode set to Adventure.");
				break;
				case 3: p.setGameMode(GameMode.SPECTATOR); p.sendMessage(ChatColor.GRAY+"Gamemode set to Spectator.");
				break;
				default: 
					return false;
				}
			return true;
		}else{
			return false;
		}
	}
	
}
