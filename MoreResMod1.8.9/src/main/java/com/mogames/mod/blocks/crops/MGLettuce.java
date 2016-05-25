package com.mogames.mod.blocks.crops;

import com.mogames.mod.items.MGItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class MGLettuce extends BlockCrops {

	public MGLettuce(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return MGItems.LettuceSeeds;
	}
	
	public Item getCrop() {
		return MGItems.LettuceFood;
	}
}
