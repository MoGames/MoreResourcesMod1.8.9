package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemPickaxe;

public class MGRubyPickaxe extends ItemPickaxe {

	public MGRubyPickaxe(String name, ToolMaterial material) {
		super(material);
this.setUnlocalizedName(name);
this.setRegistryName(name);
this.setCreativeTab(MGGlobal.MGToolsWeapons);
	}

}
