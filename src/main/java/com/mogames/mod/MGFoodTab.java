package com.mogames.mod;

import com.mogames.mod.items.MGItems;

import net.minecraft.item.Item;

public class MGFoodTab extends MGCreativeTab {

	public MGFoodTab(String string) {
		super(string);
		
	}

	@Override
	public  Item getTabIconItem() {
		return MGItems.PitaBread;
	}

}

