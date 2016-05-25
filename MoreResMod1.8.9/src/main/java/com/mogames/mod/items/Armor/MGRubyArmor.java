package com.mogames.mod.items.Armor;

import com.mogames.mod.MGGlobal;
import com.mogames.mod.items.MGItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MGRubyArmor extends ItemArmor{

	public MGRubyArmor(String unlocalizedName ,ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
			this.setUnlocalizedName(unlocalizedName);
			this.setCreativeTab(MGGlobal.MGArmor);
			}
}