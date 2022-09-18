package fuzs.armorstatues.world.inventory;

import fuzs.armorstatues.mixin.accessor.ArmorStandAccessor;
import net.minecraft.core.Rotations;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.decoration.ArmorStand;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Random;

public class ArmorStandPose {
    private static final Random RANDOM = new Random();
    public static final ArmorStandPose ATHENA = new ArmorStandPose("athena", new Builder().bodyPose(new Rotations(0.0F, 0.0F, 2.0F)).headPose(new Rotations(-5.0F, 0.0F, 0.0F)).leftArmPose(new Rotations(10.0F, 0.0F, -5.0F)).leftLegPose(new Rotations(-3.0F, -3.0F, -3.0F)).rightArmPose(new Rotations(-60.0F, 20.0F, -10.0F)).rightLegPose(new Rotations(3.0F, 3.0F, 3.0F)));
    public static final ArmorStandPose BRANDISH = new ArmorStandPose("brandish", new Builder().bodyPose(new Rotations(0.0F, 0.0F, -2.0F)).headPose(new Rotations(-15.0F, 0.0F, 0.0F)).leftArmPose(new Rotations(20.0F, 0.0F, -10.0F)).leftLegPose(new Rotations(5.0F, -3.0F, -3.0F)).rightArmPose(new Rotations(-110.0F, 50.0F, 0.0F)).rightLegPose(new Rotations(-5.0F, 3.0F, 3.0F)));
    public static final ArmorStandPose CANCAN_A = new ArmorStandPose("cancanA", new Builder().bodyPose(new Rotations(0.0F, 22.0F, 0.0F)).headPose(new Rotations(-5.0F, 18.0F, 0.0F)).leftArmPose(new Rotations(8.0F, 0.0F, -114.0F)).leftLegPose(new Rotations(-111.0F, 55.0F, 0.0F)).rightArmPose(new Rotations(0.0F, 84.0F, 111.0F)).rightLegPose(new Rotations(0.0F, 23.0F, -13.0F)));
    public static final ArmorStandPose CANCAN_B = new ArmorStandPose("cancanB", new Builder().bodyPose(new Rotations(0.0F, -18.0F, 0.0F)).headPose(new Rotations(-10.0F, -20.0F, 0.0F)).leftArmPose(new Rotations(0.0F, 0.0F, -112.0F)).leftLegPose(new Rotations(0.0F, 0.0F, 13.0F)).rightArmPose(new Rotations(8.0F, 90.0F, 111.0F)).rightLegPose(new Rotations(-119.0F, -42.0F, 0.0F)));
    public static final ArmorStandPose DEFAULT = new ArmorStandPose("default", new Builder().leftArmPose(new Rotations(-10.0F, 0.0F, -10.0F)).leftLegPose(new Rotations(-1.0F, 0.0F, -1.0F)).rightArmPose(new Rotations(-15.0F, 0.0F, 10.0F)).rightLegPose(new Rotations(1.0F, 0.0F, 1.0F)));
    public static final ArmorStandPose ENTERTAIN = new ArmorStandPose("entertain", new Builder().headPose(new Rotations(-15.0F, 0.0F, 0.0F)).leftArmPose(new Rotations(-110.0F, -35.0F, 0.0F)).leftLegPose(new Rotations(5.0F, -3.0F, -3.0F)).rightArmPose(new Rotations(-110.0F, 35.0F, 0.0F)).rightLegPose(new Rotations(-5.0F, 3.0F, 3.0F)));
    public static final ArmorStandPose HERO = new ArmorStandPose("hero", new Builder().bodyPose(new Rotations(0.0F, 8.0F, 0.0F)).headPose(new Rotations(-4.0F, 67.0F, 0.0F)).leftArmPose(new Rotations(16.0F, 32.0F, -8.0F)).leftLegPose(new Rotations(0.0F, -75.0F, -8.0F)).rightArmPose(new Rotations(-99.0F, 63.0F, 0.0F)).rightLegPose(new Rotations(4.0F, 63.0F, 8.0F)));
    public static final ArmorStandPose HONOR = new ArmorStandPose("honor", new Builder().headPose(new Rotations(-15.0F, 0.0F, 0.0F)).leftArmPose(new Rotations(-110.0F, 35.0F, 0.0F)).leftLegPose(new Rotations(5.0F, -3.0F, -3.0F)).rightArmPose(new Rotations(-110.0F, -35.0F, 0.0F)).rightLegPose(new Rotations(-5.0F, 3.0F, 3.0F)));
    public static final ArmorStandPose NONE = new ArmorStandPose("none", new Builder());
    public static final ArmorStandPose RIPOSTE = new ArmorStandPose("riposte", new Builder().headPose(new Rotations(16.0F, 20.0F, 0.0F)).leftArmPose(new Rotations(4.0F, 8.0F, 237.0F)).leftLegPose(new Rotations(-14.0F, -18.0F, -16.0F)).rightArmPose(new Rotations(246.0F, 0.0F, 89.0F)).rightLegPose(new Rotations(8.0F, 20.0F, 4.0F)));
    public static final ArmorStandPose SALUTE = new ArmorStandPose("salute", new Builder().leftArmPose(new Rotations(10.0F, 0.0F, -5.0F)).leftLegPose(new Rotations(-1.0F, 0.0F, -1.0F)).rightArmPose(new Rotations(-70.0F, -40.0F, 0.0F)).rightLegPose(new Rotations(1.0F, 0.0F, 1.0F)));
    public static final ArmorStandPose SOLEMN = new ArmorStandPose("solemn", new Builder().bodyPose(new Rotations(0.0F, 0.0F, 2.0F)).headPose(new Rotations(15.0F, 0.0F, 0.0F)).leftArmPose(new Rotations(-30.0F, 15.0F, 15.0F)).leftLegPose(new Rotations(-1.0F, 0.0F, -1.0F)).rightArmPose(new Rotations(-60.0F, -20.0F, -10.0F)).rightLegPose(new Rotations(1.0F, 0.0F, 1.0F)));
    public static final ArmorStandPose ZOMBIE = new ArmorStandPose("zombie", new Builder().headPose(new Rotations(-10.0F, 0.0F, -5.0F)).leftArmPose(new Rotations(-105.0F, 0.0F, 0.0F)).leftLegPose(new Rotations(7.0F, 0.0F, 0.0F)).rightArmPose(new Rotations(-100.0F, 0.0F, 0.0F)).rightLegPose(new Rotations(-46.0F, 0.0F, 0.0F)));

    private static final ArmorStandPose[] VALUES = new ArmorStandPose[]{DEFAULT, NONE, SOLEMN, ATHENA, BRANDISH, HONOR, ENTERTAIN, SALUTE, HERO, RIPOSTE, ZOMBIE, CANCAN_A, CANCAN_B};

    @Nullable
    private final String name;
    private final Rotations headPose;
    private final Rotations bodyPose;
    private final Rotations leftArmPose;
    private final Rotations rightArmPose;
    private final Rotations leftLegPose;
    private final Rotations rightLegPose;

    private ArmorStandPose(String name, Builder builder) {
        this(name, builder.headPose, builder.bodyPose, builder.leftArmPose, builder.rightArmPose, builder.leftLegPose, builder.rightLegPose);
    }

    private ArmorStandPose(Rotations headPose, Rotations bodyPose, Rotations leftArmPose, Rotations rightArmPose, Rotations leftLegPose, Rotations rightLegPose) {
        this(null, headPose, bodyPose, leftArmPose, rightArmPose, leftLegPose, rightLegPose);
    }

    private ArmorStandPose(@Nullable String name, Rotations headPose, Rotations bodyPose, Rotations leftArmPose, Rotations rightArmPose, Rotations leftLegPose, Rotations rightLegPose) {
        this.name = name;
        this.headPose = headPose;
        this.bodyPose = bodyPose;
        this.leftArmPose = leftArmPose;
        this.rightArmPose = rightArmPose;
        this.leftLegPose = leftLegPose;
        this.rightLegPose = rightLegPose;
    }

    @Override
    public String toString() {
        if (this.name != null) {
            return this.name;
        }
        return super.toString();
    }

    public Component getComponent() {
        Objects.requireNonNull(this.name, "Trying to get component for transient armor stand pose");
        return Component.translatable("armorstatues.entity.armor_stand.pose." + this.name);
    }

    public void applyToEntity(ArmorStand armorStand) {
        armorStand.setHeadPose(this.headPose);
        armorStand.setBodyPose(this.bodyPose);
        armorStand.setLeftArmPose(this.leftArmPose);
        armorStand.setRightArmPose(this.rightArmPose);
        armorStand.setLeftLegPose(this.leftLegPose);
        armorStand.setRightLegPose(this.rightLegPose);
    }
    
    public void serialize(CompoundTag tag) {
        tag.put("Head", this.headPose.save());
        tag.put("Body", this.bodyPose.save());
        tag.put("LeftArm", this.leftArmPose.save());
        tag.put("RightArm", this.rightArmPose.save());
        tag.put("LeftLeg", this.leftLegPose.save());
        tag.put("RightLeg", this.rightLegPose.save());
    }
    
    public static ArmorStandPose fromEntity(ArmorStand armorStand) {
        return new ArmorStandPose(armorStand.getHeadPose(), armorStand.getBodyPose(), armorStand.getLeftArmPose(), armorStand.getRightArmPose(), armorStand.getLeftLegPose(), armorStand.getRightLegPose());
    }

    public static void applyTagToEntity(ArmorStand armorStand, CompoundTag tag) {
        ((ArmorStandAccessor) armorStand).callReadPose(tag);
    }

    public static ArmorStandPose random() {
        return new ArmorStandPose(new Rotations(0.0F, 0.0F, 0.0F), new Rotations(0.0F, 0.0F, 0.0F), randomRotations(), randomRotations(), randomRotations(), randomRotations());
    }

    private static Rotations randomRotations() {
        return new Rotations(RANDOM.nextFloat(360.0F), RANDOM.nextFloat(360.0F), RANDOM.nextFloat(360.0F));
    }

    public static ArmorStandPose[] values() {
        return VALUES;
    }

    private static class Builder {
        Rotations headPose = new Rotations(0.0F, 0.0F, 0.0F);
        Rotations bodyPose = new Rotations(0.0F, 0.0F, 0.0F);
        Rotations leftArmPose = new Rotations(0.0F, 0.0F, 0.0F);
        Rotations rightArmPose = new Rotations(0.0F, 0.0F, 0.0F);
        Rotations leftLegPose = new Rotations(0.0F, 0.0F, 0.0F);
        Rotations rightLegPose = new Rotations(0.0F, 0.0F, 0.0F);

        public Builder headPose(Rotations headPose) {
            this.headPose = headPose;
            return this;
        }

        public Builder bodyPose(Rotations bodyPose) {
            this.bodyPose = bodyPose;
            return this;
        }

        public Builder leftArmPose(Rotations leftArmPose) {
            this.leftArmPose = leftArmPose;
            return this;
        }

        public Builder rightArmPose(Rotations rightArmPose) {
            this.rightArmPose = rightArmPose;
            return this;
        }

        public Builder leftLegPose(Rotations leftLegPose) {
            this.leftLegPose = leftLegPose;
            return this;
        }

        public Builder rightLegPose(Rotations rightLegPose) {
            this.rightLegPose = rightLegPose;
            return this;
        }
    }
}
