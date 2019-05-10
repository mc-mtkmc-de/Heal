package de.heal.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.heal.command.HealCommand;

public class Heal extends JavaPlugin {
	
	private static Heal plugin;
	
	public void onEnable() {
		plugin = this;
		
		getCommand("heal").setExecutor(new HealCommand());
		
	}
	
	public static Heal getplugin() {
		return plugin;
	}

}
