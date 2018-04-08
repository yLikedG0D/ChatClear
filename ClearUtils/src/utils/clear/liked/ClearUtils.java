package utils.clear.liked;

import org.bukkit.plugin.java.JavaPlugin;


public class ClearUtils extends JavaPlugin {
	
	
	public void onEnable() {
		getCommand("clearchat").setExecutor(new Comandos());
	}
	
	public void onDisable() {
		
	}
}
