package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
final class IcyDataSource implements DataSource {
    private int bytesUntilMetadata;
    private final Listener listener;
    private final int metadataIntervalBytes;
    private final byte[] metadataLengthByteHolder;
    private final DataSource upstream;

    public interface Listener {
        void onIcyMetadata(ParsableByteArray parsableByteArray);
    }

    private boolean readMetadata() throws IOException {
        if (this.upstream.read(this.metadataLengthByteHolder, 0, 1) == -1) {
            return false;
        }
        int i11 = (this.metadataLengthByteHolder[0] & 255) << 4;
        if (i11 == 0) {
            return true;
        }
        byte[] bArr = new byte[i11];
        int i12 = i11;
        int i13 = 0;
        while (i12 > 0) {
            int i14 = this.upstream.read(bArr, i13, i12);
            if (i14 == -1) {
                return false;
            }
            i13 += i14;
            i12 -= i14;
        }
        while (i11 > 0 && bArr[i11 - 1] == 0) {
            i11--;
        }
        if (i11 > 0) {
            this.listener.onIcyMetadata(new ParsableByteArray(bArr, i11));
        }
        return true;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (this.bytesUntilMetadata == 0) {
            if (!readMetadata()) {
                return -1;
            }
            this.bytesUntilMetadata = this.metadataIntervalBytes;
        }
        int i13 = this.upstream.read(bArr, i11, Math.min(this.bytesUntilMetadata, i12));
        if (i13 != -1) {
            this.bytesUntilMetadata -= i13;
        }
        return i13;
    }

    public IcyDataSource(DataSource dataSource, int i11, Listener listener) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        this.upstream = dataSource;
        this.metadataIntervalBytes = i11;
        this.listener = listener;
        this.metadataLengthByteHolder = new byte[1];
        this.bytesUntilMetadata = i11;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }
}
