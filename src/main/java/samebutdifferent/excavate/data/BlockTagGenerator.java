package samebutdifferent.excavate.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import samebutdifferent.excavate.Excavate;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Excavate.MOD_ID, exFileHelper);
    }

    @Override
    protected void addTags() {
    }
}
