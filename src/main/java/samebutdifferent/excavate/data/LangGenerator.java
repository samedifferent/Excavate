package samebutdifferent.excavate.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.text.WordUtils;
import samebutdifferent.excavate.Excavate;
import samebutdifferent.excavate.registry.ExcavateItems;

public class LangGenerator extends LanguageProvider {
    public LangGenerator(DataGenerator gen, String locale) {
        super(gen, Excavate.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + Excavate.MOD_ID, WordUtils.capitalize(Excavate.MOD_ID));
        for (RegistryObject<Item> item : ExcavateItems.ITEMS.getEntries()) {
            addItem(item, formatId(item));
        }
    }

    private String formatId(RegistryObject object) {
        return WordUtils.capitalize(object.getId().getPath().replace("_", " "));
    }
}
