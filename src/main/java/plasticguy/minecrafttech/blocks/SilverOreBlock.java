package plasticguy.minecrafttech.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverOreBlock extends BlockBase
{

	public SilverOreBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(); - Block does not give of light.
		//setLightOpacity(); - Block is opaque.
		//setBlockUnbreakable(); - Block is not unbreakable.
	}

}
