package plasticguy.minecrafttech.init;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import plasticguy.minecrafttech.blocks.BasicMachineFrameBlock;
import plasticguy.minecrafttech.blocks.BlockBase;
import plasticguy.minecrafttech.blocks.CopperBlock;
import plasticguy.minecrafttech.blocks.CopperOreBlock;
import plasticguy.minecrafttech.blocks.SilverBlock;
import plasticguy.minecrafttech.blocks.SilverOreBlock;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	public static final Block SILVER_BLOCK = new SilverBlock("silver_block", Material.IRON);
	public static final Block COPPER_ORE_BLOCK = new CopperOreBlock("copper_ore_block", Material.ROCK);
	public static final Block SILVER_ORE_BLOCK = new SilverOreBlock("silver_ore_block", Material.ROCK);
	public static final Block BASIC_MACHINE_FRAME_BLOCK = new BasicMachineFrameBlock("basic_machine_frame_block", Material.IRON);
}
