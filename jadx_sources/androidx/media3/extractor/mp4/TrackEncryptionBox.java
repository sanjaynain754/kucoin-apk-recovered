package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;

    @Nullable
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;

    @Nullable
    public final String schemeType;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int schemeToCryptoMode(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        byte b11 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C2711C.CENC_TYPE_cbc1)) {
                    b11 = 0;
                }
                break;
            case 3046671:
                if (str.equals(C2711C.CENC_TYPE_cbcs)) {
                    b11 = 1;
                }
                break;
            case 3049879:
                if (str.equals(C2711C.CENC_TYPE_cenc)) {
                    b11 = 2;
                }
                break;
            case 3049895:
                if (str.equals(C2711C.CENC_TYPE_cens)) {
                    b11 = 3;
                }
                break;
        }
        switch (b11) {
            case 0:
            case 1:
                return 2;
            default:
                Log.m2961w(TAG, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }

    public TrackEncryptionBox(boolean z11, @Nullable String str, int i11, byte[] bArr, int i12, int i13, @Nullable byte[] bArr2) {
        boolean z12;
        if (i11 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Assertions.checkArgument((bArr2 == null) ^ z12);
        this.isEncrypted = z11;
        this.schemeType = str;
        this.perSampleIvSize = i11;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i12, i13);
    }
}
