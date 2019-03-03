package bot.builder;

import java.util.HashMap;
import java.util.Map;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;

public class DinBuilder extends JDABuilder{
	
	private Map<String, String> accessMap;

	public DinBuilder(AccountType accountType) {
		super(accountType);
		accessMap = new HashMap<>();
	}

	public Map<String, String> getAccessMap() {
		return accessMap;
	}

	public void setAccessMap(Map<String, String> accessMap) {
		this.accessMap = accessMap;
	}
}
