package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemPickaxe;

public class MGSapphirePickaxe extends ItemPickaxe {


	public MGSapphirePickaxe(String name,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}