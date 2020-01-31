package plasticguy.minecrafttech.init;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import plasticguy.minecrafttech.blocks.BlockBase;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON);
	public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON);
}
