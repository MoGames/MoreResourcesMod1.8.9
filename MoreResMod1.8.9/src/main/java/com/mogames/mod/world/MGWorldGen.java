package com.mogames.mod.world;

import java.util.Random;

import com.mogames.mod.blocks.MGBlocks;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MGWorldGen implements IWorldGenerator {
	
	//Ores
	private WorldGenerator copperOre;
	private WorldGenerator GreenDiamondOre;
	private WorldGenerator SapphireOre;
	private WorldGenerator YellowDiamondOre;
	private WorldGenerator NickelOre;
	private WorldGenerator RedDiamondOre;
	private WorldGenerator RubyOre;
	private WorldGenerator PlutoniumOre;
	private WorldGenerator CookedBeef;
	private WorldGenerator RawPork;
	private WorldGenerator PeridotOre;
	private WorldGenerator EnergonOre;
	private WorldGenerator AmethestOre;

	
	
	//Nether Ores
	
	public MGWorldGen() {
		
		//Ores
		this.copperOre = new MGWorldGenMinable(MGBlocks.copperOre.getDefaultState(), 5);
		this.GreenDiamondOre = new MGWorldGenMinable(MGBlocks.GreenDiamondOre.getDefaultState(), 6);
		this.SapphireOre = new MGWorldGenMinable(MGBlocks.SapphireOre.getDefaultState(), 4);
		this.YellowDiamondOre = new MGWorldGenMinable(MGBlocks.YellowDiamondOre.getDefaultState(), 6);
		this.NickelOre = new MGWorldGenMinable(MGBlocks.NickelOre.getDefaultState(), 4);
		this.RedDiamondOre = new MGWorldGenMinable(MGBlocks.RedDiamondOre.getDefaultState(),6);
		this.PlutoniumOre = new MGWorldGenMinable(MGBlocks.PlutoniumOre.getDefaultState(), 3);
		this.RawPork = new MGWorldGenMinable(MGBlocks.RawPorkStone.getDefaultState(), 3);
		this.CookedBeef = new MGWorldGenMinable(MGBlocks.CookedBeefStone.getDefaultState(),3);
		this.RubyOre = new MGWorldGenMinable(MGBlocks.RubyOre.getDefaultState(), 5);
		this.PeridotOre = new MGWorldGenMinable(MGBlocks.PeridotOre.getDefaultState(), 5);
		this.EnergonOre = new MGWorldGenMinable(MGBlocks.EnergonOre.getDefaultState(), 4);
		this.AmethestOre = new MGWorldGenMinable(MGBlocks.AmyethystOre.getDefaultState(), 5);

	}
	

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimensionId()) {
		case 0: //Overworld
			
			//Ores
			this.runGenerator(this.copperOre, world, random, chunkX, chunkZ, 10, 0, 32);
			this.runGenerator(this.GreenDiamondOre, world, random, chunkX, chunkZ, 8, 0, 16);
			this.runGenerator(this.SapphireOre, world, random, chunkX, chunkZ, 15, 0, 40);
			this.runGenerator(this.YellowDiamondOre, world, random, chunkX, chunkZ, 8, 0, 16);
			this.runGenerator(this.NickelOre, world, random, chunkX, chunkZ, 10, 0, 25);
			this.runGenerator(this.RedDiamondOre, world, random, chunkX, chunkZ, 8, 0, 16);
			this.runGenerator(this.PlutoniumOre, world, random, chunkX, chunkZ, 6, 0, 16);
			this.runGenerator(this.RawPork, world, random, chunkX, chunkZ,20, 0, 45);
			this.runGenerator(this.CookedBeef, world, random, chunkX, chunkZ, 20, 0, 45);
			this.runGenerator(this.RubyOre, world, random, chunkX, chunkZ, 6, 0, 16);
			this.runGenerator(this.PeridotOre, world, random, chunkX, chunkZ, 8, 0, 26);
			this.runGenerator(this.EnergonOre, world, random, chunkX, chunkZ, 6, 0, 26);
			this.runGenerator(this.AmethestOre, world, random, chunkX, chunkZ, 10, 0, 16);

			break;
			
		case -1: //Nether
			
			//Nether Ores
			break;
			
		case 1: //The End
			
			//End Ores
			
			break;
		}
		
	}
	
	private void runGenerator (WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int chanceToSpawn, int minHeight, int maxHeight) {
		
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Minimum or Maximum Height out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chanceToSpawn; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
 
}