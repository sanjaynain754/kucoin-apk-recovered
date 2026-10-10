package p523p2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: p2.a */
/* JADX INFO: compiled from: ByteBufferUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43354a {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference<byte[]> f95737a = new AtomicReference<>();

    /* JADX INFO: renamed from: p2.a$a */
    /* JADX INFO: compiled from: ByteBufferUtil.java */
    public static class a extends InputStream {

        /* JADX INFO: renamed from: b */
        @NonNull
        public final ByteBuffer f95738b;

        /* JADX INFO: renamed from: c */
        public int f95739c = -1;

        @Override // java.io.InputStream
        public synchronized void mark(int i11) {
            this.f95739c = this.f95738b.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f95738b.hasRemaining()) {
                return this.f95738b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i11 = this.f95739c;
            if (i11 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f95738b.position(i11);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f95738b.remaining();
        }

        @Override // java.io.InputStream
        public long skip(long j11) throws IOException {
            if (!this.f95738b.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j11, available());
            ByteBuffer byteBuffer = this.f95738b;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        public a(@NonNull ByteBuffer byteBuffer) {
            this.f95738b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
            if (!this.f95738b.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i12, available());
            this.f95738b.get(bArr, i11, iMin);
            return iMin;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ByteBuffer m95476a(@NonNull File file) throws Throwable {
        Throwable th2;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th3) {
                    th2 = th3;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th2;
                    }
                    try {
                        randomAccessFile.close();
                        throw th2;
                    } catch (IOException unused4) {
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m95480e(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: p2.a$b */
    /* JADX INFO: compiled from: ByteBufferUtil.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f95740a;

        /* JADX INFO: renamed from: b */
        public final int f95741b;

        /* JADX INFO: renamed from: c */
        public final byte[] f95742c;

        public b(@NonNull byte[] bArr, int i11, int i12) {
            this.f95742c = bArr;
            this.f95740a = i11;
            this.f95741b = i12;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static ByteBuffer m95477b(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f95737a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i11 = inputStream.read(andSet);
            if (i11 < 0) {
                f95737a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
            byteArrayOutputStream.write(andSet, 0, i11);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static InputStream m95481f(@NonNull ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static b m95478c(@NonNull ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static byte[] m95479d(@NonNull ByteBuffer byteBuffer) {
        b bVarM95478c = m95478c(byteBuffer);
        if (bVarM95478c != null && bVarM95478c.f95740a == 0 && bVarM95478c.f95741b == bVarM95478c.f95742c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.position(0);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }
}
