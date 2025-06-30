package net.darktree.fungible.mixin.narrator;

import com.mojang.text2speech.Narrator;
import dev.kikugie.fletching_table.annotation.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@MixinEnvironment
@Mixin(value = Narrator.class, remap = false)
public interface NarratorMixin {

	/**
	 * @author magistermaks
	 * @reason Narratorn't
	 */
	@Overwrite
	static Narrator getNarrator() {
		return Narrator.EMPTY;
	}

}
