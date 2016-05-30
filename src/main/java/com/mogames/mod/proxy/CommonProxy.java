package com.mogames.mod.proxy;


import com.mogames.mod.blocks.MGBlocks;
import com.mogames.mod.crafting.MGRecipes;
import com.mogames.mod.crafting.MGSmelting;
import com.mogames.mod.handler.MGDropHandler;
import com.mogames.mod.items.MGItems;
import com.mogames.mod.world.MGWorldGen;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent) {

		
		MGBlocks.initBlocks();
		MGItems.initItems();
		
		MGRecipes.initRecipe();
		MGSmelting.initSmelting();
	}
	
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new MGWorldGen(), 0);
		MinecraftForge.EVENT_BUS.register(new MGDropHandler());

		
	}

	public void postInit(FMLPostInitializationEvent postEvent) {
	
	}

}
