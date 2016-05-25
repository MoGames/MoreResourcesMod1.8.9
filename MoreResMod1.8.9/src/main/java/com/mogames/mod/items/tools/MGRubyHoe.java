package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class MGRubyHoe extends ItemHoe {
	public MGRubyHoe(String unlocalizedName,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}

