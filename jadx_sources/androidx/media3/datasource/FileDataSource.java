package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class FileDataSource extends BaseDataSource {
    private long bytesRemaining;

    @Nullable
    private RandomAccessFile file;
    private boolean opened;

    @Nullable
    private Uri uri;

    public static final class Factory implements DataSource.Factory {

        @Nullable
        private TransferListener listener;

        @Override // androidx.media3.datasource.DataSource.Factory
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }

        @CanIgnoreReturnValue
        public Factory setListener(@Nullable TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(Throwable th2, int i11) {
            super(th2, i11);
        }

        public FileDataSourceException(@Nullable String str, @Nullable Throwable th2, int i11) {
            super(str, th2, i11);
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws FileDataSourceException {
        this.uri = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.file = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (IOException e11) {
                throw new FileDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.file = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th2;
        }
    }

    private static RandomAccessFile openLocalFile(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) Assertions.checkNotNull(uri.getPath()), "r");
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, 1004);
        } catch (SecurityException e12) {
            throw new FileDataSourceException(e12, 2006);
        } catch (RuntimeException e13) {
            throw new FileDataSourceException(e13, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.uri;
        this.uri = uri;
        transferInitializing(dataSpec);
        RandomAccessFile randomAccessFileOpenLocalFile = openLocalFile(uri);
        this.file = randomAccessFileOpenLocalFile;
        try {
            randomAccessFileOpenLocalFile.seek(dataSpec.position);
            long length = dataSpec.length;
            if (length == -1) {
                length = this.file.length() - dataSpec.position;
            }
            this.bytesRemaining = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (IOException e11) {
            throw new FileDataSourceException(e11, 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i11, int i12) throws FileDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int i13 = ((RandomAccessFile) Util.castNonNull(this.file)).read(bArr, i11, (int) Math.min(this.bytesRemaining, i12));
            if (i13 > 0) {
                this.bytesRemaining -= (long) i13;
                bytesTransferred(i13);
            }
            return i13;
        } catch (IOException e11) {
            throw new FileDataSourceException(e11, 2000);
        }
    }
}
