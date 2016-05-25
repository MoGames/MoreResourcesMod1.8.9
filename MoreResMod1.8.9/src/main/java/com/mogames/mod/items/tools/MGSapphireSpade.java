package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemSpade;

public class MGSapphireSpade extends ItemSpade {


	public MGSapphireSpade(String unlocalizedName,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}