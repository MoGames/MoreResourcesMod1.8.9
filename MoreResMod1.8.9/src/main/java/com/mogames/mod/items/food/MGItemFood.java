package com.mogames.mod.items.food;

import com.mogames.mod.MGGlobal;

import net.minecraft.item.ItemFood;

public class MGItemFood extends ItemFood{

	public MGItemFood(String name ,int amount, float saturation, boolean isWolfFood){
		super(amount, saturation, isWolfFood);
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(MGGlobal.MGFood);
	}
	
}
