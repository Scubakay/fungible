package net.darktree.fungible.mixin.chunk_loading;

import dev.kikugie.fletching_table.annotation.MixinEnvironment;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.WorldGenerationProgressListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@MixinEnvironment
@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

	/**
	 * @author magistermaks
	 * @reason Spawn chunks be gone! (Lifted from TBPlugin)
	 */
	@Overwrite
	private void prepareStartRegion(WorldGenerationProgressListener worldGenerationProgressListener) {
		// oh, no!
	}

}
