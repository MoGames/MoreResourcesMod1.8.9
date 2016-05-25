package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemPickaxe;

public class MGRubyPickaxe extends ItemPickaxe {

	public MGRubyPickaxe(String unlocalizedName , ToolMaterial material) {
		super(material);
this.setUnlocalizedName(unlocalizedName);
this.setCreativeTab(MGGlobal.MGToolsWeapons);
	}

}
