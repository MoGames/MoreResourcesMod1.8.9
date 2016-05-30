package com.mogames.mod.crafting;

import com.mogames.mod.blocks.MGBlocks;
import com.mogames.mod.items.MGItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MGRecipes {

	public static void initRecipe(){
		
		GameRegistry.addRecipe(new ItemStack(Items.apple),
				new Object [] {
						"###",
						"###",
						"###",
						'#',Blocks.leaves
		});
		
		GameRegistry.addRecipe(new ItemStack(MGBlocks.BlockCopper),
				new Object [] {
						"###",
						"###",
						"###",
						'#',MGItems.copperIngot
		});
		
		GameRegistry.addRecipe(new ItemStack(MGBlocks.BlockSapphire),
				new Object [] {
						"###",
						"###",
						"###",
						'#',MGItems.Sapphire
		});
		
		GameRegistry.addRecipe(new ItemStack(MGBlocks.BlockRuby),
				new Object [] {
						"###",
						"###",
						"###",
						'#',MGItems.Ruby
		});
		GameRegistry.addRecipe(new ItemStack(MGBlocks.BlockNickel),
				new Object [] {
						"###",
						"###",
						"###",
						'#',MGItems.NickelIngot
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.RubySword),
				new Object [] {
						" # ",
						" # ",
						" A ",
						'#',MGItems.Ruby, 'A',Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.Ruby),
				new Object [] {
						" # ",
						" # ",
						" A ",
						'#',MGItems.Ruby, 'A',Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.SapphireSword),
				new Object [] {
						" # ",
						" # ",
						" A ",
						'#',MGItems.Sapphire, 'A',Items.stick
		});
		
		
		
		
		GameRegistry.addRecipe(new ItemStack(MGItems.RubyHelmet),
				new Object [] {
						"###",
						"# #",
						"   ",
						'#',MGItems.Ruby
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.RubyChestplate),
				new Object [] {
						"# #",
						"###",
						"###",
						'#',MGItems.Ruby
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.RubyLeggings),
				new Object [] {
						"###",
						"# #",
						"# #",
						'#',MGItems.Ruby
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.Ruby),
				new Object [] {
						" # ",
						" # ",
						" A ",
						'#',MGItems.Ruby
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.RubyBoots),
				new Object [] {
						"   ",
						"# #",
						"# #",
						'#',MGItems.Ruby
		});
		
		
		GameRegistry.addRecipe(new ItemStack(MGItems.RubyPickaxe),
				new Object [] {
						"###",
						" A ",
						" A ",
						'#',MGItems.Ruby, 'A', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.RubyAxe),
				new Object [] {
						"## ",
						"#A ",
						" A ",
						'#',MGItems.Ruby, 'A', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.RubyHoe),
				new Object [] {
						"## ",
						" A ",
						" A ",
						'#',MGItems.Ruby, 'A', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MGItems.RubySpade),
				new Object [] {
						" # ",
						" A ",
						" A ",
						'#',MGItems.Ruby, 'A', Items.stick
						
		});				
						GameRegistry.addRecipe(new ItemStack(MGItems.SapphirePickaxe),
								new Object [] {
										"###",
										" A ",
										" A ",
										'#',MGItems.Sapphire, 'A', Items.stick
						});
						GameRegistry.addRecipe(new ItemStack(MGItems.SapphireAxe),
								new Object [] {
										"## ",
										"#A ",
										" A ",
										'#',MGItems.Sapphire, 'A', Items.stick
						});
						GameRegistry.addRecipe(new ItemStack(MGItems.SapphireHoe),
								new Object [] {
										"## ",
										" A ",
										" A ",
										'#',MGItems.Sapphire, 'A', Items.stick
						});
						GameRegistry.addRecipe(new ItemStack(MGItems.SapphireSpade),
								new Object [] {
										" # ",
										" A ",
										" A ",
										'#',MGItems.Sapphire, 'A', Items.stick
		});
		
						GameRegistry.addRecipe(new ItemStack(MGItems.EmeraldSword),
								new Object [] {
										" # ",
										" # ",
										" A ",
										'#',Items.emerald, 'A',Items.stick
						});
						GameRegistry.addRecipe(new ItemStack(MGItems.EmeraldPickaxe),
								new Object [] {
										"###",
										" A ",
										" A ",
										'#',Items.emerald, 'A', Items.stick
						});
						GameRegistry.addRecipe(new ItemStack(MGItems.EmeraldAxe),
								new Object [] {
										"## ",
										"#A ",
										" A ",
										'#',Items.emerald, 'A', Items.stick
						});
						GameRegistry.addRecipe(new ItemStack(MGItems.EmeraldHoe),
								new Object [] {
										"## ",
										" A ",
										" A ",
										'#',Items.emerald, 'A', Items.stick
						});
						GameRegistry.addRecipe(new ItemStack(MGItems.EmeraldSpade),
								new Object [] {
										" # ",
										" A ",
										" A ",
										'#',Items.emerald, 'A', Items.stick
		});

	
	
	}	
	
}
