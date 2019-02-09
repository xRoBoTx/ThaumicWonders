package com.verdantartifice.thaumicwonders.common.events;

import com.verdantartifice.thaumicwonders.ThaumicWonders;
import com.verdantartifice.thaumicwonders.common.init.InitBlocks;
import com.verdantartifice.thaumicwonders.common.init.InitItems;
import com.verdantartifice.thaumicwonders.common.init.InitRecipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ThaumicWonders.MODID)
public class RegistrationEvents {
    @SubscribeEvent
    public static void regsiterBlocks(RegistryEvent.Register<Block> event) {
        InitBlocks.initBlocks(event.getRegistry());
        InitBlocks.initTileEntities();
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        InitBlocks.initItemBlocks(event.getRegistry());
        InitItems.initItems(event.getRegistry());
    }
    
    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        InitRecipes.initRecipes(event.getRegistry());
    }
}