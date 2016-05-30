package com.mogames.mod.blocks.crops;

import com.mogames.mod.items.MGItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class MGBeet extends BlockCrops {

	public MGBeet(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return MGItems.BeetSeeds;
	}
	
	public Item getCrop() {
		return MGItems.BeetFood;
	}
}
