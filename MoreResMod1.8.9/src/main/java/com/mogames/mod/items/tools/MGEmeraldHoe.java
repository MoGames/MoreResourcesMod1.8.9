package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class MGEmeraldHoe extends ItemHoe {

	public MGEmeraldHoe(String unlocalizedName , ToolMaterial material) {
		super(material);
this.setUnlocalizedName(unlocalizedName);
this.setCreativeTab(MGGlobal.MGToolsWeapons);
	}

}

