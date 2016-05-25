package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class MGRubySword extends ItemSword {

	public MGRubySword(String unlocalizedName,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}
