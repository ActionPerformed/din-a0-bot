package bot.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

	public static List<String> getArgsToList(String args){
		List<String> result = new ArrayList<String>();
		if(args == null) {
		 return null;
		}
		String[] argsArray = args.split("-");
		for (String argument : argsArray) {
			argument = argument.trim();
			if (!argument.isEmpty()){
				result.add(argument);
			}
		}
		if(result.isEmpty()){
			return null;
		} else {
			return result;
		}
	}
}
