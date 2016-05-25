package com.mogames.mod.items.tools;

import net.minecraft.item.ItemAxe;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.Item.ToolMaterial;

public class MGPitchHarvester extends ItemAxe {
	public MGPitchHarvester(String unlocalizedName,ToolMaterial material) {
		super(material);
this.setUnlocalizedName(unlocalizedName);
this.setCreativeTab(MGGlobal.MGToolsWeapons);
}
}