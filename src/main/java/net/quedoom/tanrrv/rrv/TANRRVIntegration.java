package net.quedoom.tanrrv.rrv;

import cc.cassian.rrv.api.ReliableRecipeViewerClientPlugin;
import cc.cassian.rrv.api.ReliableRecipeViewerPlugin;
import cc.cassian.rrv.common.recipe.ServerRecipeManager;
import toughasnails.api.crafting.TANRecipeSerializers;
import toughasnails.api.crafting.TANRecipeTypes;

public class TANRRVIntegration implements ReliableRecipeViewerPlugin {
    @Override
    public void onIntegrationInitialize() {
        ServerRecipeManager.INSTANCE.synchronizeRecipeType(TANRecipeSerializers.WATER_PURIFYING, TANRecipeTypes.WATER_PURIFYING);
    }
}
