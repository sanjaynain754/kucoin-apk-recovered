package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class DataChunk extends Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public abstract void consume(byte[] bArr, int i11) throws IOException;

    private void maybeExpandData(int i11) {
        byte[] bArr = this.data;
        if (bArr.length < i11 + 16384) {
            this.data = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() throws IOException {
        try {
            this.dataSource.open(this.dataSpec);
            int i11 = 0;
            int i12 = 0;
            while (i11 != -1 && !this.loadCanceled) {
                maybeExpandData(i12);
                i11 = this.dataSource.read(this.data, i12, 16384);
                if (i11 != -1) {
                    i12 += i11;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, i12);
            }
        } finally {
            DataSourceUtil.closeQuietly(this.dataSource);
        }
    }

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int i11, Format format, int i12, @Nullable Object obj, @Nullable byte[] bArr) {
        byte[] bArr2;
        super(dataSource, dataSpec, i11, format, i12, obj, C2711C.TIME_UNSET, C2711C.TIME_UNSET);
        if (bArr == null) {
            bArr2 = Util.EMPTY_BYTE_ARRAY;
        } else {
            bArr2 = bArr;
        }
        this.data = bArr2;
    }
}
