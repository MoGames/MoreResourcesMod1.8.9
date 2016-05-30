package com.mogames.mod.items.crops;

import com.mogames.mod.MGGlobal;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class MGItemSeeds extends ItemSeeds {

	public MGItemSeeds(Block crops, Block soil, String name) {
		super(crops, soil);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MGGlobal.MGFood);
	}

}
