package mod.akkamaddi.classicalalchemy.init;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Holds a list of all our {@link Block}s.
 * Suppliers that create Blocks are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the Block Registry Event is fired by Forge and it is time for the mod to
 * register its Blocks, our Blocks are created and registered by the DeferredRegister.
 * The Block Registry Event will always be called before the Item registry is filled.
 * Note: This supports registry overrides.
 *
 * @author Sinhika, notes by Cadiboo
 */
public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, ClassicalAlchemy.MODID);

    // storage blocks
    public static final RegistryObject<Block> stannum_block = BLOCKS.register("stannum_block",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(4.0F, 8.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0) 
    public static final RegistryObject<Block> cuprum_block = BLOCKS.register("cuprum_block",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(8.0F, 16.0F).sound(SoundType.METAL).requiresCorrectToolForDrops())); 
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)
    public static final RegistryObject<Block> pyropus_bronze_block = BLOCKS.register("pyropus_bronze_block",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(10.0F, 18.0F).sound(SoundType.METAL).requiresCorrectToolForDrops())); 
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)
    public static final RegistryObject<Block> pulchrum_bronze_block = BLOCKS.register("pulchrum_bronze_block",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(8.0F, 20.0F).sound(SoundType.METAL).requiresCorrectToolForDrops())); 
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)
    public static final RegistryObject<Block> tomb_bronze_block = BLOCKS.register("tomb_bronze_block",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(12.0F, 24.0F).sound(SoundType.METAL).requiresCorrectToolForDrops())); 
                    // .harvestTool(ToolType.PICKAXE).harvestLevel(0)
} // end class
