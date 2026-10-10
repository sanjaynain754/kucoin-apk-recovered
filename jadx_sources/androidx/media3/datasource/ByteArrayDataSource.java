package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;

    @Nullable
    private byte[] data;
    private boolean opened;
    private int readPosition;

    @Nullable
    private Uri uri;
    private final UriResolver uriResolver;

    public interface UriResolver {
        byte[] resolve(Uri uri) throws IOException;
    }

    public ByteArrayDataSource(final byte[] bArr) {
        this(new UriResolver() { // from class: androidx.media3.datasource.a
            @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
            public final byte[] resolve(Uri uri) {
                return ByteArrayDataSource.m2985b(bArr, uri);
            }
        });
        Assertions.checkArgument(bArr.length > 0);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
        this.data = null;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.bytesRemaining;
        if (i13 == 0) {
            return -1;
        }
        int iMin = Math.min(i12, i13);
        System.arraycopy(Assertions.checkStateNotNull(this.data), this.readPosition, bArr, i11, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    public ByteArrayDataSource(UriResolver uriResolver) {
        super(false);
        this.uriResolver = (UriResolver) Assertions.checkNotNull(uriResolver);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        Uri uri = dataSpec.uri;
        this.uri = uri;
        byte[] bArrResolve = this.uriResolver.resolve(uri);
        this.data = bArrResolve;
        long j11 = dataSpec.position;
        if (j11 <= bArrResolve.length) {
            this.readPosition = (int) j11;
            int length = bArrResolve.length - ((int) j11);
            this.bytesRemaining = length;
            long j12 = dataSpec.length;
            if (j12 != -1) {
                this.bytesRemaining = (int) Math.min(length, j12);
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j13 = dataSpec.length;
            if (j13 != -1) {
                return j13;
            }
            return this.bytesRemaining;
        }
        throw new DataSourceException(2008);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ byte[] m2985b(byte[] bArr, Uri uri) {
        return bArr;
    }
}
