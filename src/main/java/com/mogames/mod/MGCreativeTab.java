package com.mogames.mod;

import com.mogames.mod.items.MGItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MGCreativeTab extends CreativeTabs{

	public MGCreativeTab(String string) {
		super(string);
		
	}

	@Override
	public  Item getTabIconItem() {
		return MGItems.Sapphire;
	}

}
