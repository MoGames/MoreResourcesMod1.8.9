package com.mogames.mod.items.Armor;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;




public class MGEmeraldArmor extends ItemArmor{

	public MGEmeraldArmor(String unlocalizedName ,ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
			this.setUnlocalizedName(unlocalizedName);
			this.setCreativeTab(MGGlobal.MGArmor);
			}
}