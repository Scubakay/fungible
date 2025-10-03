package net.darktree.fungible.mixin.chunk_loading;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

//? if <1.21.9 {
/*import net.minecraft.server.WorldGenerationProgressListener;
*///?}

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

	/**
	 * @author magistermaks
	 * @reason Spawn chunks be gone! (Lifted from TBPlugin)
	 */
	@Overwrite
	//? if >=1.21.9 {
	private void prepareStartRegion() {
	//?} else {
	/*private void prepareStartRegion(WorldGenerationProgressListener worldGenerationProgressListener) {
	*///?}
		// oh, no!
	}
}
