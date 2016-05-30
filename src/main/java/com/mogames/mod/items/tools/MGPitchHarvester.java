package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemAxe;

public class MGPitchHarvester extends ItemAxe {
	public MGPitchHarvester(String name, ToolMaterial material) {
		super(material);
this.setUnlocalizedName(name);
this.setRegistryName(name);
this.setCreativeTab(MGGlobal.MGToolsWeapons);
}
}