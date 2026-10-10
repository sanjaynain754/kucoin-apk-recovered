package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.Sets;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class FileDescriptorDataSource extends BaseDataSource {
    private static final Set<FileDescriptor> inUseFileDescriptors = Sets.newConcurrentHashSet();
    private long bytesRemaining;
    private final FileDescriptor fileDescriptor;

    @Nullable
    private FileInputStream inputStream;
    private final long length;
    private final long offset;
    private boolean opened;

    @Nullable
    private Uri uri;

    public FileDescriptorDataSource(FileDescriptor fileDescriptor, long j11, long j12) {
        super(false);
        this.fileDescriptor = (FileDescriptor) Assertions.checkNotNull(fileDescriptor);
        this.offset = j11;
        this.length = j12;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws DataSourceException {
        this.uri = null;
        inUseFileDescriptors.remove(this.fileDescriptor);
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.inputStream = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (IOException e11) {
                throw new DataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th2;
        }
    }

    private static void seekFileDescriptor(FileDescriptor fileDescriptor, long j11) throws DataSourceException {
        try {
            Os.lseek(fileDescriptor, j11, OsConstants.SEEK_SET);
        } catch (ErrnoException e11) {
            throw new DataSourceException(e11, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException {
        try {
            this.uri = dataSpec.uri;
            transferInitializing(dataSpec);
            if (!inUseFileDescriptors.add(this.fileDescriptor)) {
                throw new DataSourceException(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j11 = this.length;
            if (j11 != -1 && dataSpec.position > j11) {
                throw new DataSourceException(2008);
            }
            seekFileDescriptor(this.fileDescriptor, this.offset + dataSpec.position);
            FileInputStream fileInputStream = new FileInputStream(this.fileDescriptor);
            this.inputStream = fileInputStream;
            long j12 = this.length;
            if (j12 == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.bytesRemaining = jPosition;
                    if (jPosition < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            } else {
                long j13 = j12 - dataSpec.position;
                this.bytesRemaining = j13;
                if (j13 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = dataSpec.length;
            if (jMin != -1) {
                long j14 = this.bytesRemaining;
                if (j14 != -1) {
                    jMin = Math.min(j14, jMin);
                }
                this.bytesRemaining = jMin;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j15 = dataSpec.length;
            return j15 != -1 ? j15 : this.bytesRemaining;
        } catch (DataSourceException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new DataSourceException(e12, e12 instanceof FileNotFoundException ? 2005 : 2000);
        }
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
            int i13 = ((FileInputStream) Util.castNonNull(this.inputStream)).read(bArr, i11, i12);
            if (i13 == -1) {
                return -1;
            }
            long j12 = this.bytesRemaining;
            if (j12 != -1) {
                this.bytesRemaining = j12 - ((long) i13);
            }
            bytesTransferred(i13);
            return i13;
        } catch (IOException e11) {
            throw new DataSourceException(e11, 2000);
        }
    }
}
