package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSink;
import androidx.media3.datasource.DataSpec;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class CacheDataSink implements DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static final long MIN_RECOMMENDED_FRAGMENT_SIZE = 2097152;
    private static final String TAG = "CacheDataSink";
    private final int bufferSize;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private final Cache cache;

    @Nullable
    private DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private long dataSpecFragmentSize;

    @Nullable
    private File file;
    private final long fragmentSize;

    @Nullable
    private OutputStream outputStream;
    private long outputStreamBytesWritten;

    public static final class Factory implements DataSink.Factory {
        private Cache cache;
        private long fragmentSize = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
        private int bufferSize = CacheDataSink.DEFAULT_BUFFER_SIZE;

        @Override // androidx.media3.datasource.DataSink.Factory
        public DataSink createDataSink() {
            return new CacheDataSink((Cache) Assertions.checkNotNull(this.cache), this.fragmentSize, this.bufferSize);
        }

        @CanIgnoreReturnValue
        public Factory setBufferSize(int i11) {
            this.bufferSize = i11;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setCache(Cache cache) {
            this.cache = cache;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setFragmentSize(long j11) {
            this.fragmentSize = j11;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j11) {
        this(cache, j11, DEFAULT_BUFFER_SIZE);
    }

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(Cache cache, long j11, int i11) {
        Assertions.checkState(j11 > 0 || j11 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j11 != -1 && j11 < 2097152) {
            Log.m2961w(TAG, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.cache = (Cache) Assertions.checkNotNull(cache);
        this.fragmentSize = j11 == -1 ? Long.MAX_VALUE : j11;
        this.bufferSize = i11;
    }

    private void closeCurrentOutputStream() throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            File file = (File) Util.castNonNull(this.file);
            this.file = null;
            this.cache.commitFile(file, this.outputStreamBytesWritten);
        } catch (Throwable th2) {
            Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            File file2 = (File) Util.castNonNull(this.file);
            this.file = null;
            file2.delete();
            throw th2;
        }
    }

    private void openNextOutputStream(DataSpec dataSpec) throws IOException {
        long j11 = dataSpec.length;
        this.file = this.cache.startFile((String) Util.castNonNull(dataSpec.key), dataSpec.position + this.dataSpecBytesWritten, j11 != -1 ? Math.min(j11 - this.dataSpecBytesWritten, this.dataSpecFragmentSize) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.file);
        if (this.bufferSize > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
            if (reusableBufferedOutputStream == null) {
                this.bufferedOutputStream = new ReusableBufferedOutputStream(fileOutputStream, this.bufferSize);
            } else {
                reusableBufferedOutputStream.reset(fileOutputStream);
            }
            this.outputStream = this.bufferedOutputStream;
        } else {
            this.outputStream = fileOutputStream;
        }
        this.outputStreamBytesWritten = 0L;
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() throws CacheDataSinkException {
        if (this.dataSpec == null) {
            return;
        }
        try {
            closeCurrentOutputStream();
        } catch (IOException e11) {
            throw new CacheDataSinkException(e11);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(DataSpec dataSpec) throws CacheDataSinkException {
        Assertions.checkNotNull(dataSpec.key);
        if (dataSpec.length == -1 && dataSpec.isFlagSet(2)) {
            this.dataSpec = null;
            return;
        }
        this.dataSpec = dataSpec;
        this.dataSpecFragmentSize = dataSpec.isFlagSet(4) ? this.fragmentSize : Long.MAX_VALUE;
        this.dataSpecBytesWritten = 0L;
        try {
            openNextOutputStream(dataSpec);
        } catch (IOException e11) {
            throw new CacheDataSinkException(e11);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i11, int i12) throws CacheDataSinkException {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec == null) {
            return;
        }
        int i13 = 0;
        while (i13 < i12) {
            try {
                if (this.outputStreamBytesWritten == this.dataSpecFragmentSize) {
                    closeCurrentOutputStream();
                    openNextOutputStream(dataSpec);
                }
                int iMin = (int) Math.min(i12 - i13, this.dataSpecFragmentSize - this.outputStreamBytesWritten);
                ((OutputStream) Util.castNonNull(this.outputStream)).write(bArr, i11 + i13, iMin);
                i13 += iMin;
                long j11 = iMin;
                this.outputStreamBytesWritten += j11;
                this.dataSpecBytesWritten += j11;
            } catch (IOException e11) {
                throw new CacheDataSinkException(e11);
            }
        }
    }
}
