package samebutdifferent.excavate.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import samebutdifferent.excavate.Excavate;

public class BlockstateGenerator extends BlockStateProvider {
    public BlockstateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Excavate.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }

    private void crossModel(Block plant) {
        simpleBlock(plant, models().cross(plant.getRegistryName().getPath(), modLoc("block/" + plant.getRegistryName().getPath())));
    }
}
