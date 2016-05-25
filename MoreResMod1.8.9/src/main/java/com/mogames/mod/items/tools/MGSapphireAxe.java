package com.mogames.mod.items.tools;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class MGSapphireAxe extends ItemAxe {

	public MGSapphireAxe(String unlocalizedName,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(MGGlobal.MGToolsWeapons);
		}

}
