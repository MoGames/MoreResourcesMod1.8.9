package com.mogames.mod.blocks.crops;

import com.mogames.mod.items.MGItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class MGStrawberry extends BlockCrops {

	public MGStrawberry(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return MGItems.StrawBerryseeds;
	}
	
	public Item getCrop() {
		return MGItems.StrawBerryFood;
	}
}