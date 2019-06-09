package com.verdantartifice.thaumicwonders.common.init;

import com.verdantartifice.thaumicwonders.common.tiles.devices.TileVoidBeacon;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class InitVoidBeacon {
    public static void init() {
        TileVoidBeacon.initRegistry();
        registerEntries();
    }
    
    private static void registerEntries() {
        TileVoidBeacon.registerOreDict("oreLapis");
        TileVoidBeacon.registerOreDict("oreDiamond");
        TileVoidBeacon.registerOreDict("oreRedstone");
        TileVoidBeacon.registerOreDict("oreEmerald");
        TileVoidBeacon.registerOreDict("oreQuartz");
        TileVoidBeacon.registerOreDict("oreIron");
        TileVoidBeacon.registerOreDict("oreGold");
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.COAL_ORE));
        TileVoidBeacon.registerOreDict("glowstone");
        
        TileVoidBeacon.registerOreDict("oreCopper");
        TileVoidBeacon.registerOreDict("oreTin");
        TileVoidBeacon.registerOreDict("oreSilver");
        TileVoidBeacon.registerOreDict("oreLead");
        
        TileVoidBeacon.registerOreDict("oreUranium");
        TileVoidBeacon.registerOreDict("oreRuby");
        TileVoidBeacon.registerOreDict("oreGreenSapphire");
        TileVoidBeacon.registerOreDict("oreSapphire");
        
        TileVoidBeacon.registerOreDict("stone");
        TileVoidBeacon.registerOreDict("stoneGranite");
        TileVoidBeacon.registerOreDict("stoneDiorite");
        TileVoidBeacon.registerOreDict("stoneAndesite");
        TileVoidBeacon.registerOreDict("cobblestone");
        TileVoidBeacon.registerOreDict("dirt");
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.DIRT, 1, 2));
        TileVoidBeacon.registerOreDict("sand");
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.SANDSTONE));
        TileVoidBeacon.registerOreDict("grass");
        TileVoidBeacon.registerOreDict("endstone");
        TileVoidBeacon.registerOreDict("gravel");
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.MYCELIUM));
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.CLAY));
        TileVoidBeacon.registerOreDict("netherrack");
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.SOUL_SAND));
        
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.MOSSY_COBBLESTONE));
        TileVoidBeacon.registerOreDict("obsidian");
        
        TileVoidBeacon.registerOreDict("logWood");
        TileVoidBeacon.registerOreDict("treeSapling");
        TileVoidBeacon.registerOreDict("treeLeaves");
        
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.TALLGRASS));
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.DOUBLE_PLANT, 1, 32767));
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.WATERLILY));
        TileVoidBeacon.registerItemStack(new ItemStack(Blocks.DEADBUSH));
        TileVoidBeacon.registerOreDict("vine");
        TileVoidBeacon.registerItemStack(new ItemStack(Items.WHEAT_SEEDS));
        TileVoidBeacon.registerItemStack(new ItemStack(Items.MELON_SEEDS));
        TileVoidBeacon.registerItemStack(new ItemStack(Items.PUMPKIN_SEEDS));
        TileVoidBeacon.registerItemStack(new ItemStack(Items.BEETROOT_SEEDS));
        TileVoidBeacon.registerOreDict("cropNetherWart");

    }
}
