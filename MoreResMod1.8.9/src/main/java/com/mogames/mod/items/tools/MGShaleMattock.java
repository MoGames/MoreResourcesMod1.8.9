package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;

public class MGShaleMattock extends ItemShears {

	public MGShaleMattock(String unlocalizedName,ToolMaterial material) {
		super();
this.setUnlocalizedName(unlocalizedName);
this.setCreativeTab(MGGlobal.MGToolsWeapons);

	}

}
