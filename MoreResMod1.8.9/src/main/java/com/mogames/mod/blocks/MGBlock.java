package com.mogames.mod.blocks;

import java.util.Random;

import com.mogames.mod.MGGlobal;
import com.mogames.mod.items.MGItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MGBlock extends Block{

	public MGBlock(String unlocalizedName, Material material,float hardness, float resistance) {
		super(material);
		
		this.setCreativeTab(MGGlobal.MGCreativeTab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);	
		
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return this == MGBlocks.RubyOre ? MGItems.Ruby :this == MGBlocks.TitaniumOre ? MGItems.TitaniumIngot :  
			this == MGBlocks.RawPorkStone ? Items.porkchop :	this == MGBlocks.CookedBeefStone ? Items.cooked_beef :
			this == MGBlocks.RedDiamondOre ? MGItems.RedDiamond :
			this == MGBlocks.YellowDiamondOre ? MGItems.YellowDiamond :
			this == MGBlocks.GreenDiamondOre ? MGItems.GreenDiamond:
			this == MGBlocks.EnergonOre ? MGItems.Energon:
						

			Item.getItemFromBlock(this);
	}
}
