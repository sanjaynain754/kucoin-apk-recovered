package androidx.media3.datasource;

import android.media.MediaDataSource;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(23)
@UnstableApi
public class MediaDataSourceAdapter extends BaseDataSource {
    private long bytesRemaining;
    private final MediaDataSource mediaDataSource;
    private boolean opened;
    private long position;

    @Nullable
    private Uri uri;

    @Override // androidx.media3.datasource.DataSource
    public void close() throws IOException {
        this.uri = null;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        this.position = dataSpec.position;
        transferInitializing(dataSpec);
        if (this.mediaDataSource.getSize() != -1 && this.position > this.mediaDataSource.getSize()) {
            throw new DataSourceException(2008);
        }
        if (this.mediaDataSource.getSize() == -1) {
            this.bytesRemaining = -1L;
        } else {
            this.bytesRemaining = this.mediaDataSource.getSize() - this.position;
        }
        long jMin = dataSpec.length;
        if (jMin != -1) {
            long j11 = this.bytesRemaining;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.bytesRemaining = jMin;
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j12 = dataSpec.length;
        return j12 != -1 ? j12 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws DataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.bytesRemaining;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            i12 = (int) Math.min(j11, i12);
        }
        try {
            int at2 = this.mediaDataSource.readAt(this.position, bArr, i11, i12);
            if (at2 == -1) {
                return -1;
            }
            long j12 = at2;
            this.position += j12;
            long j13 = this.bytesRemaining;
            if (j13 != -1) {
                this.bytesRemaining = j13 - j12;
            }
            bytesTransferred(at2);
            return at2;
        } catch (IOException e11) {
            throw new DataSourceException(e11, 2000);
        }
    }

    public MediaDataSourceAdapter(MediaDataSource mediaDataSource, boolean z11) {
        super(z11);
        this.mediaDataSource = mediaDataSource;
    }
}
