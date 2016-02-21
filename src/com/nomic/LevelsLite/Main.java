package com.nomic.LevelsLite;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		registerEvents();
	}
	
	public void registerCommands() {
		getCommand("levels").setExecutor(new Cmd(this));
	}

	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new ExpBottle(this), this);
	}
}
