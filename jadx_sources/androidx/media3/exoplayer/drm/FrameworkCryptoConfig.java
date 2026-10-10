package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class FrameworkCryptoConfig implements CryptoConfig {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;

    @Deprecated
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final UUID uuid;

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z11;
        if ("Amazon".equals(Util.MANUFACTURER)) {
            String str = Util.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z11;
    }

    @Deprecated
    public FrameworkCryptoConfig(UUID uuid, byte[] bArr, boolean z11) {
        this.uuid = uuid;
        this.sessionId = bArr;
        this.forceAllowInsecureDecoderComponents = z11;
    }
}
