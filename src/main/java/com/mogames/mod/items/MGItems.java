package com.mogames.mod.items;

import com.mogames.mod.MGGlobal;
import com.mogames.mod.blocks.MGBlocks;
import com.mogames.mod.items.Armor.MGEmeraldArmor;
import com.mogames.mod.items.Armor.MGNIGHTVIS;
import com.mogames.mod.items.Armor.MGRubyArmor;
import com.mogames.mod.items.crops.MGItemSeeds;
import com.mogames.mod.items.food.MGItemFood;
import com.mogames.mod.items.tools.MGEmeraldAxe;
import com.mogames.mod.items.tools.MGEmeraldHoe;
import com.mogames.mod.items.tools.MGEmeraldPickaxe;
import com.mogames.mod.items.tools.MGEmeraldSpade;
import com.mogames.mod.items.tools.MGEmeraldSword;
import com.mogames.mod.items.tools.MGPitchHarvester;
import com.mogames.mod.items.tools.MGRubyAxe;
import com.mogames.mod.items.tools.MGRubyHoe;
import com.mogames.mod.items.tools.MGRubyPickaxe;
import com.mogames.mod.items.tools.MGRubySpade;
import com.mogames.mod.items.tools.MGRubySword;
import com.mogames.mod.items.tools.MGSapphireAxe;
import com.mogames.mod.items.tools.MGSapphirePickaxe;
import com.mogames.mod.items.tools.MGSapphireSpade;
import com.mogames.mod.items.tools.MGSapphireSword;
import com.mogames.mod.items.tools.MGSappphireHoe;
import com.mogames.mod.items.tools.MGShaleMattock;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MGItems {
	//tools
public static ToolMaterial RUBYTOOLS = EnumHelper.addToolMaterial("RUBYTOOLS", 3, 1050, 12.0F, 4.0F, 20);
public static ToolMaterial SAPPHIRETOOLS = EnumHelper.addToolMaterial("SAPPHIRETOOLS", 3, 1050, 11.0F, 3.5F, 20);
public static ToolMaterial EMERALDTOOLS = EnumHelper.addToolMaterial("EMERALDTOOLS", 4, 1600, 15.0F, 4.5F, 25);
public static ToolMaterial GELTOOLS = EnumHelper.addToolMaterial("GELLTOOLS", 1, 500, 8.0F, 0.0F, 25);
public static ToolMaterial PITCHTOOLS = EnumHelper.addToolMaterial("PITCHTOOLS", 1,500, 8.0F, 0.0F, 25);



//Armor
public static ArmorMaterial RUBYARMOR = EnumHelper.addArmorMaterial("RUBYARMOR", MGGlobal.Mod_ID + ":" + "ruby",20 , new int[]{2,6,5,4}, 25);
public static ArmorMaterial EMERALDARMOR = EnumHelper.addArmorMaterial("EMERALDARMOR", MGGlobal.Mod_ID + ":" + "emerald",20 , new int[]{2,7,6,4}, 25);
public static ArmorMaterial NIGHTVIS = EnumHelper.addArmorMaterial("NightVis", MGGlobal.Mod_ID + ":" + "NightVis",20 , new int[]{1,0,0,0}, 25);


public static Item RubyHelmet;
public static Item RubyChestplate;
public static Item RubyLeggings;
public static Item RubyBoots;
public static Item EmeraldHelmet;
public static Item EmeraldChestplate;
public static Item EmeraldLeggings;
public static Item EmeraldBoots;

public static Item RubyPickaxe;
public static Item RubyAxe;
public static Item RubyHoe;
public static Item RubySpade;
public static Item RubySword;

public static Item SapphirePickaxe;
public static Item SapphireAxe;
public static Item SapphireHoe;
public static Item SapphireSpade;
public static Item SapphireSword;

public static Item EmeraldPickaxe;
public static Item EmeraldAxe;
public static Item EmeraldHoe;
public static Item EmeraldSpade;
public static Item EmeraldSword;

public static Item ShaleMattock;
public static Item PitchHarvester;
//Food :)
public static Item PitaBread;
public static Item StrawBerryFood;
public static Item TomatoFood;
public static Item BeetFood;
public static Item LettuceFood;
public static Item PickleFood;

//Crops
public static Item StrawBerryseeds;
public static Item TomatoSeeds;
public static Item BeetSeeds;
public static Item LettuceSeeds;
public static Item PickleSeeds;
	//Ingot
	public static Item copperIngot;
	public static Item Ruby;
	public static Item Sapphire;
	public static Item NickelIngot;
	public static Item TitaniumIngot;
	public static Item Peridot;
	public static Item PlutoniumIngot;
	public static Item Amyethyst;
	
	public static Item RedDiamond;
	public static Item YellowDiamond;
	public static Item GreenDiamond;
	
	//Other
	public static Item Energon;
	public static Item NightVis;
	public static Item TreePitch;
	public static Item ChickenShit;
	
	public static void initItems() {
		//tools
		GameRegistry.registerItem(RubyPickaxe = new MGRubyPickaxe("RubyPickaxe", RUBYTOOLS),"RubyPickaxe");
		GameRegistry.registerItem(RubyAxe = new MGRubyAxe("RubyAxe", RUBYTOOLS), "RubyAxe");
		GameRegistry.registerItem(RubyHoe = new MGRubyHoe("RubyHoe", RUBYTOOLS),"RubyHoe");
		GameRegistry.registerItem(RubySpade = new MGRubySpade("RubySpade", RUBYTOOLS), "RubySpade");
		GameRegistry.registerItem(RubySword = new MGRubySword("RubySword", RUBYTOOLS),"RubySword");
		
	
		GameRegistry.registerItem(SapphirePickaxe = new MGSapphirePickaxe("SapphirePickaxe", SAPPHIRETOOLS),"SapphirePickaxe");
		GameRegistry.registerItem(SapphireAxe = new MGSapphireAxe("SapphireAxe", SAPPHIRETOOLS), "SapphireAxe");
		GameRegistry.registerItem(SapphireHoe = new MGSappphireHoe("SapphireHoe", SAPPHIRETOOLS),"SapphireHoe");
		GameRegistry.registerItem(SapphireSpade = new MGSapphireSpade("SapphireSpade", SAPPHIRETOOLS), "SapphireSpade");
		GameRegistry.registerItem(SapphireSword = new MGSapphireSword("SapphireSword", SAPPHIRETOOLS),"SapphireSword");

		GameRegistry.registerItem(EmeraldPickaxe = new MGEmeraldPickaxe("EmeraldPickaxe", EMERALDTOOLS),"EmeraldPickaxe");
		GameRegistry.registerItem(EmeraldAxe = new MGEmeraldAxe("EmeraldAxe", EMERALDTOOLS), "EmeraldAxe");
		GameRegistry.registerItem(EmeraldHoe = new MGEmeraldHoe("EmeraldHoe", EMERALDTOOLS),"EmeraldHoe");
		GameRegistry.registerItem(EmeraldSpade = new MGEmeraldSpade("EmeraldSpade", EMERALDTOOLS), "EmeraldSpade");
		GameRegistry.registerItem(EmeraldSword = new MGEmeraldSword("EmeraldSword", EMERALDTOOLS),"EmeraldSword");
		
		GameRegistry.registerItem(ShaleMattock = new MGShaleMattock("ShaleMattock", GELTOOLS), "ShaleMattock");
		GameRegistry.registerItem(PitchHarvester = new MGPitchHarvester("PitchHarvester", PITCHTOOLS),"PitchHarvester");
		
		GameRegistry.registerItem(NightVis = new MGNIGHTVIS("NightVis", NIGHTVIS, 1, 0),"NightVis");

		//Armor
		
		GameRegistry.registerItem(RubyHelmet = new MGRubyArmor("RubyHelmet" , RUBYARMOR, 1, 0), "RubyHelmet");
		GameRegistry.registerItem(RubyChestplate = new MGRubyArmor("RubyChestplate" , RUBYARMOR, 1, 1), "RubyChestplate");
		GameRegistry.registerItem(RubyLeggings = new MGRubyArmor("RubyLeggings" , RUBYARMOR, 2, 2), "RubyLeggings");
		GameRegistry.registerItem(RubyBoots = new MGRubyArmor("RubyBoots" , RUBYARMOR, 3, 3), "RubyBoots");
		GameRegistry.registerItem(EmeraldHelmet = new MGEmeraldArmor("EmeraldHelmet" , EMERALDARMOR, 1, 0), "EmeraldHelmet");
		GameRegistry.registerItem(EmeraldChestplate = new MGEmeraldArmor("EmeraldChestplate" , EMERALDARMOR, 1, 1), "EmeraldChestplate");
		GameRegistry.registerItem(EmeraldLeggings = new MGEmeraldArmor("EmeraldLeggings" , EMERALDARMOR, 2, 2), "EmeraldLeggings");
		GameRegistry.registerItem(EmeraldBoots = new MGEmeraldArmor("EmeraldBoots" , EMERALDARMOR, 3, 3), "EmeraldBoots");
		

			//Food
	GameRegistry.registerItem(PitaBread = new MGItemFood("PitaBread", 3 , 0.1F, false).setPotionEffect(Potion.regeneration.id, 10, 3, 0.7F), "PitaBread");
GameRegistry.registerItem(StrawBerryFood = new MGItemFood("StrawberryFood",2,1.4F, false),"StrawberryFood");
GameRegistry.registerItem(TomatoFood = new MGItemFood("TomatoFood",2,0.4F, false),"TomatoFood");
GameRegistry.registerItem(BeetFood = new MGItemFood("BeetFood",2,0.8F, true),"BeetFood");
GameRegistry.registerItem(LettuceFood = new MGItemFood("LettuceFood",2,0.8F, true),"LettuceFood");
GameRegistry.registerItem(PickleFood = new MGItemFood("PickleFood",2,0.8F, true),"PickleFood");


		//Crops
GameRegistry.registerItem(StrawBerryseeds = new MGItemSeeds(MGBlocks.StrawBerryPlant, Blocks.farmland,"StrawBerrySeeds"), "StrawBerrySeeds"); 
GameRegistry.registerItem(TomatoSeeds = new MGItemSeeds(MGBlocks.TomatoPlant, Blocks.farmland,"TomatoSeeds"), "TomatoSeeds"); 
GameRegistry.registerItem(BeetSeeds = new MGItemSeeds(MGBlocks.BeetPlant, Blocks.farmland,"BeetSeeds"), "BeetSeeds"); 
GameRegistry.registerItem(LettuceSeeds = new MGItemSeeds(MGBlocks.LettucePlant, Blocks.farmland,"LettuceSeeds"), "LettuceSeeds"); 
GameRegistry.registerItem(PickleSeeds = new MGItemSeeds(MGBlocks.PicklePlant, Blocks.farmland,"PickleSeeds"), "PickleSeeds");  

		//Ingots
		GameRegistry.registerItem(copperIngot = new MGItem("copperIngot"),"copperIngot");
		GameRegistry.registerItem(Ruby = new MGItem("Ruby"),"Ruby");
		GameRegistry.registerItem(NickelIngot = new MGItem("NickelIngot"),"NickelIngot");
		GameRegistry.registerItem(Sapphire = new MGItem("Sapphire"),"Sapphire");
		GameRegistry.registerItem(TitaniumIngot = new MGItem("TitaniumIngot"), "TitaniumIngot");
		GameRegistry.registerItem(Peridot = new MGItem("Peridot"),"Peridot");
		GameRegistry.registerItem(PlutoniumIngot = new MGItem("PlutoniumIngot"),"PlutoniumIngot");
		GameRegistry.registerItem(Amyethyst = new MGItem("Amyethyst"), "Amyethyst");

		GameRegistry.registerItem(RedDiamond = new MGItem("RedDiamond"), "RedDiamond");
		GameRegistry.registerItem(GreenDiamond = new MGItem("GreenDiamond"),"GreenDiamond");
		GameRegistry.registerItem(YellowDiamond = new MGItem("YellowDiamond"),"YellowDiamond");
		
		GameRegistry.registerItem(TreePitch = new MGItem("TreePitch"), "TreePitch");
		//Other
		GameRegistry.registerItem(Energon = new MGItem("Energon"),"Energon");
		GameRegistry.registerItem(ChickenShit = new MGItem("ChickenShit"),"ChickenShit");

	

	}
	
}
