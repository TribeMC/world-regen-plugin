package Listener;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.Plugin;

import regenv3.main;

public class onBreak implements Listener {

	Plugin plugin;

	public onBreak(main main) {
		// TODO Auto-generated constructor stub
		main.getServer().getPluginManager().registerEvents(this, main);
		plugin = main;
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		replant(e.getBlock());
		
	}

	private void replant(Block block) {
		// TODO Auto-generated method stub
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				World w;
				
			}
		}, 40);
	}
}
