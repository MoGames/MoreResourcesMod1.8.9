package com.mogames.mod.items.Armor;

import com.mogames.mod.MGGlobal;
import com.mogames.mod.items.MGItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class MGNIGHTVIS extends ItemArmor{

	public MGNIGHTVIS(String name, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
			this.setUnlocalizedName(name);
			this.setRegistryName(name);
			this.setCreativeTab(MGGlobal.MGArmor);
			}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack){
		if(itemstack.getItem() == MGItems.NightVis){
		this.effectPlayer(player, Potion.nightVision, 1);
	}
	}
	private void effectPlayer(EntityPlayer player, Potion potion, int Amplifier){
		if(player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			player.addPotionEffect(new PotionEffect(potion.id , 160, Amplifier,true,true));
	}	
}