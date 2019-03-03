package bot.commands;

import java.util.List;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

import bot.main.Main;
import bot.utils.StringUtils;

public class SudoCommand extends Command{
	public SudoCommand() {
        this.name = "sudo";
        this.aliases = new String[]{"sudo"};
        this.help = "Acceso restringido. ¡Ni se te ocurra entrar!";
    }

	@Override
	protected void execute(CommandEvent commandEvent) {
		List<String> argList = StringUtils.getArgsToList(commandEvent.getArgs());
		if(argList == null){
			commandEvent.reply("Comando inválido.");
		} else {
			String id = commandEvent.getAuthor().getId();
			String name = commandEvent.getAuthor().getName();
			switch (argList.get(0)) {
			case "login Autokadd":
				Main.getBuilder().getAccessMap().put(id, name);
				commandEvent.reply("Acceso concedido a " + name);
				commandEvent.replyInDm("Hola Autokadd.");
				break;
//			case "login":
//				Main.getBuilder().getAccessMap().put(id, name);
//				commandEvent.reply("Acceso concedido a " + name);
//				commandEvent.replyInDm("hola");
//				break;
//			case "logout":
//				Main.getBuilder().getAccessMap().remove(id);
//				commandEvent.reply("Acceso revocado a " + name);
//				break;
//			case "status":
//				commandEvent.reply("Acceso concedido a : " + Main.getBuilder().getAccessMap().values().toString());
//				break;
			default:
				Main.getBuilder().getAccessMap().remove(id);
				commandEvent.reply("Comando no permitido. Privilegios de sistema insuficientes.");
			}
		}
	}
}
