package com.mogames.mod.items;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.Item;

public class MGItem extends Item {
	public MGItem(String name){
		super();
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(MGGlobal.MGCreativeTab);
	
	}
}