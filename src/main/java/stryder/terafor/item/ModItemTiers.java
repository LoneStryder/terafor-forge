package stryder.terafor.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTiers implements IItemTier {
	COPPER(1, 193, 5.0F, 1.0F, 11, () -> {
		return Ingredient.fromItems(ModItems.COPPER_INGOT.get());
	}),
	RUBY(3, 1171, 9.0F, 4.0F, 6, () -> {
		return Ingredient.fromItems(ModItems.RUBY.get());
	}),
	SAPPHIRE(3, 1951, 7.0F, 2.0F, 14, () -> {
		return Ingredient.fromItems(ModItems.SAPPHIRE.get());
	}),
	SILVER(2, 160, 9.0F, 1.0F, 18, () -> {
		return Ingredient.fromItems(ModItems.SILVER_INGOT.get());
	});

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;

	ModItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
}
