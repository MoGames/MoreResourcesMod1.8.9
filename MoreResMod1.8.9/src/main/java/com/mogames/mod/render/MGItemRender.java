package com.mogames.mod.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.mogames.mod.MGGlobal;
import com.mogames.mod.items.MGItems;

public class MGItemRender {

	public static void registerItemRender(){
		//tools
		regItem(MGItems.RubyPickaxe);
		regItem(MGItems.RubySword);
		regItem(MGItems.RubyAxe);
		regItem(MGItems.RubySpade);
		regItem(MGItems.RubyHoe);
		
		regItem(MGItems.SapphirePickaxe);
		regItem(MGItems.SapphireSword);
		regItem(MGItems.SapphireAxe);
		regItem(MGItems.SapphireSpade);
		regItem(MGItems.SapphireHoe);
		
		regItem(MGItems.EmeraldPickaxe);
		regItem(MGItems.EmeraldSword);
		regItem(MGItems.EmeraldAxe);
		regItem(MGItems.EmeraldSpade);
		regItem(MGItems.EmeraldHoe);
		
		regItem(MGItems.ShaleMattock);
		regItem(MGItems.PitchHarvester);
		regItem(MGItems.ChickenShit);

		//Armor		
		regItem(MGItems.RubyHelmet);
		regItem(MGItems.RubyChestplate);
		regItem(MGItems.RubyLeggings);
		regItem(MGItems.RubyBoots);
		regItem(MGItems.EmeraldHelmet);
		regItem(MGItems.EmeraldChestplate);
		regItem(MGItems.EmeraldLeggings);
		regItem(MGItems.EmeraldBoots);

		regItem(MGItems.NightVis);
		
		//Ingot
		regItem(MGItems.copperIngot);
		regItem(MGItems.NickelIngot);
		regItem(MGItems.Ruby);
		regItem(MGItems.Sapphire);
		regItem(MGItems.TitaniumIngot);
		regItem(MGItems.Peridot);
		regItem(MGItems.PlutoniumIngot);
		regItem(MGItems.Amyethyst);
		
		regItem(MGItems.RedDiamond);
		regItem(MGItems.GreenDiamond);
		regItem(MGItems.YellowDiamond);
		
		//Food :)
		regItem(MGItems.PitaBread);
		regItem(MGItems.TomatoFood);
		regItem(MGItems.BeetFood);
		regItem(MGItems.LettuceFood);
		regItem(MGItems.PickleFood);
		//crops
		regItem(MGItems.StrawBerryFood);
		regItem(MGItems.StrawBerryseeds);
		regItem(MGItems.TomatoSeeds);
		regItem(MGItems.BeetSeeds);
		regItem(MGItems.LettuceSeeds);
		regItem(MGItems.PickleSeeds);
		
		regItem(MGItems.TreePitch);
		
		//Other
		regItem(MGItems.Energon);
	}
		public static void regItem(Item item) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
					new ModelResourceLocation(MGGlobal.Mod_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
		}
		
	}


