package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final String TAG = "DMCodecAdapterFactory";
    private boolean asyncCryptoFlagEnabled;
    private int asynchronousMode;

    @Nullable
    private final Context context;

    @Deprecated
    public DefaultMediaCodecAdapterFactory() {
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = false;
        this.context = null;
    }

    @CanIgnoreReturnValue
    public DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.asynchronousMode = 2;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.asynchronousMode = 1;
        return this;
    }

    private boolean shouldUseAsynchronousAdapterInDefaultMode() {
        int i11 = Util.SDK_INT;
        if (i11 >= 31) {
            return true;
        }
        Context context = this.context;
        return context != null && i11 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws IOException {
        int i11;
        if (Util.SDK_INT < 23 || !((i11 = this.asynchronousMode) == 1 || (i11 == 0 && shouldUseAsynchronousAdapterInDefaultMode()))) {
            return new SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
        }
        int trackType = MimeTypes.getTrackType(configuration.format.sampleMimeType);
        Log.m2959i(TAG, "Creating an asynchronous MediaCodec adapter for track type " + Util.getTrackTypeString(trackType));
        AsynchronousMediaCodecAdapter.Factory factory = new AsynchronousMediaCodecAdapter.Factory(trackType);
        factory.experimentalSetAsyncCryptoFlagEnabled(this.asyncCryptoFlagEnabled);
        return factory.createAdapter(configuration);
    }

    @CanIgnoreReturnValue
    public DefaultMediaCodecAdapterFactory experimentalSetAsyncCryptoFlagEnabled(boolean z11) {
        this.asyncCryptoFlagEnabled = z11;
        return this;
    }

    public DefaultMediaCodecAdapterFactory(Context context) {
        this.context = context;
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = false;
    }
}
