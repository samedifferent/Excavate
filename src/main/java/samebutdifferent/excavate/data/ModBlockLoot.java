package samebutdifferent.excavate.data;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import samebutdifferent.excavate.registry.ExcavateBlocks;

public class ModBlockLoot extends BlockLoot {
    @Override
    protected void addTables() {
        for (RegistryObject<Block> block : ExcavateBlocks.BLOCKS.getEntries()) {
            dropSelf(block.get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ExcavateBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
