package fuzs.armorstatues.world.entity.decoration;

import fuzs.armorstatues.world.inventory.ArmorStandScreenType;
import net.minecraft.network.chat.Component;

public interface ArmorStandDataProvider {
    ArmorStandDataProvider INSTANCE = new ArmorStandDataProvider() {};

    default ArmorStandScreenType[] getScreenTypes() {
        return new ArmorStandScreenType[]{ArmorStandScreenType.ROTATIONS, ArmorStandScreenType.POSES, ArmorStandScreenType.STYLE, ArmorStandScreenType.POSITION, ArmorStandScreenType.ALIGNMENTS, ArmorStandScreenType.EQUIPMENT};
    }

    default ArmorStandScreenType getDefaultScreenType() {
        return ArmorStandScreenType.ROTATIONS;
    }

    default Component getBodyComponent() {
        return Component.translatable("armorstatues.screen.rotations.pose.body");
    }
}
