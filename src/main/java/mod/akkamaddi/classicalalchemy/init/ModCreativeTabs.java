package mod.akkamaddi.classicalalchemy.init;

import mod.akkamaddi.classicalalchemy.ClassicalAlchemy;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeTabs
{
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ClassicalAlchemy.MODID);
	
	public static final RegistryObject<CreativeModeTab> CLASSICALALCHEMY_TAB = CREATIVE_MODE_TABS.register("classicalalchemy_tab",
			() -> CreativeModeTab.builder()
				.title(Component.translatable("item_group." + ClassicalAlchemy.MODID + ".tab"))
				.icon(() -> new ItemStack(ModBlocks.pyropus_bronze_block.get().asItem()))
				.displayItems((parameters, output) -> {
					output.acceptAll(ModBlocks.BLOCKS.getEntries().stream()
										.map(RegistryObject::get)
										.map(b -> (new ItemStack(b.asItem())))
										.toList()
										);
					output.acceptAll(ModItems.ITEMS.getEntries().stream()
							.map(RegistryObject::get)
							.map(b -> (new ItemStack(b)))
							.toList()
							);
				}).build());


} // end class
