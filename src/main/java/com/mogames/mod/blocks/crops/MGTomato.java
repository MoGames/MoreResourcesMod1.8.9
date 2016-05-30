package com.mogames.mod.blocks.crops;

import com.mogames.mod.items.MGItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class MGTomato extends BlockCrops {

	public MGTomato(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return MGItems.TomatoSeeds;
	}
	
	public Item getCrop() {
		return MGItems.TomatoFood;
	}
}
