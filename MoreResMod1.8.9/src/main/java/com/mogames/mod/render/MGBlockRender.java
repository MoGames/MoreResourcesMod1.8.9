package com.mogames.mod.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.mogames.mod.MGGlobal;
import com.mogames.mod.blocks.MGBlocks;
import com.mogames.mod.items.MGItems;

public final class MGBlockRender {

	public static void registerBlockRender(){		
		//Ores
		regBlock(MGBlocks.copperOre);
		regBlock(MGBlocks.RubyOre);
		regBlock(MGBlocks.SapphireOre);
		regBlock(MGBlocks.NickelOre);
		regBlock(MGBlocks.TitaniumOre);
		regBlock(MGBlocks.PeridotOre);
		regBlock(MGBlocks.RawPorkStone);
		regBlock(MGBlocks.CookedBeefStone);
		regBlock(MGBlocks.PlutoniumOre);
		regBlock(MGBlocks.AmyethystOre);
		//Other
		regBlock(MGBlocks.EnergonOre);
		//Diamonds		
		regBlock(MGBlocks.RedDiamondOre);
		regBlock(MGBlocks.YellowDiamondOre);
		regBlock(MGBlocks.GreenDiamondOre);	
		//Blocks of Gems
		regBlock(MGBlocks.BlockCopper);
		regBlock(MGBlocks.BlockRuby);
		regBlock(MGBlocks.BlockSapphire);
		regBlock(MGBlocks.BlockNickel);	
	}	
	public static void regBlock(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0,
				new ModelResourceLocation(MGGlobal.Mod_ID + ":" + block.getUnlocalizedName().substring(5),"inventory"));
	}
}