package bot.commands;

import java.util.List;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

import bot.utils.MathUtils;
import bot.utils.StringUtils;

public class RaffleCommand extends Command{
	public RaffleCommand() {
        this.name = "sorteo";
        this.aliases = new String[]{"st"};
        this.help = "Realiza un sorteo. Ej: >SORTEO -Roxx -Taimi -Logan";
    }

	@Override
	protected void execute(CommandEvent commandEvent) {
		List<String> participants = StringUtils.getArgsToList(commandEvent.getArgs());
		String winner = (String) MathUtils.pickRandomFromList(participants);
		commandEvent.reply("El ganador es ... [Cálculos ininteligibles] ... " + winner + ".");
	}
}
