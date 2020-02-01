package plasticguy.minecrafttech.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE_BLOCK, new ItemStack(ModItems.COPPER_INGOT, 1), 1.4f);
		GameRegistry.addSmelting(ModBlocks.SILVER_ORE_BLOCK, new ItemStack(ModItems.SILVER_INGOT, 1), 1.4f);
	}
}
