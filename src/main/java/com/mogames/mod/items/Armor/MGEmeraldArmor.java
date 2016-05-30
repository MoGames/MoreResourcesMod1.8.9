package com.mogames.mod.items.Armor;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemArmor;




public class MGEmeraldArmor extends ItemArmor{

	public MGEmeraldArmor(String name, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
			this.setUnlocalizedName(name);
			this.setRegistryName(name);
			this.setCreativeTab(MGGlobal.MGArmor);
			}
}