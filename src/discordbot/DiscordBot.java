/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discordbot;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

/**
 *
 * @author Srle
 */
public class DiscordBot {

    
    public static JDA jda;
    public static final String BOT_TOKEN = "Mjk0ODU1OTQyMjMzNzg0MzIy.C7bOGg.HDOhP3SEv_6RoI5yaDimNpie91A";
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            jda = new JDABuilder(AccountType.BOT).addListener(new EventListener()).setToken(BOT_TOKEN).buildBlocking();
        } catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException ex) {
            Logger.getLogger(DiscordBot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
