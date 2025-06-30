package net.darktree.fungible.mixin.auth;

import dev.kikugie.fletching_table.annotation.MixinEnvironment;
import net.minecraft.client.util.ProfileKeysImpl;
import net.minecraft.network.encryption.PlayerKeyPair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@MixinEnvironment("client")
@Mixin(ProfileKeysImpl.class)
public class ProfileKeysImplMixin {
    /**
     * @author jacg311
     * @reason dont try to fetch the key
     */
    @Overwrite
    public CompletableFuture<Optional<PlayerKeyPair>> fetchKeyPair() {
        return CompletableFuture.completedFuture(Optional.empty());
    }
}
