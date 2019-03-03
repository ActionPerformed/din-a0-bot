package bot.main;

import java.util.ResourceBundle;

import javax.security.auth.login.LoginException;

import com.jagrosh.jdautilities.command.CommandClientBuilder;

import bot.builder.DinBuilder;
import bot.commands.AuthorCommand;
import bot.commands.InfoBotCommand;
import bot.commands.RaffleCommand;
import bot.commands.SudoCommand;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Main extends ListenerAdapter{
	
	private static DinBuilder builder;

	public static void main(String[] args) throws LoginException, InterruptedException {
		System.out.println("TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		CommandClientBuilder commandClientBuilder = new CommandClientBuilder();
		commandClientBuilder.setOwnerId(System.getenv("DC_ID"));
        commandClientBuilder.setPrefix(">");
        commandClientBuilder.useDefaultGame();
        commandClientBuilder.addCommand(new AuthorCommand());
        commandClientBuilder.addCommand(new RaffleCommand());
        commandClientBuilder.addCommand(new InfoBotCommand());
        commandClientBuilder.addCommand(new SudoCommand());
		
		builder = new DinBuilder(AccountType.BOT);
		builder.setToken(System.getenv("DC_TK"));
		builder.addEventListener(commandClientBuilder.build());
		builder.buildAsync();
	}

	public static DinBuilder getBuilder() {
		return builder;
	}
	
	@Override
	public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
	    event.getChannel().sendMessage("Test");
	    return;
	}
	
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		event.getChannel().sendMessage("Test2");
	    return;
	}
	@Override
	public void onGenericEvent(Event event) {
		return;
}
}
