package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class MGRubySpade extends ItemSpade {

	public MGRubySpade(String unlocalizedName,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}
