package com.mogames.mod.blocks;

import com.mogames.mod.blocks.crops.MGBeet;
import com.mogames.mod.blocks.crops.MGLettuce;
import com.mogames.mod.blocks.crops.MGPickle;
import com.mogames.mod.blocks.crops.MGStrawberry;
import com.mogames.mod.blocks.crops.MGTomato;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MGBlocks {

	
	//Ores
	public static Block copperOre;
	public static Block RubyOre;
	public static Block SapphireOre;
	public static Block NickelOre;
	public static Block TitaniumOre;
	public static Block PeridotOre;
	public static Block CookedBeefStone;
	public static Block RawPorkStone;
	public static Block PlutoniumOre;	
	public static Block RedDiamondOre;
	public static Block YellowDiamondOre;
	public static Block GreenDiamondOre;
	public static Block AmyethystOre;
	//Blocks of gems
	public static Block BlockCopper;
	public static Block BlockRuby;
	public static Block BlockNickel;
	public static Block BlockSapphire;
	
	//crops
	public static Block StrawBerryPlant;
	public static Block TomatoPlant;
	public static Block BeetPlant;
	public static Block LettucePlant;
	public static Block PicklePlant;
	
	//other
	public static Block EnergonOre;
	
	public static void initBlocks(){
		
		//ores
		GameRegistry.registerBlock(copperOre = new MGBlock("copperOre",Material.rock,2,15),"copperOre");
		GameRegistry.registerBlock(RubyOre = new MGBlock("RubyOre",Material.rock,2,15),"RubyOre");
		GameRegistry.registerBlock(SapphireOre = new MGBlock("SapphireOre",Material.rock,2,15),"SapphireOre");
		GameRegistry.registerBlock(NickelOre = new MGBlock("NickelOre",Material.rock,2,15),"NickelOre");
		GameRegistry.registerBlock(TitaniumOre = new MGBlock("TitaniumOre",Material.iron,3,15),"TitaniumOre");
		GameRegistry.registerBlock(PeridotOre = new MGBlock("PeridotOre",Material.rock,3,15),"PeridotOre");
		GameRegistry.registerBlock(CookedBeefStone = new MGBlock("CookedBeefStone",Material.rock,2,15),"CookedBeefStone");
		GameRegistry.registerBlock(RawPorkStone = new MGBlock("RawPorkStone",Material.rock,2,15),"RawPorkStone");
		GameRegistry.registerBlock(PlutoniumOre = new MGBlock("PlutoniumOre",Material.iron,3,15),"PlutoniumOre");
		GameRegistry.registerBlock(AmyethystOre = new MGBlock("AmyethystOre", Material.rock,3, 15), "AmyethystOre");
		
		GameRegistry.registerBlock(RedDiamondOre = new MGBlock("RedDiamondOre",Material.iron,3,15),"RedDiamondOre");
		GameRegistry.registerBlock(YellowDiamondOre = new MGBlock("YellowDiamondOre",Material.rock,3,15),"YellowDiamondOre");
		GameRegistry.registerBlock(GreenDiamondOre = new MGBlock("GreenDiamondOre",Material.iron,3,15),"GreenDiamondOre");


		//Blocks of gems
		GameRegistry.registerBlock(BlockRuby = new MGBlock("BlockRuby",Material.rock,3,15),"BlockRuby");
		GameRegistry.registerBlock(BlockSapphire = new MGBlock("BlockSapphire",Material.rock,3,15),"BlockSapphire");
		GameRegistry.registerBlock(BlockNickel = new MGBlock("BlockNickel",Material.rock,3,15),"BlockNickel");
		GameRegistry.registerBlock(BlockCopper = new MGBlock("BlockCopper",Material.rock,3,15),"BlockCopper");
		
		//crops
		
		GameRegistry.registerBlock(StrawBerryPlant = new MGStrawberry("StrawBerryPlant"), "StrawBerryPlant");
		GameRegistry.registerBlock(TomatoPlant = new MGTomato("TomatoPlant"), "TomatoPlant");
		GameRegistry.registerBlock( BeetPlant = new MGBeet("BeetPlant"), "BeetPlant");
		GameRegistry.registerBlock(LettucePlant = new MGLettuce("LettucePlant"), "LettucePlant");
		GameRegistry.registerBlock(PicklePlant = new MGPickle("PicklePlant"), "PicklePlant");

		
		//other
		GameRegistry.registerBlock(EnergonOre = new MGBlock("EnergonOre",Material.iron,3,15),"EnergonOre");

	}
	
}
