package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemShears;

public class MGShaleMattock extends ItemShears {

	public MGShaleMattock(String name, ToolMaterial material) {
		super();
this.setUnlocalizedName(name);
this.setRegistryName(name);
this.setCreativeTab(MGGlobal.MGToolsWeapons);

	}

}
