package com.highalchhelper;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class HighAlchHelperPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(HighAlchHelperPlugin.class);
		RuneLite.main(args);
	}
}