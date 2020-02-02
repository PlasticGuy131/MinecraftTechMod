package plasticguy.minecrafttech.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BasicMachineFrameBlock extends BlockBase
{

	public BasicMachineFrameBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(); - Block does not give of light.
		setLightOpacity(0);
		//setBlockUnbreakable(); - Block is not unbreakable.
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

}