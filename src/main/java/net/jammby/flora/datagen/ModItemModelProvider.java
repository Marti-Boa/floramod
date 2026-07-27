package net.jammby.flora.datagen;

import net.jammby.flora.Flora;
import net.jammby.flora.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Flora.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    }
}