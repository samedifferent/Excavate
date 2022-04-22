package samebutdifferent.excavate.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import samebutdifferent.excavate.Excavate;

import java.util.function.Supplier;

public class ExcavateBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Excavate.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = ExcavateBlocks.BLOCKS.register(name, block);
        ExcavateItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(Excavate.TAB)));
        return toReturn;
    }
}
