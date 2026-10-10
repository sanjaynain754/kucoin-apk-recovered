package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class AesCipherDataSink implements DataSink {

    @Nullable
    private AesFlushingCipher cipher;

    @Nullable
    private final byte[] scratch;
    private final byte[] secretKey;
    private final DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] bArr, DataSink dataSink) {
        this(bArr, dataSink, null);
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() throws IOException {
        this.cipher = null;
        this.wrappedDataSink.close();
    }

    public AesCipherDataSink(byte[] bArr, DataSink dataSink, @Nullable byte[] bArr2) {
        this.wrappedDataSink = dataSink;
        this.secretKey = bArr;
        this.scratch = bArr2;
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(DataSpec dataSpec) throws IOException {
        this.wrappedDataSink.open(dataSpec);
        this.cipher = new AesFlushingCipher(1, this.secretKey, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (this.scratch == null) {
            ((AesFlushingCipher) Util.castNonNull(this.cipher)).updateInPlace(bArr, i11, i12);
            this.wrappedDataSink.write(bArr, i11, i12);
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            int iMin = Math.min(i12 - i13, this.scratch.length);
            byte[] bArr2 = bArr;
            ((AesFlushingCipher) Util.castNonNull(this.cipher)).update(bArr2, i11 + i13, iMin, this.scratch, 0);
            this.wrappedDataSink.write(this.scratch, 0, iMin);
            i13 += iMin;
            bArr = bArr2;
        }
    }
}
