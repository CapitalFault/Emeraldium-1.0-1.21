package de.capitalfault.emeraldium.datagen;

import de.capitalfault.emeraldium.item.ModItems;
import de.capitalfault.emeraldium.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.PINK_GARNET)
                .add(ModItems.RAW_PINK_GARNET)
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.APPLE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.EMERALD_SWORD);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.EMERALD_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.EMERALD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.EMERALD_HOE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.EMERALD_PICKAXE);
    }
}
