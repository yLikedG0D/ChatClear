package utils.clear.liked;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Comandos implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player p = (Player)sender;
		
		if(cmd.getName().equalsIgnoreCase("clearchat")) {
			if(p.hasPermission("sender.cmd")) {
				
				String tag = PermissionsEx.getUser(p).getPrefix().replace("&", "§") + PermissionsEx.getUser(p).getSuffix().replace("&", "§"); 
				
				for(int i = 0; i < 105; i++) {
					Bukkit.broadcastMessage(" ");
				}
				Bukkit.broadcastMessage("§eChat do servidor foi limpado pelo§b " + tag + p.getName() + "§e.");
			} else {
				p.sendMessage("§cVocê não tem permissão para executar este comando.");
			}
		}
		
		return false;
	}
	
	

}
