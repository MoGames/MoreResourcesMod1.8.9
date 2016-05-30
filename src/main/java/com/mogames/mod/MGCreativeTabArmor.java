package com.mogames.mod;

import com.mogames.mod.items.MGItems;

import net.minecraft.item.Item;

public class MGCreativeTabArmor extends MGCreativeTab {

	public MGCreativeTabArmor(String string) {
		super(string);
		
	}

	@Override
	public  Item getTabIconItem() {
		return MGItems.RubyChestplate;
	}

}
