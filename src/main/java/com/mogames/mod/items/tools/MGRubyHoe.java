package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemHoe;

public class MGRubyHoe extends ItemHoe {
	public MGRubyHoe(String name,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}

