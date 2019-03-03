package bot.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class AuthorCommand extends Command{
	public AuthorCommand() {
        this.name = "autor";
        this.aliases = new String[]{"aut"};
        this.help = "Información sobre el autor del bot";
    }

	@Override
	protected void execute(CommandEvent commandEvent) {
		commandEvent.reply("Bot creado por Autokadd bajo licencia ASURA-CC0");
	}
}
