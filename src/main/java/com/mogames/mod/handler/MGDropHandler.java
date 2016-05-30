package com.mogames.mod.handler;

import java.util.Random;

import com.mogames.mod.items.MGItems;
import com.mogames.mod.items.tools.MGPitchHarvester;
import com.mogames.mod.items.tools.MGShaleMattock;

import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MGDropHandler {
	
	@SubscribeEvent
	public void addEntityDrop (LivingDropsEvent event) {
		if (event.entity instanceof EntityChicken) {
			ItemStack itemstack = new ItemStack(MGItems.ChickenShit, 1);
			event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemstack));
		}
	}
	
	@SubscribeEvent
	public void addBlockDrop (HarvestDropsEvent event) {
		if (event.state.getBlock() == Blocks.tallgrass) {
			
			Random rand = new Random();
			if(event.harvester != null)
			{
				ItemStack holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem);
				if (holding != null  && holding.getItem() instanceof MGShaleMattock) {
					event.drops.clear();
					event.drops.add(new ItemStack(MGItems.TomatoSeeds, rand.nextInt(3)));
						event.drops.add(new ItemStack(MGItems.PickleSeeds, rand.nextInt(3)));
						event.drops.add(new ItemStack(MGItems.LettuceSeeds, rand.nextInt(3)));
						event.drops.add(new ItemStack(MGItems.StrawBerryseeds, rand.nextInt(3)));

				}
			}
			
		}
		
		if (event.state.getBlock() == Blocks.log) {
			if (event.state.getValue(BlockOldLog.VARIANT) == BlockPlanks.EnumType.SPRUCE) {
				ItemStack holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem);
				if (holding != null && holding.getItem() instanceof MGPitchHarvester) {
					event.drops.clear();
					event.drops.add(new ItemStack(MGItems.TreePitch, 2));
				}
			}
			
		}
	}

}