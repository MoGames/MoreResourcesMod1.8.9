package com.mogames.mod.blocks.crops;

import com.mogames.mod.items.MGItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class MGPickle extends BlockCrops {

	public MGPickle(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return MGItems.PickleSeeds;
	}
	
	public Item getCrop() {
		return MGItems.PickleFood;
		
	}
}

