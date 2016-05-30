package com.mogames.mod.crafting;

import com.mogames.mod.blocks.MGBlocks;
import com.mogames.mod.items.MGItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MGSmelting {

	public static void initSmelting(){
		
		GameRegistry.addSmelting(MGBlocks.copperOre,new ItemStack(MGItems.copperIngot), 0.1F);
		GameRegistry.addSmelting(MGBlocks.NickelOre, new ItemStack(MGItems.NickelIngot), 0.5F);
		GameRegistry.addSmelting(MGBlocks.SapphireOre,new ItemStack(MGItems.Sapphire), 0.6F);	
		GameRegistry.addSmelting(MGBlocks.TitaniumOre,new ItemStack(MGItems.TitaniumIngot), 0.8F);	
		GameRegistry.addSmelting(MGBlocks.PlutoniumOre , new ItemStack(MGItems.PlutoniumIngot), 0.9F);
		GameRegistry.addSmelting(MGBlocks.AmyethystOre, new ItemStack(MGItems.Amyethyst), 0.7F);
		GameRegistry.addSmelting(MGBlocks.PeridotOre, new ItemStack(MGItems.Peridot), 0.8F);

	}
}
