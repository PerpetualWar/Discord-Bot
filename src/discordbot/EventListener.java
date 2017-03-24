/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discordbot;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 *
 * @author Srle
 */
public class EventListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(event.getMessage().getRawContent().equalsIgnoreCase("ping")) {
            event.getChannel().sendMessage(event.getAuthor().getAsMention()+ " Pong!").queue();
        }
        
    }
    
}
