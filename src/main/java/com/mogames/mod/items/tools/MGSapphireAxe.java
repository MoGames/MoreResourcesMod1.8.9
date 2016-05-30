package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemAxe;

public class MGSapphireAxe extends ItemAxe {

	public MGSapphireAxe(String name, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}
