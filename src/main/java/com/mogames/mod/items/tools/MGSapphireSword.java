package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemSword;

public class MGSapphireSword extends ItemSword {


	public MGSapphireSword(String name,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}
