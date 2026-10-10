package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser$SeekableInputReader;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(30)
@SuppressLint({"Override"})
@UnstableApi
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;

    @Nullable
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j11 = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j11;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = ((DataReader) Util.castNonNull(this.dataReader)).read(bArr, i11, i12);
        this.currentPosition += (long) i13;
        return i13;
    }

    public void seekToPosition(long j11) {
        this.lastSeekPosition = j11;
    }

    public void setCurrentPosition(long j11) {
        this.currentPosition = j11;
    }

    public void setDataReader(DataReader dataReader, long j11) {
        this.dataReader = dataReader;
        this.resourceLength = j11;
        this.lastSeekPosition = -1L;
    }
}
