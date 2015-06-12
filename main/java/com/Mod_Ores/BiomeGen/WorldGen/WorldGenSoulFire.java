package com.Mod_Ores.BiomeGen.WorldGen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.Mod_Ores.Init.SoulBlocks;

public class WorldGenSoulFire extends WorldGenerator
{
    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        for (int l = 0; l < 64; ++l)
        {
            int i1 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int j1 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int k1 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

            if (par1World.isAirBlock(i1, j1, k1) || par1World.getBlock(i1, j1, k1) != null){
            	if(par1World.getBlock(i1, j1, k1) != SoulBlocks.SoulWaterMoving.get() && par1World.getBlock(i1, j1 - 1, k1) != SoulBlocks.SoulWaterMoving.get()){
            		if(par1World.getBlock(i1, j1 - 1, k1) == SoulBlocks.FyrisedSand.get() || par1World.getBlock(i1, j1 - 1, k1) == SoulBlocks.FyrisedSandGrass.get()){
                		par1World.setBlock(i1, j1, k1, SoulBlocks.SoulFire.get(), 0, 2);
                	}
            	}
            }
        }

        return true;
    }
}
