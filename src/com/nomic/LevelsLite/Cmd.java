package com.nomic.LevelsLite;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd implements CommandExecutor {
	
	private Main plugin;

	public Cmd(Main pl) {
		plugin = pl;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length == 0) {
			sender.sendMessage(ChatColor.RED + "Correct Usage: /levels reload");
		} else if (args.length == 1) {
			if (args[0].equals("reload")) {
				if ((sender.hasPermission("levels.reload")) || (!(sender instanceof Player)) || sender.isOp()) {
			    	plugin.reloadConfig();
			        sender.sendMessage(ChatColor.GREEN + "Levels Reloaded.");
				} else {
					sender.sendMessage(ChatColor.DARK_RED + "You dont have permission to perform this command!");
				}
			}
		}
		return true;
	}
}
