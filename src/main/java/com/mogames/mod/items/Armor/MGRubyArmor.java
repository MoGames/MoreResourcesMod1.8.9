package com.mogames.mod.items.Armor;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemArmor;

public class MGRubyArmor extends ItemArmor{

	public MGRubyArmor(String name ,ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
			this.setUnlocalizedName(name);
			this.setRegistryName(name);
			this.setCreativeTab(MGGlobal.MGArmor);
			}
}