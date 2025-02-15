package io.github.cpearl0.erccore.data.lang;

import io.github.cpearl0.erccore.ERCCore;
import io.github.cpearl0.erccore.registry.ERCBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnglishLanguageProvider extends LanguageProvider {

    public EnglishLanguageProvider(PackOutput output) {
        super(output, ERCCore.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.erccore.main_tab", "Equilibrium: Root & Canopy");
        addBlock(ERCBlocks.ROOT_CORE, "Root Core");
        addBlock(ERCBlocks.CANOPY_NEXUS, "Canopy Nexus");
    }
}
