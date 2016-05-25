package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemAxe;

public class MGRubyAxe extends ItemAxe {

	public MGRubyAxe(String unlocalizedName,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}
