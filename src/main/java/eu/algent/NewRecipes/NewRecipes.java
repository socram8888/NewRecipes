package eu.algent.NewRecipes;

import org.bukkit.plugin.java.JavaPlugin;

public class NewRecipes extends JavaPlugin {

    public void onEnable() {
        // save default config.yml if it is missing.
        saveDefaultConfig();
        // Init
        new Recipes(this);
        getLogger().info(getName() + " has been enabled.");
    }

    public void onDisable() {
        getLogger().info(getName() + " has been disabled.");
    }
}
