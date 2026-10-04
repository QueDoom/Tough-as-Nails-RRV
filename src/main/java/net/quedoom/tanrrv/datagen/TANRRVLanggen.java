package net.quedoom.tanrrv.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import net.quedoom.quet.datagen.lang.QTTranslationBuilder;
import net.quedoom.quet.datagen.lang.QueTLanguageProvider;
import net.quedoom.tanrrv.ToughAsNailsRRV;
import toughasnails.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class TANRRVLanggen extends QueTLanguageProvider {
    public TANRRVLanggen(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    protected String getNamespace() {
        return ToughAsNailsRRV.MOD_ID;
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder, QTTranslationBuilder autoTranslate) {
        translationBuilder.add(ToughAsNailsRRV.translationString("rrv", "thermoregulating"), "Thermoregulating");
        translationBuilder.add(ToughAsNailsRRV.translationString("rrv", "rain_collecting"), "Rain Collecting");
        translationBuilder.add(ToughAsNailsRRV.translationString("rrv", "water_purifying"), "Water Purifying");
        translationBuilder.add(ToughAsNailsRRV.translationString("rrv", "rain_collection_output"), "Needs rain or snow to fill, is very slow!");

        // Block tags
        autoTranslate.auto(ModTags.Blocks.COOLING_BLOCKS);
        autoTranslate.auto(ModTags.Blocks.HEATING_BLOCKS);
        autoTranslate.auto(ModTags.Blocks.PASSABLE_BLOCKS);

        // Item tags
        autoTranslate.auto(ModTags.Items.COOLING_ARMOR);
        autoTranslate.auto(ModTags.Items.HEATING_ARMOR);
        autoTranslate.auto(ModTags.Items.COOLING_HELD_ITEMS);
        autoTranslate.auto(ModTags.Items.HEATING_HELD_ITEMS);
        autoTranslate.auto(ModTags.Items.COOLING_CONSUMED_ITEMS);
        autoTranslate.auto(ModTags.Items.HEATING_CONSUMED_ITEMS);
        autoTranslate.auto(ModTags.Items.THERMOREGULATOR_COOLING_FUEL);
        autoTranslate.auto(ModTags.Items.THERMOREGULATOR_HEATING_FUEL);
        autoTranslate.auto(ModTags.Items.ONE_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.TWO_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.THREE_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.FOUR_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.FIVE_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.SIX_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.SEVEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.EIGHT_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.NINE_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.TEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.ELEVEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.TWELVE_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.THIRTEEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.FOURTEEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.FIFTEEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.SIXTEEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.SEVENTEEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.EIGHTEEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.NINETEEN_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.TWENTY_THIRST_DRINKS);
        autoTranslate.auto(ModTags.Items.TEN_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.TWENTY_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.THIRTY_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.FOURTY_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.FIFTY_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.SIXTY_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.SEVENTY_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.EIGHTY_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.NINETY_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.ONE_HUNDRED_HYDRATION_DRINKS);
        autoTranslate.auto(ModTags.Items.TWENTY_FIVE_POISON_CHANCE_DRINKS);
        autoTranslate.auto(ModTags.Items.FIFTY_POISON_CHANCE_DRINKS);
        autoTranslate.auto(ModTags.Items.SEVENTY_FIVE_POISON_CHANCE_DRINKS);
        autoTranslate.auto(ModTags.Items.ONE_HUNDRED_POISON_CHANCE_DRINKS);
        autoTranslate.auto(ModTags.Items.DRINKS);
        autoTranslate.auto(ModTags.Items.CANTEEN);

        // Biome tags
        autoTranslate.auto(ModTags.Biomes.ICY_BIOMES);
        autoTranslate.auto(ModTags.Biomes.COLD_BIOMES);
        autoTranslate.auto(ModTags.Biomes.NEUTRAL_BIOMES);
        autoTranslate.auto(ModTags.Biomes.WARM_BIOMES);
        autoTranslate.auto(ModTags.Biomes.HOT_BIOMES);
        autoTranslate.auto(ModTags.Biomes.DIRTY_WATER_BIOMES);
        autoTranslate.auto(ModTags.Biomes.PURIFIED_WATER_BIOMES);

        // Trim tags
        autoTranslate.auto(ModTags.Trims.COOLING_TRIMS);
        autoTranslate.auto(ModTags.Trims.HEATING_TRIMS);

        // Entity type tags
        autoTranslate.auto(ModTags.EntityTypes.NEUTRALISING_MOUNTS);
    }
}
