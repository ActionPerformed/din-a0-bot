package bot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class InfoBotCommand extends Command{
	public InfoBotCommand() {
        this.name = "info";
        this.aliases = new String[]{"inf"};
        this.help = "Especificaciones técnicas del bot";
    }

	@Override
	protected void execute(CommandEvent commandEvent) {
		commandEvent.reply("Soy un gólem de protocolo social modelo Discord Intelligent Nanny series A0 [DIN-A0].");
	}
}
