package com.highalchhelper;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

/*
	What is it?
		High Alchemy Helper

	What does it do?
		Show information related to profitable items

	Who is this for?
		A) Players who like to purchase items off the GE for the purpose of casting high alchemy to turn a profit.
		B) Players who would like to know which items in their possession are profitable through high alchemy.
		C) Players who would like to know which items are worth looting for the purpose of casting high alchemy.

	What features will it have?
		1) Detect and display an items base high alchemy value
		2) Detect current GE market price of nature runes and items
		3) Display profit based on current GE market prices, example: HA - ITEM - RUNE = PROFIT
		4) Track items quantities and prices when obtained, including different prices for the same item
		5) Display profit margins on the GE interface
		6) Display HA value for dropped items

	What features have been implemented?
		None

	How will you go about implementing these features?
		I have no idea at the moment, I'm still trying to figure that out.
 */

@Slf4j
@PluginDescriptor(
	name = "High Alch Helper"
)
public class HighAlchHelperPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private HighAlchHelperConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("High Alch Helper started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("High Alch Helper stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		//if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		//{
		//	client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
		//}


	}

	@Provides
	HighAlchHelperConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(HighAlchHelperConfig.class);
	}
}
