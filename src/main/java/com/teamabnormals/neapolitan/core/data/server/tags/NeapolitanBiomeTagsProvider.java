package com.teamabnormals.neapolitan.core.data.server.tags;

import com.teamabnormals.blueprint.core.other.tags.BlueprintBiomeTags;
import com.teamabnormals.neapolitan.core.Neapolitan;
import com.teamabnormals.neapolitan.core.other.NeapolitanConstants;
import com.teamabnormals.neapolitan.core.other.tags.NeapolitanBiomeTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NeapolitanBiomeTagsProvider extends BiomeTagsProvider {

	public NeapolitanBiomeTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Neapolitan.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags() {
		this.tag(NeapolitanBiomeTags.SPAWNS_RAINFOREST_VARIANT_CHIMPANZEES).addOptionalTag(NeapolitanConstants.IS_RAINFOREST);
		this.tag(NeapolitanBiomeTags.SPAWNS_BAMBOO_VARIANT_CHIMPANZEES).add(Biomes.BAMBOO_JUNGLE);

		this.tag(NeapolitanBiomeTags.HAS_PLANTAIN_SPIDER).addTag(BiomeTags.IS_JUNGLE).addOptionalTag(NeapolitanConstants.IS_RAINFOREST);
		this.tag(NeapolitanBiomeTags.HAS_CHIMPANZEE).addTag(NeapolitanBiomeTags.HAS_COMMON_BANANA_PLANT).addTag(NeapolitanBiomeTags.HAS_UNCOMMON_BANANA_PLANT).addTag(NeapolitanBiomeTags.HAS_RARE_BANANA_PLANT);

		this.tag(NeapolitanBiomeTags.HAS_STRAWBERRY_BUSH).addTag(BlueprintBiomeTags.IS_GRASSLAND);
		this.tag(NeapolitanBiomeTags.HAS_ADZUKI_SPROUTS).addTag(BiomeTags.IS_FOREST);
		this.tag(NeapolitanBiomeTags.HAS_VANILLA_VINE).addTag(BiomeTags.IS_SAVANNA);
		this.tag(NeapolitanBiomeTags.HAS_MINT_POND).addTag(BiomeTags.IS_HILL);

		this.tag(NeapolitanBiomeTags.HAS_COMMON_BANANA_PLANT).add(Biomes.JUNGLE, Biomes.BAMBOO_JUNGLE);
		this.tag(NeapolitanBiomeTags.HAS_UNCOMMON_BANANA_PLANT).add(Biomes.SPARSE_JUNGLE);
		this.tag(NeapolitanBiomeTags.HAS_RARE_BANANA_PLANT);
		this.tag(NeapolitanBiomeTags.HAS_SPARSE_BANANA_PLANT).add(Biomes.BEACH, Biomes.STONY_SHORE);
	}
}