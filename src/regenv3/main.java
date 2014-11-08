package regenv3;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		new Listener.onBreak(this);
		super.onEnable();
	}
}
