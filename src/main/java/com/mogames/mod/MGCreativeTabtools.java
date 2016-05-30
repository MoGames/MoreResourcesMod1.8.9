package com.mogames.mod;

import com.mogames.mod.items.MGItems;

import net.minecraft.item.Item;

public class MGCreativeTabtools extends MGCreativeTab {

		public MGCreativeTabtools(String string) {
			super(string);
			
		}

		@Override
		public  Item getTabIconItem() {
			return MGItems.RubyPickaxe;
		}

	}

