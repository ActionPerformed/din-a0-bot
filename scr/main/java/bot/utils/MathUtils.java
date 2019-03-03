package bot.utils;

import java.util.List;

public class MathUtils {
	public static Object pickRandomFromList (List<?> list){
		int sizeSample = list.size();
		int itemChosen = (int) Math.abs(Math.random()*sizeSample);
		return list.get(itemChosen);
	}
}
