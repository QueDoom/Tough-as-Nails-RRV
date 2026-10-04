package net.quedoom.tanrrv;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.quedoom.quet.datagen.QTRegistryBuilder;
import net.quedoom.quet.datagen.QueTDataGeneratorEntrypoint;
import net.quedoom.tanrrv.datagen.TANRRVLanggen;

public class TANRRVDataGenerator extends QueTDataGeneratorEntrypoint {
    @Override
    protected void doDatagen(FabricDataGenerator fabricDataGenerator, FabricDataGenerator.Pack pack) {
        pack.addProvider(TANRRVLanggen::new);
    }

    @Override
    protected void buildRegistry(QTRegistryBuilder qtRegistryBuilder) {

    }
}
