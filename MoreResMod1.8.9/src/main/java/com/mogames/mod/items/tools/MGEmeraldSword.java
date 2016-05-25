package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class MGEmeraldSword extends ItemSword {

	public MGEmeraldSword(String unlocalizedName , ToolMaterial material) {
		super(material);
this.setUnlocalizedName(unlocalizedName);
this.setCreativeTab(MGGlobal.MGToolsWeapons);
	}

}

