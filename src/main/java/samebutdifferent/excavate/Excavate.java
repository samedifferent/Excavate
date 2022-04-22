package samebutdifferent.excavate;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import samebutdifferent.excavate.registry.*;

@Mod(Excavate.MOD_ID)
public class Excavate {
    public static final String MOD_ID = "excavate";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final CreativeModeTab TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.GOLD_ORE.asItem());
        }
    };

    public Excavate() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ExcavateBlocks.BLOCKS.register(bus);
        ExcavateItems.ITEMS.register(bus);
        ExcavateConfiguredFeatures.CONFIGURED_FEATURES.register(bus);
        ExcavatePlacedFeatures.PLACED_FEATURES.register(bus);
        ExcavateMobEffects.MOB_EFFECTS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
