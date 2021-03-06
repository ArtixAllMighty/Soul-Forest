package com.Mod_Ores.Dimension.GenLayer;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public abstract class GenLayerFrozenHearth extends GenLayer{

    public GenLayerFrozenHearth(long seed) {
	super(seed);
    }

    public static GenLayer[] makeTheWorld(long seed) {
	GenLayer biomes = new GenLayerBiomeFrozenHearth(1L);

	// more GenLayerZoom = bigger biomes
	biomes = new GenLayerZoom(1000L, biomes);
	biomes = new GenLayerZoom(1001L, biomes);
	biomes = new GenLayerZoom(1002L, biomes);
	biomes = new GenLayerZoom(1003L, biomes);
	biomes = new GenLayerZoom(1004L, biomes);
	biomes = new GenLayerZoom(1005L, biomes);	
	biomes = new GenLayerZoom(1006L, biomes);	

	GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);

	biomes.initWorldGenSeed(seed);
	genlayervoronoizoom.initWorldGenSeed(seed);

	return new GenLayer[] {biomes, genlayervoronoizoom};
    }
}
